package com.football.userInterfaceModule;

import java.util.Locale.Category;
import java.util.Scanner;

import com.football.playerRepo.PlayerRepoFactory;
import com.football.playerRepo.PlayerRepoInterface;
import com.football.util.Player;
import com.football.util.TeamNotFormedException;

public class UserInterfaceModule {
	
	static Player p;
	static PlayerRepoInterface pri;
	static int noOfPlayers;
	static Scanner sc;
	enum Category{
		Defender, MidFielder, Forward, GoalKeeper;
	};
	public UserInterfaceModule() {
		p=new Player();
		pri=PlayerRepoFactory.createObject("user");
		sc=new Scanner(System.in);
	}
	public static void main(String[] args) throws TeamNotFormedException {
		String s="y";
		while(s.equals("y")) { //Mentor Comment: could use s.equalsIgnoreCase()
		System.out.println("Welcome! Please select the action you want to perform");
		System.out.println("Enter 1 to add players to repo");
		System.out.println("Enter 2 to form team");
		// Mentor Comment : Provide a choice for Exiting the program
		
		int input=sc.nextInt();
		switch(input) {
		case(1):{
			System.out.println("Enter the number of players that you would like to add");
			int n=sc.nextInt(); // Use Meaningfull name for variable e.g numberOfPlayerInputs
			if(noOfPlayers+n>11) {
				System.out.println("Can't add members");
				break;
			}
				
			while(n>0) {
			System.out.println("Enter your name"); //Mentor Comment : Enter Player's Name
			p.setName(sc.next()); 
			//Mentor Comment : Validation required and Exceptions be thrown
			System.out.println("Enter your category i.e Defender, MidFielder, Forward, GoalKeeper");
			String c=sc.next();
			//Mentor Comment : Validation required and Exceptions be thrown
			
			System.out.println("Enter your rank");
			p.setRank(sc.nextInt());
			//Mentor Comment : Validation required and Exceptions be thrown
			noOfPlayers=pri.addPlayer(p,c);
			n--;
			}
			break;
		}
		case(2):{
			pri.formTeam();
			break;
		}
		default:
			System.out.println("Enter valid input");
				break;
		}
		if(noOfPlayers<11)
		System.out.println("Do you want to add more y/n");
		s=sc.next();
		}
		
	}

}
