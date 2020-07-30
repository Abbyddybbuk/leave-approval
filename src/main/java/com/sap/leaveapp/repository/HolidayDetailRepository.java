package com.sap.leaveapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sap.leaveapp.model.HolidayDetail;

@Repository
public interface HolidayDetailRepository extends JpaRepository<HolidayDetail, String> {
	@Query("SELECT i FROM HolidayDetail i WHERE i.year = :year")
	public List<HolidayDetail> findByYear(@Param("year") String year);
}
