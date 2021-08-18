package com.football.playerRepo;

public class PlayerRepoFactory {

	public static PlayerRepoInterface createObject(String s) {
		PlayerRepoInterface pri=null;
		if(s.equals("user"))
			pri=new PlayerRepo();
		return pri;
	}

}
