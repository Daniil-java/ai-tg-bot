package com.education.aitgbot.openaiintegration.integrations;

import com.education.aitgbot.openaiintegration.dtos.openai.OpenAiChatCompletionRequest;
import com.education.aitgbot.openaiintegration.dtos.openai.OpenAiChatCompletionResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        value = "open-ai-feign-client",
        url = "https://api.openai.com/v1/"
)
public interface OpenAiFeignClient {
    @PostMapping("chat/completions")
    OpenAiChatCompletionResponse generate(@RequestHeader("Authorization") String key,
                                          @RequestBody OpenAiChatCompletionRequest request);

}
