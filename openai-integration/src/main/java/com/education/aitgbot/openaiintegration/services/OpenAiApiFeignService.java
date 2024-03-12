package com.education.aitgbot.openaiintegration.services;


import com.education.aitgbot.openaiintegration.dtos.openai.OpenAiChatCompletionRequest;
import com.education.aitgbot.openaiintegration.dtos.openai.OpenAiChatCompletionResponse;
import com.education.aitgbot.openaiintegration.integrations.OpenAiFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class OpenAiApiFeignService {
    private final OpenAiFeignClient openAiFeignClient;
    @Value("${openai.api-key}")
    private String openAiKey;

    public OpenAiChatCompletionResponse generateText(String text) {
        OpenAiChatCompletionRequest request = OpenAiChatCompletionRequest.makeRequest(text);
        return openAiFeignClient.generate(openAiKey, request);
    }

}
