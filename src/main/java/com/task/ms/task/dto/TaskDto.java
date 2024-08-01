package com.task.ms.task.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TaskDto {

	private Integer id;
	private String title;
	private String description;
	private String status;
	
}
