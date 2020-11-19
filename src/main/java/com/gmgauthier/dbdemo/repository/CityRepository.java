package com.gmgauthier.dbdemo.repository;

import com.gmgauthier.dbdemo.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}