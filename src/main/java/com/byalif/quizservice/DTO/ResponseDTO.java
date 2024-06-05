package com.byalif.quizservice.DTO;

import java.util.List;

public class ResponseDTO {
    private List<QuestionDTO> questions;

    public List<QuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDTO> questions) {
        this.questions = questions;
    }
}
