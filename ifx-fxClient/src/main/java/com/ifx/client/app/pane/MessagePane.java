package com.ifx.client.app.pane;

import com.ifx.connect.proto.Chat;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;
@Slf4j
@Component
public class MessagePane extends Pane implements Initializable {

conflict

    private Chat.ChatMessage message;

    private Label fromAccount ;

    private MessagePane(){

    }

    private JFXTextField textField;

    MessagePane(Chat.ChatMessage message){
        this.message  = message ;
        fromAccount.setText(message.getContent());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        log.info("init message ");
    }
}
