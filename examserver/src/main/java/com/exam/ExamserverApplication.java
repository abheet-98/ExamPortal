package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Starting code");
		
//		User user = new User();
//		user.setFirstName("amit");
//		user.setLastName("sharma");
//		user.setEmail("amit@gmail.com");
//		user.setPassword("1234");
//		user.setProfile("default.png");
//		user.setUsername("amit100");
//
//		Role role = new Role();
//		role.setRoleId(10L);
//		role.setRoleName("ADMIN");
//		
//		UserRole userRole = new UserRole();
//		userRole.setUser(user);
//		userRole.setRole(role);
//		
//		Set<UserRole> userRoles = new HashSet<>();
//		userRoles.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoles);
//		System.out.println(user1.getUsername());
		
	}

}
