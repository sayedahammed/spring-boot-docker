package com.devsayed.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "messages")
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @CreatedDate
    private Timestamp timestamp;

    public Message(String text, Timestamp timestamp) {
        this.text = text;
        this.timestamp = timestamp;
    }
}
