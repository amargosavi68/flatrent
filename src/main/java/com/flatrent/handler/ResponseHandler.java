package com.flatrent.handler;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseHandler<T> {
	private T data;
	private HttpStatus statusCode;
	private ApiError apiError;
}
