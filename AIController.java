package com.example.chat;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AIController {

    @PostMapping
    public String askAI(@RequestBody String message) {

        // Hier kannst du später OpenAI API einbauen
        return "AI Antwort auf: " + message;
    }
}
