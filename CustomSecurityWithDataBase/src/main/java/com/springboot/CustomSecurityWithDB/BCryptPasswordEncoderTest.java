package com.springboot.CustomSecurityWithDB;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println("Password for Anmol...... " +bCryptPasswordEncoder.encode("Anmol"));
//		$2a$10$ZRGkEHne7YyCjMpSto9Fde6.rMrx/e6YIaItXCCBSRdv6vIgYYQCe
		System.out.println("Password for Balraj...... " +bCryptPasswordEncoder.encode("Balraj"));
//		$2a$10$MbesVRbsBqVHF8cxXC1gfuYYzKoaZvJi4obILddcvUbrtGYHD.lv.
	}

}
