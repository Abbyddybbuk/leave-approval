package com.sap.leaveapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.leaveapp.model.HolidayDetail;
import com.sap.leaveapp.repository.HolidayDetailRepository;

@Service
public class LeaveAppService {

	private HolidayDetailRepository holidayRepo;

	@Autowired
	public LeaveAppService(HolidayDetailRepository holidayRepo) {
		this.holidayRepo = holidayRepo;
	}

	public List<HolidayDetail> createHoliday(List<HolidayDetail> holidayDetail) {
		return this.holidayRepo.saveAll(holidayDetail);
	}

	public List<HolidayDetail> readHoliday() {
		return this.holidayRepo.findAll();
	}
}
