package com.soffy.backend.solution;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SolutionService {
  private final SolutionRepository solutionRepository;

  public SolutionService(SolutionRepository solutionRepository) {
    this.solutionRepository = solutionRepository;
  }

  public List<Solution> getAllSolutions() {
    return solutionRepository.findAll();
  }

  public Solution saveSolution(Solution solution) {
    return solutionRepository.save(solution);
  }
}
