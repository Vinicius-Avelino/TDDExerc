package com.devsuperior.bds02.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;

	@Transactional
	public List<CityDTO> findAll() {
		List<City> list = repository.findAll(Sort.by("name"));
		return list.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());
	}

	public CityDTO insert(CityDTO dto) {
		City city = new City();
		city.setId(dto.getId());
		city.setName(dto.getName());
		city = repository.save(city);
		return new CityDTO(city);
	}
}
