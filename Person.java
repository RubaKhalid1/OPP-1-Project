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
public class Person 
{
    private String fullName;
    private String cityOfResidence;
    private String neighborhood;
    private String phone ;

    public Person(String fullName, String cityOfResidence, String neighborhood, String phone) {
        this.fullName = fullName;
        this.cityOfResidence = cityOfResidence;
        this.neighborhood = neighborhood;
        this.phone = phone;
    }
	public Person() 
	{
		this.fullName = fullName;
		this.cityOfResidence = cityOfResidence;
		this.neighborhood = neighborhood;
		this.phone = phone;
	}
	public String getFullName() 
	{
		return fullName;
	}
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}
	public String getCityOfResidence() 
	{
		return cityOfResidence;
	}
	public void setCityOfResidence(String cityOfResidence) 
	{
		this.cityOfResidence = cityOfResidence;
	}
	public String getNeighborhood()
	{
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood)
	{
		this.neighborhood = neighborhood;
	}
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String toString()
	{
		return fullName + "," + cityOfResidence + ","
				+ neighborhood + "," + phone ;
	}

}


