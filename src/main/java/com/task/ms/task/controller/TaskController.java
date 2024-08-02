package com.task.ms.task.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.task.ms.task.dto.TaskDto;
import com.task.ms.task.service.TaskServiceImplement;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value =("/api/task"))
public class TaskController  implements TaskApi{
	private final TaskServiceImplement taskService;
	
	@Override
	public TaskDto save(TaskDto request) {
		return taskService.addTask(request);
	}
}
