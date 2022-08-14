package com.jsuryakt.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;

// give it the model class and primary key data type
public interface UserRepository extends JpaRepository<User, Integer> {
}
