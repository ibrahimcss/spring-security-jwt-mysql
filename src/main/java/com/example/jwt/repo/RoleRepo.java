package com.example.jwt.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jwt.model.Role;
import com.example.jwt.model.RoleName;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

	Optional<Role> findByName(RoleName roleName);
}
