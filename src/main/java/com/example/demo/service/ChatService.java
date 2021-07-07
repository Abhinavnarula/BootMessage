package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.demo.model.ChatForm;
import com.example.demo.model.ChatMessage;

import org.springframework.stereotype.Service;


@Service
public class ChatService {
    
    private List<ChatMessage> chatMessages;

    @PostConstruct
    public void postConstruct() {
        chatMessages = new ArrayList<ChatMessage>();
        System.out.println(">> in ChatController");
    }

    public List<ChatMessage> getChatMessages(){
        return chatMessages;
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());

        switch(chatForm.getMessageType()) {
            case "Say":
                newMessage.setMessage(chatForm.getMessageInput());
                break;
            case "Shout":
                newMessage.setMessage(chatForm.getMessageInput().toUpperCase());
                break;
            case "Whisper":
                newMessage.setMessage(chatForm.getMessageInput().toLowerCase());
                break;
        }

        chatMessages.add(newMessage);
    }

}
