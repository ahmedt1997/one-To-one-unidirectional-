package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private Instruction_detailsRepository insd_rep;
	
	@Autowired
	private Instructor_Repository ins_rep;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Instructor ins = new Instructor();
		Instructor ins2 = new Instructor();
		Instructors_details insd = new Instructors_details();
		Instructors_details insd2 = new Instructors_details();
		
		insd.setYoutube_channel("https://www.youtube.com/watch?v=kAYjrhcrx_8");
		insd.setHobby("programming with spring boot");
		
		insd2.setYoutube_channel("https://www.youtube.com/channel/UCW5YeuERMmlnqo4oq8vwUpg");
		insd2.setHobby("music");
		
		//personne 1
		ins.setFirst_name("ahmed");
		ins.setLast_name("touzani");
		ins.setEmail("ahmedbbccaa@gmail.com");
		ins.setInstructor_details(insd);
		
		
		//personne 2
		
		ins2.setFirst_name("shaun");
		ins2.setLast_name("youshi");
		ins2.setEmail("shaun@gmail.com");
		ins2.setInstructor_details(insd2);
		
		ins_rep.save(ins);
		ins_rep.save(ins2);
		
	
		
		
	}
		
	}


