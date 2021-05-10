package com.ohdev.math.repository;

import com.ohdev.math.domain.LevelTwo;

import java.util.Optional;

public interface MathRepository {
    Optional<LevelTwo> findById(Long id);
}
