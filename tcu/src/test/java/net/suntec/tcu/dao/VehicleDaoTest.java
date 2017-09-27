package net.suntec.tcu.dao;

import net.suntec.tcu.entity.Vehicle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//鍛婅瘔junit spring閰嶇疆鏂囦欢
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class VehicleDaoTest {
	@Autowired
	private VehicleDao vehicleDao;

	@Test
	public void testQueryBySerialNumber() throws Exception {
		int serialNumber = 1000;
		Vehicle v = vehicleDao.queryBySerialNumber(serialNumber);
		System.out.println(v);
	}
}
