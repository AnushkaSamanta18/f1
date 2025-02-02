package com.cts.Flexride.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Flexride.Entity.AdminEntity;
import com.cts.Flexride.Repo.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo adminrepo;
	
	// Saves the AdminEntity using JPA.
	public AdminEntity saveAdmin(AdminEntity admin) {
		return adminrepo.save(admin);
		    }
	
	public boolean authenticateAdmin(String email, String password) {
        AdminEntity admin = adminrepo.findByEmailAndPassword(email, password);
        return admin != null;
    }
}

