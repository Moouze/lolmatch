package com.moouze.lolmatch.repository;

import com.moouze.lolmatch.model.Champions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionsRepository extends JpaRepository<Champions, Long> {
}
