package com.company.dao;

import com.company.models.Car;

import java.util.List;

public interface CarDao extends CrudDao<Car> {
    List<Car> findAllByColor(String color);
}