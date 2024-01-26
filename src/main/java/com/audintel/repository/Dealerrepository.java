package com.audintel.repository;

import com.audintel.dao.Dealer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dealerrepository extends CrudRepository<Dealer,Integer> {

}
