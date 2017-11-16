package com.company.dao;

import com.company.models.Human;

import java.util.List;

public interface HumansDao extends CrudDao<Human> {
    List<Human> findAllByAge(int age);
}