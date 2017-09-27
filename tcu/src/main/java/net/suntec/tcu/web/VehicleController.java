package net.suntec.tcu.web;

import java.util.List;

import net.suntec.tcu.entity.Vehicle;
import net.suntec.tcu.service.VehicleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/vehicle")
public class VehicleController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private VehicleService vehicleService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private @ResponseBody List<Vehicle> list(Model model) {	
		List<Vehicle> list = vehicleService.getList();
	
		return list;
	}
}
