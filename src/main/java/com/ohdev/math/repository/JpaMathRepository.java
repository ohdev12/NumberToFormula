package com.ohdev.math.repository;

import com.ohdev.math.domain.LevelTwo;

import javax.persistence.EntityManager;
import java.util.Optional;

public class JpaMathRepository implements MathRepository {

    private final EntityManager em;

    public JpaMathRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Optional<LevelTwo> findById(Long id) {
        return Optional.ofNullable(em.find(LevelTwo.class, id));
    }
}
