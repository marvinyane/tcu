package net.suntec.tcu.dao;

import java.util.List;

import net.suntec.tcu.entity.ProbeData;
import net.suntec.tcu.entity.Vehicle;

public interface ProbeDao {
	
	/**
	 * get vehicle probe data
	 * 
	 * @param serialNumber
	 * @return
	 */
	List<ProbeData> getVehicleProbe(Vehicle v);
}
