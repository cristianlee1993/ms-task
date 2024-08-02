package com.task.ms.task.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.ms.task.dto.TaskDto;
import com.task.ms.task.entity.Task;
import com.task.ms.task.mapper.TaskMapper;
import com.task.ms.task.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TaskServiceImplement implements TaskService{
	
	@Autowired
	private TaskRepository repository;
	
	@Autowired
	private TaskMapper mapper;
	
	@Override
	public TaskDto addTask(TaskDto task) {
		// TODO Auto-generated method stub
		log.info("add task request :{}", task);
		TaskDto taskDto = null;
		if (Objects.nonNull(task)) {
			Task saved = repository.save(mapper.toTask(task));
			
			if (Objects.nonNull(saved)) {
				taskDto = getTaskDto(task, taskDto);
			}
		}
		return taskDto;
	}
	
	private TaskDto getTaskDto (TaskDto task, TaskDto taskDto) {
		Task saved = repository.save(mapper.toTask(task));
		
		if (Objects.nonNull(saved)) {
			log.info("add task success: {}", saved);
			taskDto = mapper.toDto(saved);
		}
		return taskDto;
	}

	@Override
	public TaskDto updateTask(TaskDto task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskDto getTask(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaskDto> getTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTask(String id) {
		// TODO Auto-generated method stub
		
	}

	


}
