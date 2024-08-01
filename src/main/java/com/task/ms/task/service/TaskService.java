package com.task.ms.task.service;

import java.util.List;

import com.task.ms.task.dto.TaskDto;

public interface TaskService {
	
	TaskDto addTask(TaskDto task);
	TaskDto updateTask(TaskDto task);
	TaskDto getTask(String id);
	List<TaskDto> getTask();
	void deleteTask(String id);
	
}
