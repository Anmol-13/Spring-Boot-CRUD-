package com.springboot.CustomSecurityWithDB.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.CustomSecurityWithDB.entities.UserInfo;

public interface UserInfoDAO extends JpaRepository<UserInfo, Integer>{
	
	@Query(value = "SELECT u FROM UserInfo u WHERE userName=?1")
	public UserInfo getActiveUser(String userName);

}
