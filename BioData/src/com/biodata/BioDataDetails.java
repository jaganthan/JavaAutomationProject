package com.biodata;

public class BioDataDetails 
{
	
	public void personData()
	{
		
		System.out.println("\t\t\t BIO-DATA\n");
		
		//MY DETAILS
		String name = "Jaganathan";
		char initial = 'M';
		String dob = "25/03/1995";
		byte age = 26;
		String gender = "Male" ;
		long ph = 8072267883l;
		String email = "manijagan2595@gmail.com";
		String langKnow = "Tamil, English, Hindi";
		System.out.println("YOUR NAME : " + name + "\nSURNAME : " + initial + "\nDATE OF BIRTH : " + dob + "\nAGE : " + age + "\nGENDER : " + gender + "\nMOBILE NO. : " + ph + "\nEMAIL ID : " + email + "\nLAUNGUAGE KNOWN :" + langKnow);
			
		//ADDRESS DETAILS
		short doorNumber = 136;
		String address = " \n\t  Azeema Bldg, Tsp Road, Opp Bus Stand, Kalasipalyam";
		String state = " \n\t  Tamil Nadhu,";
		String city = "  Chennai - ";
		int pinCode =  600062;
		String curtLocation = "Avadi";
		System.out.println("ADDRESS : " + doorNumber + address + state + city + pinCode  + "\nCURRENT LOCATION : " + curtLocation);
		
		//EDUCATION DETAILS
		String dept = "CSE";
		int year = 2017;
		int batch = 2013;
		String colNAme = "Kings Engineering College";
		System.out.println("\nACADEMIC QUALIFICATION ----->" + " DEPARTMENT : " + dept + "\n\t\t\t      COMPLETED YEAR :" + year + "\n\t\t\t      BATCH : " + batch + "\n\t\t\t      INSTITUTION : " + colNAme );
		
		//WORK DETAILS
		float toExp = 1.3f;
		String postion = " Network Engineer";
		String compName = "Futurenet Technologies";
		System.out.println("\nWORK EXPERIENCE ----->" + " TOTAL EXP IN(YEAR.MONTHS) : " + toExp + "\n\t\t       POSITION :" + postion + "\n\t\t       ORGANISATION NAME : " + compName);
		
		//OTHERS
		String accp1 = "Yes";
		String accp2 = "Yes";
		String accp3 = "No";
		boolean accp4 = true;
		System.out.println("\nWILLING TO WORK IN ANY LOCATION : " + accp1 + "\nARE YOU COMFORTABLE WITH NIGHT SHIFT : " + accp2 + "\nDO YOU NEED HOSTEL FECILITY : " + accp3 + "\nYOU ARE INDIAN CITIZEN : " + accp4);
		
	}
	
}
