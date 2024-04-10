package com.majpro.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.majpro.crud.dao.StudentDAO;
import com.majpro.crud.entity.Student;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
    
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
           return runner -> {
			  //createStudent(studentDAO);
			  createMultipleStudent(studentDAO);
		   };
	}

	private void createMultipleStudent(StudentDAO studentDAO) {

	     //create the student object
         System.out.println("Creating 03 new student object....");
		 Student tempStudent1 = new Student("John","Wick","artistwick@gmail.com");
		 Student tempStudent2 = new Student("Paul","Phoenix","paul@gmail.com");
		 Student tempStudent3 = new Student("Nav","ix","navix@gmail.com");

		//save the student object
		System.out.println("Saving the 03 students.....");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
 
	}

	private void createStudent(StudentDAO studentDAO) {
		
		//create the student object
         System.out.println("Creating new student object....");
		 Student tempStudent = new Student("Paul","Doe","artist@gmail.com");
		
		 //save the student object
		 System.out.println("Saving the student.....");
         studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student.Generated id : "+tempStudent.getId());
	}
}
