package com.flatrent.logging;

import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.TraceContext;
import io.micrometer.tracing.Tracer;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class LogUtil {

	@Autowired
	private final Tracer tracer;
	
	public void logInfo(Logger log, Action action, String message) {
		String logMessage = LogData.builder()
				.requestId(getTraceId())
				.action(action.name())
				.message(message)
				.build()
				.toString();
		log.info(logMessage);
	}
	
	private String getTraceId() {
		return Optional.ofNullable(tracer.currentSpan())
				.map(Span::context)
				.map(TraceContext::traceId)
				.orElse("null");
	}
}
