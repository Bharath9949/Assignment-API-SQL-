package com.psglobal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.psglobal.entities.InterestRate;

public interface InterestRateRepository extends JpaRepository<InterestRate, Long> {
	@Query("SELECT ir From InterestRate ir WHERE ir.fromAmount<= :amount AND ir.toAmount>= :amount AND ir.fromYears<= :years AND ir.toYears >= :years")
	public InterestRate getInterestRate(@Param("amount") Long amount, @Param("years") int years);
}
