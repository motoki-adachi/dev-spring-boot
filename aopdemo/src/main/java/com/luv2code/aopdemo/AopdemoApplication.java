package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDao;
import com.luv2code.aopdemo.dao.MembershipDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao theAccountDao, MembershipDao theMembershipDao) {
		return runner -> {
			demoTheBeforeAdvice(theAccountDao, theMembershipDao);
		};
	}

	private void demoTheBeforeAdvice(AccountDao theAccountDao, MembershipDao theMembershipDao) {
		theAccountDao.addAccount();
		theMembershipDao.addAccount();
		System.out.println("\n Let's call it again!\n");
		theAccountDao.addAccount();
		theMembershipDao.addAccount();
	}
}
