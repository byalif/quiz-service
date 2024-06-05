package com.byalif.quizservice.DTO;

import java.util.List;

public class QuestionDTO {
    public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public boolean isCustomText() {
		return customText;
	}
	public void setCustomText(boolean customText) {
		this.customText = customText;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	private String question;
    private boolean customText;
    private List<String> options;

    // Getters and setters
}
