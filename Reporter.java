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
import java.util.Date;
import java.util.Scanner;

public class Reporter extends Person
{
    private String identityID;
    private String relationShip;
    private String DateOfMissing;																								;
    private String dateOfday;
    

    public Reporter() {
        this.identityID = identityID;
        this.relationShip = relationShip;
        this.DateOfMissing = DateOfMissing;
        this.dateOfday = dateOfday;
    }
	
	public Reporter(String fullName, String cityOfResidence, String neighborhood, String phone, String identityID,
			String relationShip, String dateOfReporting, String dateOfday) {
		super(fullName, cityOfResidence, neighborhood, phone);
		this.identityID = identityID;
		this.relationShip = relationShip;
		DateOfMissing = dateOfReporting;
		this.dateOfday = dateOfday;
	}

	public String getIdentityID() {
		return identityID;
	}
	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}
	public String getRelationShip() {
		return relationShip;
	}
	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}
	public String  getDateOfMissing() {
		return DateOfMissing;
	}
	public void setDateOfReporting(String date) {
		DateOfMissing = date;
	}
	public String getDateOfday() {
		return dateOfday;
	}
	public void setDateOfday(String dateOfday) {
		this.dateOfday = dateOfday;
	}
	public String toString() {
		return super.toString()+ "," + identityID + "," + relationShip + ","
				+ DateOfMissing + "," + dateOfday ;
	}
}

