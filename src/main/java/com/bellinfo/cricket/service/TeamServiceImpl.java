package com.bellinfo.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.cricket.dao.TeamRepository;
import com.bellinfo.cricket.model.Team;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepository repository;
	
	public void addTeam(Team team) {
		repository.addTeam(team);
	}

	public void updateTeam(Team team) {
		repository.updateTeam(team);
		
	}

	public Team getTeam(int id) {
		// TODO Auto-generated method stub
		return  repository.getTeam(id);
		
	}

	public void deleteTeam(int id) {
		repository.deleteTeam(id);
		
	}

	public List<Team> getTeams() {
		return repository.getTeams();
	}

}
