package com.byalif.quizservice.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Quiz {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public Long id;
	
	public String name;

	@ElementCollection
	public List<Integer> questionIds;
	
	public Quiz(List<Integer> ids, String name) {
		this.questionIds = ids;
		this. name = name;
	}
}
