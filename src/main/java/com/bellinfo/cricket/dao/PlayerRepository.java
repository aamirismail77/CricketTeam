package com.bellinfo.cricket.dao;

import java.util.List;

import com.bellinfo.cricket.model.Player;

public interface PlayerRepository {

	public void addPlayer(Player player);
	public void updatePlayer(Player player);
	public Player getPlayer(int id);
	public void deletePlayer(int id);
	
	public List<Player> getPlayers();
}
