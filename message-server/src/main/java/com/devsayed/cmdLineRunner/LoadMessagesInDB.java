package com.devsayed.cmdLineRunner;

import com.devsayed.entity.Message;
import com.devsayed.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Component
@EnableJpaRepositories
@Transactional
@RequiredArgsConstructor
public class LoadMessagesInDB implements CommandLineRunner {
    private final MessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello World!", Timestamp.from(Instant.now())));
        messages.add(new Message("Hello Bangladesh!", Timestamp.from(Instant.now())));
        messages.add(new Message("Hello Dhaka!", Timestamp.from(Instant.now())));
        messages.add(new Message("Hello Chandpur!", Timestamp.from(Instant.now())));

        messageRepository.saveAll(messages);
        System.out.println("Loaded " + messages.size() + " messages");
    }
}
