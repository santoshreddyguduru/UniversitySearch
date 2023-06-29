package com.controller;

import com.entity.University;
import com.repository.UniversityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {
		private final UniversityRepository universityRepository;

		public UniversityController(UniversityRepository universityRepository) {
				this.universityRepository = universityRepository;
		}

		@GetMapping("/search")
		public List<University> searchUniversities(@RequestParam("keyword") String keyword) {
				return universityRepository.findByNameContainingIgnoreCase(keyword);
		}
}
