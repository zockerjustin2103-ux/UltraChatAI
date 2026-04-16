package com.example.chat;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private List<String> messages = new ArrayList<>();

    // Nachricht senden
    @PostMapping("/send")
    public String sendMessage(@RequestBody String msg) {
        messages.add(msg);
        return "Gesendet: " + msg;
    }

    // Alle Nachrichten holen
    @GetMapping("/all")
    public List<String> getMessages() {
        return messages;
    }
}
