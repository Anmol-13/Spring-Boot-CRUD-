package com.springboot.CustomSecurityWithDB.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.CustomSecurityWithDB.entities.Topic;

@Repository
public interface TopicDAO extends JpaRepository<Topic, Integer> {

}
