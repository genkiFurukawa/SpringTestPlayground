package com.example.sample.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalcRequest {
    private double leftSide;
    private double rightSide;
    private String operator;
}
