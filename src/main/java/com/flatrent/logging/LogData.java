package com.flatrent.logging;

import java.util.LinkedHashMap;

import lombok.Builder;

@Builder
public class LogData {
	private String requestId;
	private String action;
	private Boolean success;
	private String customizedErrorMessage;
	private String message;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("RequestId: ", requestId == null ? "no-span" : requestId);
		map.put("Action: ", action);
		map.put("Success: ", success != null ? success.toString() : null);
		map.put("Error: ", customizedErrorMessage);
		map.put("Message: ", message);

		map.entrySet().stream()
				.filter(entry -> entry.getValue() != null)
				.forEach(entry -> {
					sb.append(entry.getKey());
					sb.append(entry.getValue());
					sb.append(" | ");
				});

		return sb.toString();
	}
}
