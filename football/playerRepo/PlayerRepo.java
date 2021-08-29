package com.football.playerRepo;

import com.football.util.Player;
import com.football.util.TeamNotFormedException;

import java.util.*;

public class PlayerRepo implements PlayerRepoInterface{

	private static ArrayList<Player>arrD; //Diff array lists for diff category
	private static ArrayList<Player>arrMf; // Mentor Comment
	private static ArrayList<Player>arrF;
	private static ArrayList<Player>arrGK;
	@Override
	public int addPlayer(Player p, String c) {
		//Either the size should be 11 or the number of category should be 4-3-3-1 
		//If not then it won't add it.
		if(arrD.size() + arrMf.size() + arrF.size()+ arrGK.size()==11) {
			System.out.println("Can't add more members");
			return 0;
		}
		
		if(c.equals("Defenders") && arrD.size()<4) {
			if(arrD==null)
				new ArrayList<Player>();
			arrD.add(p);
		}
		else {
			System.out.println("Can't add more members");
			return 0;
		}
		if(c.equals("Mid fielders") && arrMf.size()<3) {
			if(arrMf==null)
				new ArrayList<Player>();
			arrMf.add(p);
		}
		else {
			System.out.println("Can't add more members");
			return 0;
		}
		if(c.equals("Forwards") && arrF.size()<3) {
			if(arrF==null)
				new ArrayList<Player>();
			arrF.add(p);
		}
		else {
			System.out.println("Can't add more members");
			return 0;
		}
		if(c.equals("Goal Keepers") && arrGK.size()<1) {
			if(arrGK==null)
				new ArrayList<Player>();
			arrGK.add(p);
		}
		else {
			System.out.println("Can't add more members");
			return 0;
		}
		return arrD.size() + arrMf.size() + arrF.size()+ arrGK.size();
		
	}

	@Override
	public void formTeam() throws TeamNotFormedException {
		// TODO Auto-generated method stub
		//Either the team is too small or the individual category is filled, then it will throw Team is not formed!
		if((arrD.size() + arrMf.size() + arrF.size()+ arrGK.size())<11 || arrD.size()!=4 || arrMf.size()!=3 || arrF.size()!=3 ||arrGK.size()!=1)
			throw new TeamNotFormedException("You don't have enough people");
		
		for(Player p:arrD) {
			System.out.println(p.getName()+ p.getRank() + "Defenders");
		}
		for(Player p:arrMf) {
			System.out.println(p.getName()+ p.getRank() + "Mid fielders");
		}
		for(Player p:arrF) {
			System.out.println(p.getName()+ p.getRank() + "Forwards");
		}
		for(Player p:arrGK) {
			System.out.println(p.getName()+ p.getRank() + "Goal Keepers");
		}
		
		
	}

	

}
