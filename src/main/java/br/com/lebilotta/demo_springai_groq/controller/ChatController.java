package br.com.lebilotta.demo_springai_groq.controller;

import br.com.lebilotta.demo_springai_groq.entities.ChatInput;
import br.com.lebilotta.demo_springai_groq.entities.ChatOutput;
import br.com.lebilotta.demo_springai_groq.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public ResponseEntity<ChatOutput> generate(@RequestBody ChatInput chatInput) {

        var response = service.sendMessage(chatInput);
        return ResponseEntity.ok().body(response);
    }
}
