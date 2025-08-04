package br.com.lebilotta.demo_springai_groq.entities;

public class ChatOutput {

    private final String response;

    public ChatOutput(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
