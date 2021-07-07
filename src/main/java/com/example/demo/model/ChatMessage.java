package com.example.demo.model;

public class ChatMessage {
    private int messageid;
    private String username;
    private String message;

    public int getMessageid() {
        return this.messageid;
    }

    public void setMessageid(int messageid) {
        this.messageid = messageid;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
