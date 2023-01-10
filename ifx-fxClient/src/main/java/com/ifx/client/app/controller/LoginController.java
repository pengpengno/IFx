package com.ifx.client.app.controller;


import com.ifx.account.vo.AccountBaseInfo;
import com.ifx.client.service.ClientService;
import com.ifx.client.service.helper.AccountHelper;
import com.ifx.client.util.SpringFxmlLoader;
import com.ifx.common.base.AccountInfo;
import com.ifx.common.context.AccountContext;
import com.ifx.connect.connection.client.ClientAction;
import com.ifx.connect.connection.client.ClientDomainHelper;
import com.ifx.connect.proto.Protocol;
import com.ifx.connect.proto.parse.ProtocolResultParser;
import com.ifx.connect.task.handler.TaskHandler;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.URL;
import java.util.ResourceBundle;


@Component
@Slf4j
public class LoginController  implements Initializable {


    @FXML
    private Label account;

    @FXML
    private TextField accountField;

    @FXML
    private CheckBox autoLoginCheckBox;

    @FXML
    private Button canel;

    @FXML
    private ImageView iconView;

    @FXML
    private Button loginBut;

    @FXML
    private VBox loginFrame;

    @FXML
    private AnchorPane loginPane;

    @FXML
    private Label password;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label registerAccount;

    @FXML
    private CheckBox remberPsdCheckBox;

    @Resource(name = "netty")
    private ClientAction clientAction;


    @Resource
    private AccountHelper accountHelper;

    @Resource
    private ClientService clientService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        passwordField.setText("wangpeng");
        accountField.setText("wangpeng");
        log.info ("initialing login controller ");
    }

    @FXML
    public void login(MouseEvent event) {
        AccountBaseInfo accountBaseInfo = new AccountBaseInfo();
        accountBaseInfo.setAccount( accountField.getText());
        accountBaseInfo.setPassword(passwordField.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("登录状态");
        alert.contentTextProperty().addListener((a1,a2,a3)-> {
            alert.show();
        });
        TaskHandler taskHandler = protocol -> {
            AccountInfo accountInfo = ProtocolResultParser.getDataAsT(protocol, AccountInfo.class);
            if (accountInfo == null){
                log.warn("登录失败！");
                return;
            }
            log.debug("login status {}",accountInfo);
            AccountContext.setCurAccount(accountInfo);
            log.debug("login success ");
            hide();
            MainController.show();
        };
        log.info("启动登录");
        Protocol login = AccountHelper.applyLogins(accountBaseInfo);
        ClientDomainHelper.getDefaultClientAction().sendJsonMsg(login,taskHandler);
    }


    @FXML
    void cancelLogin(MouseEvent event) {
        log.info("正在关闭客户端程序-----");
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void toRegister(MouseEvent event)   {
        RegisterController.show();
    }
    public static void show(){
        Stage stage = SpringFxmlLoader.applySinStage("com\\ifx\\client\\app\\fxml\\login.fxml");
        log.debug("prepare to show  register");
        stage.show();
        stage.setTitle("注册");
    }

    public static  void hide(){
        Stage stage = SpringFxmlLoader.applySinStage("com\\ifx\\client\\app\\fxml\\login.fxml");
        log.debug("隐藏数据");
        stage.hide();
    }


}
