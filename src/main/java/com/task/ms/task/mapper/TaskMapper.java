package com.task.ms.task.mapper;

import org.mapstruct.Mapper;

import com.task.ms.task.dto.TaskDto;
import com.task.ms.task.entity.Task;

@Mapper
public interface TaskMapper {

	TaskDto toDto(Task task);
	Task toTask(TaskDto taskDto);
}
