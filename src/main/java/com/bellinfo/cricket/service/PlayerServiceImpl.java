package com.bellinfo.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.cricket.dao.PlayerRepository;
import com.bellinfo.cricket.exceptions.BadRequestException;
import com.bellinfo.cricket.model.Player;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repository;
	
	@Override
	public void addPlayer(Player player) {
		if(getPlayers().size()<=10)
		{
			repository.addPlayer(player);
		}
		else {
			throw new BadRequestException("Number of Players Exceed");
		}
	}

	@Override
	public void updatePlayer(Player player) {
		repository.updatePlayer(player);
		
	}

	@Override
	public Player getPlayer(int id) {
	
		return repository.getPlayer(id);
	}

	@Override
	public void deletePlayer(int id) {
		repository.deletePlayer(id);
		
	}

	@Override
	public List<Player> getPlayers() {
		return repository.getPlayers();
	}



}
