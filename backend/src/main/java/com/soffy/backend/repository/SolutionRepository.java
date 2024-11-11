package com.soffy.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soffy.backend.entity.Solution;

@Repository
public interface SolutionRepository extends JpaRepository<Solution, Long> {}
