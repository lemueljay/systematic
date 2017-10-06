package com.codington.module19;

public class Town {


	//Town is composed of Museum.
	private Museum museum;
	//variable to hold the value of the town  name
	private String townName;

   //Parameterised constructor for the class.
	public Town(Museum museum) {
		super();
		this.museum = museum;
	}


    //Getter and setter for the town
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}

	//Method to display the museum information
	public void diplayTownInfo()
	{
		System.out.println("Welcome to " + townName);
		System.out.println("Visit the " + museum.getName() + " of " + museum.getType());
	}

}
