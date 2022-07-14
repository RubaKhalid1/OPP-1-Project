/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faqedydemo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FaqedyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        PoliceStation ps = new PoliceStation();
	getFromFile("Report Data.txt", ps);
		while (true)
		{
                        System.out.println("___________________________________________________");
                        System.out.println("\tWelcome To Faqeedy Program\t");
                        System.out.println("___________________________________________________");
			System.out.println(
					"1- Submit a report for a missing relative      2- Submit a report for a missing stranger \n"
							+ "3- View one report                             4- View all reports(missing People and reporters) \n"
							+ "5- Cancel a report                             6- Exit \n please select one of options...\n");
			
			String option = input.nextLine();
			switch(option)
			{
			    case "1" :
			     	Reporter reporter1 = inputReporter();
			    	MissingPerson person1 = inputMissingPerson();
			    	ps.submitReport(reporter1, person1);
			    	saveToFile("Report Data.txt",ps);
                                
			    	break;
			    case "2":
			      	Reporter reporter2 = inputReporter();
                                System.out.println();
			    	System.out.println("Data of Stanger\n ");
                                String [] city = {"Jeddah","Makkah","Medina","Riyadh","Taif"}; 
                                System.out.println("The group of cities is: "); 
                                for(int i=0;i<city.length; i++) 
                                { 
                                    System.out.println(city[i] + "  "); 
                                } 
			    	System.out.print("In Which City the Missing are located? "); 
                            String location = input.nextLine(); 
                            if(location.equalsIgnoreCase(city[0])) 
                                System.out.println("You are in the city of " + city[0]); 
                            else if(location.equalsIgnoreCase(city[1]))  
                                System.out.println("You are in the city of " + city[1]); 
                            else if(location.equalsIgnoreCase(city[2]))  
                                System.out.println("You are in the city of " + city[2]); 
                            else if(location.equalsIgnoreCase(city[3]))  
                                System.out.println("You are in the city of " + city[3]); 
                            else if(location.equalsIgnoreCase(city[4])) 
                                System.out.println("You are in the city of " + city[4]); 
                            else 
                                System.out.println("You are not in any of the cities mentioned!");
				System.out.print("please Enter the neighborhood you found it in: ");
				String nieghborhood = input.nextLine();
				System.out.print("please Enter his clothes : ");
			        String clothes = input.next();
			    	MissingPerson person2 = new MissingPerson(location,nieghborhood,clothes);
			    	ps.submitReport(reporter2, person2);
			    	input.nextLine();
			    	saveToFile("Report Data.txt",ps);
			    	break;
			    case "3":
			    	System.out.print("Enter your name :");
				String name1 = input.nextLine();
				System.out.print("Enter the missing person name in your report :");
				String missingName1 = input.nextLine();
				boolean done1 = ps.viewReport(name1, missingName1);
				if (!done1)
					System.out.println("there is no report like that , Try again");
                                break;
                                case "4":
				ps.viewAllReports();
				break;
			    case "5":
				System.out.print("Enter your name :");
				String name2 = input.nextLine();
				System.out.print("Enter the missing person name in your report :");
				String missingName2 = input.nextLine();
				boolean done2 = ps.cancelReport(name2, missingName2);
				saveToFile("Report Data.txt", ps);
				if (!done2)
					System.out.println("There is no report like that");
				break;
			    case "6":
			    	System.out.println("SYSTEM IS CLOSED");
			    	System.exit(0);
			    	break;
			    default :
			    	System.out.println("Invaild input , please try again !!");
			    	break;
			}
		}
	}
	//to make user input data for a new reporter
	public static Reporter inputReporter ()
	{
		  Scanner input = new Scanner(System.in);
		  System.out.println("Data of Reporter\n ");
		  System.out.print("please Enter your full name : ");
		  String name = input.nextLine();
		  while(!name.matches("[a-zA-Z ]+"))
                  {
                      System.out.print("please Enter your full name : ");
		       name = input.nextLine();
                  }
                  String [] city = {"Jeddah","Makkah","Medina","Riyadh","Taif"}; 
                    System.out.println("The group of cities is: "); 
                    for(int i=0;i<city.length; i++) 
                    { 
                        System.out.println(city[i] + "  "); 
                    } 
                    System.out.print("In Which City are you located? "); 
                    String location = input.nextLine(); 
                    if(location.equalsIgnoreCase(city[0])) 
                        System.out.println("You are in the city of " + city[0]); 
                    else if(location.equalsIgnoreCase(city[1]))  
                        System.out.println("You are in the city of " + city[1]); 
                    else if(location.equalsIgnoreCase(city[2]))  
                        System.out.println("You are in the city of " + city[2]); 
                    else if(location.equalsIgnoreCase(city[3]))  
                        System.out.println("You are in the city of " + city[3]); 
                    else if(location.equalsIgnoreCase(city[4])) 
                        System.out.println("You are in the city of " + city[4]); 
                    else 
                        System.out.println("You are not in any of the cities mentioned!");
		  System.out.print("please Enter your neighborhood : ");
		  String nieghborhood = input.nextLine();
		  System.out.print("please Enter your phone number : ");
		  String phone = input.nextLine();
                  String id;
		   while(true)
                   {
                    System.out.print("please Enter your Id: ");
                    id = input.nextLine();
                    if(id.length() != 10)
                    {
                    System.out.println("ERROR It must Contain 10 Numbers!..Please Enter Id again:");
                    }
                    else{
                    System.out.println("Ok Its 10 Numbers.");
                    break;
                    }
                   }
		  String [] relationship = {"Son","Daughter","Brother","Sister"}; 
                System.out.println("The set of relationships is: "); 
                for(int i=0;i<relationship.length; i++){ 
                    System.out.println(relationship[i] + "  "); 
                } 
                System.out.println("Enter What is your relationship to the missing person?(if he/she stranger write unknown)"); 
                
                String relship = input.nextLine(); 
                if(relship.equalsIgnoreCase(relationship[0])) 
                    System.out.println("The missing person " + relationship[0] + " of You"); 
                else if(relship.equalsIgnoreCase(relationship[1])) 
                    System.out.println("The missing person " + relationship[1] + " of You"); 
                else if(relship.equalsIgnoreCase(relationship[2])) 
                    System.out.println("The missing person " + relationship[2] + " of You"); 
                else if(relship.equalsIgnoreCase(relationship[3])) 
                    System.out.println("The missing person " + relationship[3] + " of You");
                else 
                    System.out.println("Your connection to the missing person is unknown");
		  
		  System.out.print("please Enter date of reporting : ");
                  String reportingDate = input.nextLine();
                  Date day = new Date ();
		  String dateOfday =day.toLocaleString();
		  return new Reporter (name,location,nieghborhood,phone,id,relship,reportingDate,dateOfday);
	}
	//to make user input data for a new missing person
	public static MissingPerson inputMissingPerson()
	{
		 Scanner input = new Scanner(System.in);
                  System.out.println();
		  System.out.println("Data of Missing Person\n ");
		  System.out.print("please Enter his/her full name : ");
		  String name = input.nextLine();
                  while(!name.matches("[a-zA-Z ]+"))
                  {
                      System.out.print("please Enter his/her full name : ");
		       name = input.nextLine();
                  }
		  String [] city = {"Jeddah","Makkah","Medina","Riyadh","Taif"}; 
                    System.out.println("The group of cities is: "); 
                    for(int i=0;i<city.length; i++) 
                    { 
                        System.out.println(city[i] + "  "); 
                    } 
                    System.out.print("In Which City the Missing are located? "); 
                    String location = input.nextLine(); 
                    if(location.equalsIgnoreCase(city[0])) 
                        System.out.println("You are in the city of " + city[0]); 
                    else if(location.equalsIgnoreCase(city[1]))  
                        System.out.println("You are in the city of " + city[1]); 
                    else if(location.equalsIgnoreCase(city[2]))  
                        System.out.println("You are in the city of " + city[2]); 
                    else if(location.equalsIgnoreCase(city[3]))  
                        System.out.println("You are in the city of " + city[3]); 
                    else if(location.equalsIgnoreCase(city[4])) 
                        System.out.println("You are in the city of " + city[4]); 
                    else 
                        System.out.println("You are not in any of the cities mentioned!");
		  System.out.print("please Enter his/her neighborhood : ");
		  String nieghborhood = input.nextLine();
		  String ans; 
                    do { 
                         System.out.println("He/She has a phone number or not ?(Enter yes or no)"); 
                          ans = input.nextLine(); 
                    
                    }while(!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no")); 
                    String phone =null; 
                    if (ans.equalsIgnoreCase("yes"))
                    {          
                    System.out.print("please Enter his/her phone number : "); 
                     phone = input.nextLine(); 
                     } 
		  System.out.print("please Enter his/her age: ");
		  int age =input.nextInt();
		   System.out.print("please Enter time Of Disappeaarance(should be more then 24 hours):" );
                         int time= input.nextInt();
                         if(time < 24 )
                         {   
                             System.out.print("please Enter time Of Disappeaarance(should be more then 24 hours):");
                             time= input.nextInt();
                         } 
			 input.nextLine();
		  System.out.print("please Enter his/her  Physical characteristics : ");
		  String characteristics=input.nextLine();
		  System.out.print("please Enter his/her clothes : ");
                  String clothes = input.nextLine();
		  System.out.print("please Enter his/her favoraite places : ");
		  String places = input.nextLine();
		  System.out.print("please Enter his/her health records : ");
		  String health = input.nextLine();
		  return new MissingPerson(name,location,nieghborhood,phone,age,time,characteristics,clothes,places,health);
	}
    
	// to save data in file
	public static void saveToFile(String fileName, PoliceStation ps) throws IOException {

		 PrintWriter writer = new PrintWriter(fileName); 
                    //PrintWriter pw=new PrintWriter(writer);
                    ArrayList<Reporter> reporters = ps.getReporters(); //get array list of info rhe reporter
                    ArrayList<MissingPerson> people = ps.getMissingPeople(); //get array list of info rhe missing

                    for (int i = 0; i < ps.getNumOfReports(); i++) { 
                     writer.println(reporters.get(i).toString()); 
                     writer.println(people.get(i).toString());//write into file
                    } 
                    writer.close();
	}
        
        public static void getFromFile(String fileName, PoliceStation ps) throws IOException { 
        File file = new File(fileName); 
        if (!file.exists()) { 
         file.createNewFile(); 
         return; 
        } 
        Scanner reader1 = new Scanner(file); 
        int turn = 1; 
        Reporter temp1 = new Reporter(); 
        MissingPerson temp2 = new MissingPerson(); 
        while (reader1.hasNextLine()) { 
         String[] data = reader1.nextLine().split(","); 
         if (turn % 2 == 1) { 
          temp1 = new Reporter(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]); 
         } 
         else { 
          int age = Integer.valueOf(data[4]); 
          int time = Integer.valueOf(data[5]); 

          temp2 = new MissingPerson(data[0], data[1], data[2], data[3], age, time, data[6], data[7], data[8], 
            data[9]); 
          ps.submitReport(temp1, temp2);
         } 
         turn++; 
        } 

       }
    }
    

