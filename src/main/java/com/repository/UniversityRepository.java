package com.repository;

import com.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long> {
		List<University> findByNameContainingIgnoreCase(String keyword);
}
