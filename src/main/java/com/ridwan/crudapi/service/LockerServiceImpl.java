package com.ridwan.crudapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ridwan.crudapi.locker.Locker;
import com.ridwan.crudapi.user.User;

@Service
public class LockerServiceImpl implements LockerService {
	Map<String, Locker> lockers;
	
	@Override
	public List<Locker> getLockers() {
		List<Locker> lockers = new ArrayList<>();
		
		lockers.add(new Locker("Lekki","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Lekki","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Lekki","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Lekki","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Ikeja", "Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Ikeja","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Ikeja","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Ikeja","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		lockers.add(new Locker("Ikeja","Small H295*W460*D520M", "450 per/mo N15000 XX no of orders Online only Price", "1N for First Rent", "2 available"));
		
		return lockers;
	}
}
