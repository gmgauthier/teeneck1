package com.gmgauthier.dbdemo.service;

import com.gmgauthier.dbdemo.model.City;
import java.util.List;

public interface ICityService {

    List<City> findAll();
}