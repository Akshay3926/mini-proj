package com.Akshay.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Akshay.entity.ContactEntity;

@Repository
public interface ContactRepo extends JpaRepository<ContactEntity,Serializable>{

}
