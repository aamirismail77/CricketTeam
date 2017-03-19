package com.bellinfo.cricket.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bellinfo.cricket.model.Team;

@Repository
public class TeamRepositoryImpl implements TeamRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
	public void addTeam(Team team) {
		getCurrentSession().save(team);
		
	}

	public void updateTeam(Team team) {
		getCurrentSession().merge(team);
		
	}

	public Team getTeam(int id) {
		Team team = (Team)getCurrentSession().get(Team.class, id);
		
		return team;
	}

	public void deleteTeam(int id) {
		Team team = getTeam(id);
		if(team!=null){
			getCurrentSession().delete(team);
		}
		
	}

	public List<Team> getTeams() {
		return getCurrentSession().createQuery("from Team").list();
		
	}

}
