package com.sachin.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sachin.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
