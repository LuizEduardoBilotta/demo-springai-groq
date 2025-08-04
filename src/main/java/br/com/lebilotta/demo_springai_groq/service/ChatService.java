package br.com.lebilotta.demo_springai_groq.service;

import br.com.lebilotta.demo_springai_groq.entities.ChatInput;
import br.com.lebilotta.demo_springai_groq.entities.ChatOutput;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ChatService {

    @Value("classpath:/prompt/promptTemplate.st")
    private Resource resource;

    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public ChatOutput sendMessage(ChatInput chatInput) {

        var promptTemplate = PromptTemplate.builder()
                .resource(resource)
                .build();

        var prompt = promptTemplate.render(Map.of("message", chatInput.getMessage()));

        var response = this.chatClient.prompt()
                .user(prompt)
                .call()
                .content();

        return new ChatOutput(response);
    }
}
