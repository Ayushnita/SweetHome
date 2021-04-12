package com.sweethome.bookingservice.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.client.RestTemplate;

import com.sweethome.bookingservice.model.JwtResposnse;

public class JwtUtil {
	

	public static void validateToken(String autHeader) throws Exception {
		
		RestTemplate restTemplate = new RestTemplate();
		String resourseServer = "http://localhost:8081/validate";
		if(autHeader != null && autHeader.startsWith("Bearer ")) {
			String jwtToken = autHeader.substring(7);
			System.out.println(jwtToken);
			 try {
				 System.out.println("Finding USer");
				 restTemplate.postForObject(resourseServer, new JwtResposnse(jwtToken), User.class);
			 }catch (Exception e) {
				// TODO: handle exception
				 throw new Exception();
			}
		
	}

}
}
