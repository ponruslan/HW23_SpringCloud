package com.ponomarenko.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long movieId;
    private Long userId;
    private boolean liked;
    @Column(columnDefinition = "LONGTEXT")
    private String message;
}
