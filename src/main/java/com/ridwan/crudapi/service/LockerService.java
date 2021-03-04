package com.ridwan.crudapi.service;

import java.util.Collection;

import com.ridwan.crudapi.locker.Locker;

public interface LockerService {
	Collection<Locker> getLockers();
}
