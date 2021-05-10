package com.ohdev.math.controller;

import com.ohdev.math.service.MathService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("math")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/getFormula")
    public String getFormula() {
        return "math/getFormula";
    }

    @PostMapping("/getFormula")
    @ResponseBody
    public Map<String, String> getFormula(String number) {

        // DB에서 숫자 가져오기
        String formula = mathService.findFormula(Long.parseLong(number));

        Map<String, String> result = new HashMap<>();
        result.put("result", formula); // "lim (e^(2x)-1)/(x-x^2) as x->0"
        return result;
    }

}
