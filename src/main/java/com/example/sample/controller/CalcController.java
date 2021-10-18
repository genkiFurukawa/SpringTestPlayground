package com.example.sample.controller;

import com.example.sample.controller.dto.request.CalcRequest;
import com.example.sample.controller.dto.response.CalcResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@Slf4j
public class CalcController {
    @PostMapping(value = "calc")
    public CalcResponse calc(@Validated @RequestBody CalcRequest calcRequest, HttpServletResponse httpServletResponse) {
        if (!calcRequest.getOperator().equals("+")) {
            httpServletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return null;
        }

        return new CalcResponse(calcRequest.getLeftSide() + calcRequest.getRightSide());
    }
}
