package com.education.aitgbot.openaiintegration.services;

import com.education.aitgbot.openaiintegration.dtos.openai.Message;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OAIRequestService {
    private final OpenAiApiFeignService openAiApiFeignService;

    public Message generateText(String string) {
        return openAiApiFeignService.generateText(string).getChoices().get(0).getMessage();
    }
}
