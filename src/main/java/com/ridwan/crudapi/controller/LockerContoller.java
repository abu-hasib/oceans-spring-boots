package com.ridwan.crudapi.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ridwan.crudapi.locker.Locker;
import com.ridwan.crudapi.service.LockerService;

@RestController
@RequestMapping("locker")
public class LockerContoller {
	@Autowired
	LockerService lockerService;
	
	@GetMapping
	public ResponseEntity<Collection<Locker>> getUsers() {

		return new ResponseEntity<>(lockerService.getLockers(), HttpStatus.OK);
	}
}
