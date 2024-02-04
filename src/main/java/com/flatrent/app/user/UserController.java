package com.flatrent.app.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flatrent.logging.Action;
import com.flatrent.logging.LogUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
@RequiredArgsConstructor
public class UserController {
	
	private final LogUtil logUtil;
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> registerUser(@RequestBody String userRequest) {
		logUtil.logInfo(log, Action.POST, userRequest);
		return null;
	}
}
