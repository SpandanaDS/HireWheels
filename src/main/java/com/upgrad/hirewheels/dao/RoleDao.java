package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleDao")
public interface RoleDao extends JpaRepository<Role, Integer> {
    public Role findByRoleId(int id);
}
