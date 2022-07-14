/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faqedydemo;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MissingPerson extends Person
{
   private int age;
   private int timeOfDisappeaarance;
   private String Physicalcharacteristics;
   private String clothes;
   private String favoraitePlaces;
   private String healthRecord;

    public MissingPerson() {
        this.age = age;
        this.timeOfDisappeaarance = timeOfDisappeaarance;
        this.Physicalcharacteristics = Physicalcharacteristics;
        this.clothes = clothes;
        this.favoraitePlaces = favoraitePlaces;
        this.healthRecord = healthRecord;
    }


public MissingPerson(String city , String nieghborhood , String clothes) {
    super("unknown",city,nieghborhood,null);
    this.clothes = clothes;
    this.timeOfDisappeaarance=0;
}
public MissingPerson(String fullName, String cityOfResidence, String neighborhood, String phone, int age,
		int timeOfDisappeaarance, String physicalcharacteristics, String clothes, String favoraitePlaces,
		String healthRecord)
{
	super(fullName, cityOfResidence, neighborhood, phone);
	this.age = age;
	this.timeOfDisappeaarance=timeOfDisappeaarance;
	this.Physicalcharacteristics = physicalcharacteristics;
	this.clothes = clothes;
	this.favoraitePlaces = favoraitePlaces;
	this.healthRecord = healthRecord;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getTimeOfDisappeaarance() {
	return timeOfDisappeaarance;
}

public void setTimeOfDisappeaarance(int timeOfDisappeaarance) {
	
	this.timeOfDisappeaarance = timeOfDisappeaarance;
}

public String getPhysicalcharacteristics() {
	return Physicalcharacteristics;
}

public void setPhysicalcharacteristics(String physicalcharacteristics) {
	Physicalcharacteristics = physicalcharacteristics;
}

public String getClothes() {
	return clothes;
}

public void setClothes(String clothes) {
	this.clothes = clothes;
}

public String getFavoraitePlaces() {
	return favoraitePlaces;
}

public void setFavoraitePlaces(String favoraitePlaces) {
	this.favoraitePlaces = favoraitePlaces;
}

public String getHealthRecord() {
	return healthRecord;
}

public void setHealthRecord(String  healthRecord) {
	this.healthRecord = healthRecord;
}
public String toString() {
	return  super.toString() +" ," + age + "," + timeOfDisappeaarance
			+ "," + Physicalcharacteristics + "," + clothes
			+ "," + favoraitePlaces + "," + healthRecord ;
}
}   


