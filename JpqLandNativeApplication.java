package com.jpql.JPQLandNative;

import com.jpql.JPQLandNative.repos.UserRepository;
import com.jpql.JPQLandNative.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JpqLandNativeApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JpqLandNativeApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		User user1=new User();
		user1.setName("Subin");
		user1.setCity("Bangalore");

		User user2=new User();
		user2.setName("Hritik");
		user2.setCity("Nawada");

		List<User> user=List.of(user1,user2);
//		Iterable<User> result=userRepository.saveAll(user);
//		System.out.println(result);

		List<User> result1=userRepository.getAllUser();
		result1.forEach(e-> System.out.println(e));

		//Get data with Name
		List<User> result2=userRepository.getUserByName("Subin");
		result2.forEach(e-> System.out.println(e));

	}

}
