package com.byalif.quizservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byalif.quizservice.entity.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
