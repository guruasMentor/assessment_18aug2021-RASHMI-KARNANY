package com.football.playerRepo;

import com.football.util.Player;
import com.football.util.TeamNotFormedException;

public interface PlayerRepoInterface {

	int addPlayer(Player p, String c);

	void formTeam() throws TeamNotFormedException;

	

}
