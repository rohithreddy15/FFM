package com.audintel.repository;

import com.audintel.dao.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Planrepository extends CrudRepository<Plan,Integer> {
}
