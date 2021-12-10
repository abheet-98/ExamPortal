package com.exam.service;

import java.util.Set;

import com.exam.entity.Role;
import com.exam.entity.UserRole;

public interface RoleService {

	public Role createRole(Role role, Set<UserRole> userRoles);
	
}
