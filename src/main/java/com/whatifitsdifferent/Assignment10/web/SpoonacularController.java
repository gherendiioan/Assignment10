package com.whatifitsdifferent.Assignment10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatifitsdifferent.Assignment10.dto.DayResponse;
import com.whatifitsdifferent.Assignment10.dto.WeekResponse;

@RestController
public class SpoonacularController {
	
	@GetMapping("mealplanner/week")

	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		
		return null;
		
	}
	
	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
		
		return null;
		
	}
	

}
