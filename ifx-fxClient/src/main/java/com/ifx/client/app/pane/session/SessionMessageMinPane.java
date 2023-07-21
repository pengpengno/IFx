package com.ifx.client.app.pane.session;

import com.ifx.account.vo.session.SessionInfoVo;
import com.ifx.client.app.event.SessionEvent;
import com.ifx.client.app.pane.message.ChatMainPane;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SessionMessageMinPane extends Pane {

    private Label sessionNameLabel;

    private Label lastMessage;

    private Label unReadMessages;



    public SessionMessageMinPane (SessionInfoVo sessionInfoVo){

        if (sessionInfoVo == null){
            throw new IllegalArgumentException("Session is illegal!");
        }

        sessionNameLabel = new Label(sessionInfoVo.getSessionName());

        Font customFontBoldItalic = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20);

        sessionNameLabel.setStyle("-fx-text-fill: white;");

        sessionNameLabel.setFont(customFontBoldItalic);


        this.getChildren().add(sessionNameLabel);

        this.addEventHandler(MouseEvent.MOUSE_CLICKED,event -> {
            log.info("click sessionMinPane");
            SessionEvent sessionEvent = new SessionEvent(SessionEvent.SESSION_SWITCH, sessionInfoVo);

            ChatMainPane.getInstance().switchSessionEvent(sessionEvent);

        });

        this.setBackground(new Background(new BackgroundFill(Color.rgb(51,100,100),null,null)));


        this.setPrefHeight(100);
        this.setPrefWidth(190);
        this.setHeight(600);
        this.setWidth(190);


    }



}
