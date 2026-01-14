package org.example.gym.repositories;

import org.example.gym.models.FitnessClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessClassRepository extends JpaRepository<FitnessClass, Long> {
}