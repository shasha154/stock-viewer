package com.shasha.stock.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shasha.stock.dbservice.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {

	List<Quote> findByUserName(String username);

}
