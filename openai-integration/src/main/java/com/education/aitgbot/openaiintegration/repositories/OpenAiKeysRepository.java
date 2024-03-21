package com.education.aitgbot.openaiintegration.repositories;

import com.education.aitgbot.openaiintegration.entities.OpenAiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenAiKeysRepository extends JpaRepository<OpenAiKey, Long> {
}
