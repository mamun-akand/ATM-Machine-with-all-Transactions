package bank.management.system;

import java.sql.*;

public class SQL_Connection {
    Connection c;
    Statement s;
    public SQL_Connection(){
    try{
        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","123456");
        s = c.createStatement();
    }
    catch(Exception x){
        System.out.println(x);
    }
}
    
}


//show databases;

//use bankmanagementsystem;

//create table login(Form_no varchar(50), Card_Number varchar(60), Pin_Number varchar(60));

//create table signup(Form_no varchar(30), Name varchar(60),Father_name varchar(60),Date_of_birth varchar(50),Gender varchar(20), Email varchar(60), Marital_status varchar(20),Address varchar(100), City varchar(20), Pincode varchar(20), State varchar(30));

//create table signup2(Form_no varchar(30), Category_name varchar(60),Income_info varchar(60),Educational_info varchar(50),Qualificationnal_info varchar(50), Occupational_info varchar(60), National_id varchar(30),Voter_id varchar(100), Post_card varchar(30), Existing_account varchar(30));

//create table signup3(Form_no varchar(50), Account_Type varchar(60), Card_Number varchar(60), Pin_Number varchar(60), Facilities varchar(150));

//create table deposit(Pin varchar(100),Date varchar(100),Type varchar(100),Amount varchar(1000));

//rename table deposit to transactions;
