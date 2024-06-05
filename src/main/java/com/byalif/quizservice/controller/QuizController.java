package com.byalif.quizservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byalif.quizservice.DTO.Question;
import com.byalif.quizservice.entity.Quiz;
import com.byalif.quizservice.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	QuizService quizService;

	@PostMapping("/create/newQuiz/{name}")
	public ResponseEntity<Quiz> createQuiz(String username,
			@PathVariable String name, @RequestBody List<Question> questions) throws Exception{
		return quizService.generateQuiz(name, questions);
	}
	
	
    public String fallback() {
    	return "Question service down";
    }
    
}
