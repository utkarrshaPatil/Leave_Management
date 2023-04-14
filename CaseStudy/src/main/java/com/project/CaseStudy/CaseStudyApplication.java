package com.project.CaseStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
 
@SpringBootApplication
public class CaseStudyApplication implements CommandLineRunner {
 
    @Autowired
    JdbcTemplate jdbcTemplate;
    
  
     
    public static void main(String[] args) {
        SpringApplication.run(CaseStudyApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
         
        String sql = "INSERT INTO lmsd (EmployeeID ,EmployeeName, JanLV,FebLV,MarLV,AprLV,MayLV,JunLV,JulLV,AugLV,SeptLV,OctLV,NovLV,DecLV,TOTALLEAVE) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      // int result = jdbcTemplate.update(sql,900,"Vivek Kalmorge", 0,2,2,2,0,2,0,2,2,2,0,2,24);
        String sql2 = "SELECT EmployeeID FROM lmsd WHERE EmployeeID = 567";
        String sql3 ="CREATE PROCEDURE FetchemployeeID @EmployeeID int"
        		+ "AS"
        		+ "SELECT * FROM lmsd WHERE EmployeeID = @EmployeeID"
        		+ "GO";
       
       Employee book = jdbcTemplate.queryForObject(sql2,
          BeanPropertyRowMapper.newInstance(Employee.class));
        
             //if(book==(JanLV=2)) {
            	 
           //  }
        System.out.println(book);
       // System.out.println(book);
         
        
    }
    
}
