package com.example.demo.controller;

import com.example.demo.model.ChatForm;
import com.example.demo.service.ChatService;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public String getChatPage(ChatForm chatForm, Model model) {
        model.addAttribute("ChatMessages", this.chatService.getChatMessages());
        return "chat";
    }

    @PostMapping
    public String postChatPage(Authentication authentication, ChatForm chatForm, Model model) {
        chatForm.setUsername(authentication.getName());
        this.chatService.addMessage(chatForm);
        chatForm.setMessageInput("");
        model.addAttribute("chatMessages", this.chatService.getChatMessages());
        return "chat";
    }

    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes() {
        return new String[] { "Say", "Shout", "Whisper" };
    }
}
