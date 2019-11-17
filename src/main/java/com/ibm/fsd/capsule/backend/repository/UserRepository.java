package com.ibm.fsd.capsule.backend.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
//import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ibm.fsd.capsule.backend.entity.User;

public interface UserRepository  extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE user_name LIKE %:username%")
	List<User> findByUserNameAndSort(@Param("username") String username);
}
