package com.bellinfo.cricket.service;

import java.util.List;

import com.bellinfo.cricket.model.Player;

public interface PlayerService {

	public void addPlayer(Player player);
	public void updatePlayer(Player player);
	public Player getPlayer(int id);
	public void deletePlayer(int id);
	
	public List<Player> getPlayers();
}
