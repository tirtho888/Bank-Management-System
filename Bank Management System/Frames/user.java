package Frames;

import java.lang.*;
import java.util.*;
import java.io.*;
//import Frames.*;



public class user{
	private String name;
	private String address;
	private String fatherName;
	private String mail;
	private String userName;
	private String userpass;
	private String dob;
	private String gender;
	private String marital;
	//private double balance;
	
	
	public user()
	{
		
	}
	public user(String name,String address,String fatherName,String mail,String userName,String userpass,String dob,String gender,String marital/*,double balance*/)
	{
		this.name=name;
		this.address = address;
		this.fatherName=fatherName;
		this.mail=mail;
		this.userName=userName;
		this.userpass=userpass;
		this.dob=dob;
		this.gender=gender;
		this.marital=marital;
		//this.balance=balance;

		
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}
	public void setMail(String mail){
		this.mail=mail;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public void setUserPass(String userpass){
		this.userpass=userpass;
	}
	public void setDob(String dob){
		this.dob=dob;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public void setMarital(String marital){
		this.marital=marital;
	}
	/*public void setBalance(double balance){
		this.balance=balance;
	}*/
	
	
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getFatherName(){
		return fatherName;
	}
	public String getMail(){
		return mail;
	}

	
	public String getUserName(){
		return userName;
	}
	public String getUserPass(){
		return userpass;
	}
	public String getDob(){
		return dob;
	}
	public String getGender(){
		return gender;
	}
	public String getMarital(){
		return marital;
	}
	/*public double getBalance(){
		return balance;
	}*/

	
	}


	
	
	
	
	
