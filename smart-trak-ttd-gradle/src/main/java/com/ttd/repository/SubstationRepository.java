package com.ttd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttd.model.Substation;
@Repository
public interface SubstationRepository extends JpaRepository<Substation, String> {

}
