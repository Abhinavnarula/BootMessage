package com.example.demo.sample;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private List<String> messages;

    @PostConstruct
    public void postConnstruct() {
        System.out.println(">> MessageService Bean created.");
        this.messages = new ArrayList<>();
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return new ArrayList<>(this.messages);
    }

}
