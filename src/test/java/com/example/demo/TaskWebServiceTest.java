package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.TaskWebService.Task;

public class TaskWebServiceTest {

    @Test
    public void testListTask() {
    	
        TaskWebService taskManager = new TaskWebService();
        
       
        List<Task> tasks = taskManager.listTask();
        
        
    }

    @Test
    public void testAddTask() {
    	
        TaskWebService taskManager = new TaskWebService();
        List<Task> tasksBeforeAdding = taskManager.listTask();
        Task newTask = new Task("Yeni görev");
        

        taskManager.addTask(newTask);
        
     
    }
}