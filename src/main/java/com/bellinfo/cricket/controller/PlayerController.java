package com.bellinfo.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bellinfo.cricket.model.Player;
import com.bellinfo.cricket.service.PlayerService;

@Controller
@RequestMapping(value="/players")
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPlayerPage(){
		ModelAndView modelAndView = new ModelAndView("add-player-form");
		modelAndView.addObject("players", new Player());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingPlayer(@ModelAttribute Player player){
		ModelAndView modelAndView = new ModelAndView("home");
		playerService.addPlayer(player);
		String str = "Player was successfully added";
		modelAndView.addObject("message", str);
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfPlayers(){
		ModelAndView modelAndView = new ModelAndView("list-of-players");
		List<Player> players = playerService.getPlayers();
		modelAndView.addObject("players",players);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editPlayerPage(@PathVariable Integer id){
		ModelAndView modelAndView = new ModelAndView("edit-player-form");
		Player player = playerService.getPlayer(id);
		modelAndView.addObject("players", player);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView editingPlayer(@ModelAttribute Player player, @PathVariable Integer id){
		ModelAndView modelAndView = new ModelAndView("home");
		playerService.updatePlayer(player);
		String message = "Player was successfully Edited";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public ModelAndView deletePlayer(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("home");
		
		playerService.deletePlayer(id);
		String message = "Player was successfully deleted";
		modelAndView.addObject("message", message);
		return modelAndView;
		
	}
}
