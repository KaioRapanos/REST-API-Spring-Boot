package com.studantkaio.myprojectweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studantkaio.myprojectweb.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
