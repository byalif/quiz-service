package com.byalif.quizservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ErrorDto {

	public String message;
	
    public ErrorDto(String message) {
		this.message = message;
	} 

}