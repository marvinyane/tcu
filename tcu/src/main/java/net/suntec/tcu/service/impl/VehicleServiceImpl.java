package net.suntec.tcu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.suntec.tcu.dao.VehicleDao;
import net.suntec.tcu.entity.Vehicle;
import net.suntec.tcu.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	private VehicleDao vehicleDao;

	public List<Vehicle> getList() {
		return vehicleDao.queryAll(0, 10);
	}

}
