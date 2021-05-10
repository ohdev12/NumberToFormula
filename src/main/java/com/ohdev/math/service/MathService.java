package com.ohdev.math.service;

import com.ohdev.math.domain.LevelTwo;
import com.ohdev.math.repository.MathRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public class MathService {
    private final MathRepository mathRepository;

    public MathService(MathRepository mathRepository) {
        this.mathRepository = mathRepository;
    }

    public String findFormula(long number) {
        String unit = "DB에 값이 없습니다.";
        Optional<LevelTwo> result = mathRepository.findById(number);
        if(result.isPresent()) {
            unit = result.get().getUnit();
        }
        return unit;
    }
}
