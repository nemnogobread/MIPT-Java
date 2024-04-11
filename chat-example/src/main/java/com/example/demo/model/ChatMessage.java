package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

import java.awt.*;

@Data
@Builder
public class ChatMessage {
    private long id;
    private String content;
    private String sender;
    private MessageType type;
}
