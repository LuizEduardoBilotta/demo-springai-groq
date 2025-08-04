package br.com.lebilotta.demo_springai_groq.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Validated
@Configuration
@ConfigurationProperties(prefix = "chat")
public class ChatClientProperties {

    @NotNull(message = "O campo base-url não pode ser nulo")
    private String baseUrl;

    @NotNull(message = "O campo api-key não pode ser nulo")
    private String apiKey;

    @NotNull(message = "O campo model não pode ser nulo")
    private String model;

    @NotNull(message = "O campo max-tokens não pode ser nulo")
    private Integer maxTokens;

    @NotNull(message = "O campo temperature não pode ser nulo")
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
