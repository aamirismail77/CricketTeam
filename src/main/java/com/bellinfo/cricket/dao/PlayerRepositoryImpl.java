package com.bellinfo.cricket.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bellinfo.cricket.model.Player;


@Repository
public class PlayerRepositoryImpl implements PlayerRepository {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addPlayer(Player player) {

		getCurrentSession().save(player);

	}

	@Override
	public void updatePlayer(Player player) {
		getCurrentSession().merge(player);

	}

	@Override
	public Player getPlayer(int id) {
		Player player = (Player) getCurrentSession().get(Player.class, id);

		return player;
	}

	@Override
	public void deletePlayer(int id) {
		Player player = getPlayer(id);
		if (player != null) {
			getCurrentSession().delete(player);
		}

	}

	@Override
	public List<Player> getPlayers() {
		return getCurrentSession().createQuery("from Player").list();
	}

}
