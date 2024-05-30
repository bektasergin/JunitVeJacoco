package com.example.demo;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskWebService {
	
	public record Task (String nameTask) {}
	
	private static List<Task> TASKS = new ArrayList<>();
	static {
		TASKS.add(new Task("Dosyaları toplamak."));
		TASKS.add(new Task("Projeyi test etmek."));
	}
	
	@GetMapping("/")
	public List<Task> listTask(){
		return TASKS;
	}
	
	@PostMapping("/")
	public void addTask(@RequestBody Task newTask) {
		TASKS.add(newTask);
	}
	
}
