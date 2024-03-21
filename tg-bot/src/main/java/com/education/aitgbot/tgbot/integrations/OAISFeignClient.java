package com.education.aitgbot.tgbot.integrations;


import com.education.aitgbot.tgbot.dtos.MessageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        value = "o-a-i-s-feign-client",
        url = "http://localhost:8111/api/v1/"
)
public interface OAISFeignClient {
    @PostMapping("oai/gpt-3/request")
    MessageDto generate(@RequestBody String request);


}
