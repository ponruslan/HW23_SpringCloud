package com.ponomarenko.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ReviewDto {
    private Long id;
    @JsonIgnore
    private Long movieId;

    private Long userId;
    private boolean liked;
    private String message;
}
