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

public class PoliceStation
{
    private  ArrayList<Reporter> reporters ;
    private  ArrayList<MissingPerson> missingPeople;
    private  int numOfReports;
    
    public PoliceStation () 
    {
    	 reporters = new ArrayList<Reporter>();
    	 missingPeople = new ArrayList<MissingPerson>();
    	 numOfReports = 0 ;
    }

    public PoliceStation(ArrayList<Reporter> reporters, ArrayList<MissingPerson> missingPeople, int numOfReports) {
        this.reporters = reporters;
        this.missingPeople = missingPeople;
        this.numOfReports = numOfReports;
    }
    
    public ArrayList<Reporter> getReporters() {
		return reporters;
	}
	public ArrayList<MissingPerson> getMissingPeople() {
		return missingPeople;
	}
	public int getNumOfReports() {
		return numOfReports;
	}

    public void setReporters(ArrayList<Reporter> reporters) {
        this.reporters = reporters;
    }

    public void setMissingPeople(ArrayList<MissingPerson> missingPeople) {
        this.missingPeople = missingPeople;
    }

    public void setNumOfReports(int numOfReports) {
        this.numOfReports = numOfReports;
    }
        
    //to add new report
    public void submitReport (Reporter reporter , MissingPerson person)
    {
    	reporters.add(reporter);
    	missingPeople.add(person);
    	numOfReports++;
    }
    //to cancel an exist report
    public boolean cancelReport (String reporterName , String missingPersonName)
    {
    	for (int i = 0 ; i < numOfReports ; i++)
    	{
    		if (reporters.get(i).getFullName().equals(reporterName) && missingPeople.get(i).getFullName().equals(missingPersonName))
    		{
    		      missingPeople.remove(i);
    		      reporters.remove(i);
    		      numOfReports--;
    		      System.out.println("This Report has been Deleted");
    		      return true;
    		}
    	}
    	return false;
    }
    //to list all reports
    public void viewAllReports ()
    {
    	for (int i = 0 ; i < numOfReports ; i++)
    	{
    		 System.out.println("Report "+(i+1));
    		 System.out.println("missing person : "+missingPeople.get(i)+"\n reporter : "+reporters.get(i));
    		 System.out.println("=======================================");
    	}
    }
    //to show one report
    public boolean  viewReport (String reporterName , String missingPersonName)
    {
    	for (int i = 0 ; i < numOfReports ; i++)
    	{
    		if (reporters.get(i).getFullName().equals(reporterName) || missingPeople.get(i).getFullName().equals(missingPersonName))
    		{
    		 System.out.println("Report "+(i+1));
    		 System.out.println(missingPeople.get(i)+"\n "+reporters.get(i));
    		 System.out.println("=======================================");
    		 return true;
    		}
    	}
    	return false;
    }
}


