package com.sap.leaveapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sap.leaveapp.model.HolidayDetail;
import com.sap.leaveapp.service.LeaveAppService;

@RestController
public class LeaveAppController {

	private LeaveAppService leaveAppService;

	@Autowired
	public LeaveAppController(LeaveAppService leaveAppService) {
		this.leaveAppService = leaveAppService;
	}

	@RequestMapping(value = "/sap/leavecreate", method = RequestMethod.POST)
	public List<HolidayDetail> createHoldiay(@RequestBody List<HolidayDetail> holidayDetailList) {
		return leaveAppService.createHoliday(holidayDetailList);
	}
	
	@RequestMapping(value = "/sap/leavecreatehystrix", method = RequestMethod.POST)
	public List<HolidayDetail> createHoldiayHystrix(@RequestBody List<HolidayDetail> holidayDetailList) {
		return leaveAppService.createHoliday(holidayDetailList);
	}	
	
	@RequestMapping(value = "/sap/readAllData", method = RequestMethod.GET)
	public List<HolidayDetail> readHoldiayData() {
		return leaveAppService.readHoliday();
	}	
}
