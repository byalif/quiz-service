package com.byalif.quizservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.byalif.quizservice.DTO.Question;
import com.byalif.quizservice.entity.Quiz;
import com.byalif.quizservice.repository.QuizRepository;

@Service
public class QuizService {
	@Autowired
	QuizRepository quizRepository;

	
	public ResponseEntity<Quiz> generateQuiz(String name, List<Question> questions) {
		List<Integer> quizIds = questions.stream().map((question) -> question.id).toList();
		Quiz quiz = new Quiz(quizIds, name);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(quizRepository.save(quiz));
	}
	
	

}
