package net.suntec.tcu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.suntec.tcu.entity.Vehicle;

public interface VehicleDao {
	
	/**
	 * get vehicle info by serialNumber
	 * 
	 * @param serialNumber
	 * @return
	 */
	Vehicle queryBySerialNumber(int serialNumber);
	
	/**
	 * get all vehicle infos
	 * 
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Vehicle> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
