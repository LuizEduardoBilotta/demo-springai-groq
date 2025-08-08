package br.com.lebilotta.demo_springai_groq.config;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Validated
@Configuration
@ConfigurationProperties(prefix = "chat")
public class ChatClientProperties {

    @NotEmpty(message = "O campo base-url deve ser informado")
    private String baseUrl;

    @NotEmpty(message = "O campo api-key deve ser informado")
    private String apiKey;

    @NotEmpty(message = "O campo model deve ser informado")
    private String model;

    @NotNull(message = "O campo max-tokens deve ser informado")
    private Integer maxTokens;

    @NotNull(message = "O campo temperature deve ser informado")
    private Double temperature;

    public String getBaseUrl() { return baseUrl; }

    public void setBaseUrl(String baseUrl) { this.baseUrl = baseUrl; }

    public String getApiKey() { return apiKey; }

    public void setApiKey(String apiKey) { this.apiKey = apiKey; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public Integer getMaxTokens() { return maxTokens; }

    public void setMaxTokens(Integer maxTokens) { this.maxTokens = maxTokens; }

    public Double getTemperature() { return temperature; }

    public void setTemperature(Double temperature) { this.temperature = temperature; }
}
