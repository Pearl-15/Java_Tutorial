package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GammingConsole;
import com.in28minutes.learn_spring_framework.game.PacManGame;

@Configuration
public class GammingConfiguration {

	@Bean
	public GammingConsole game() {
		var game = new PacManGame();
		return game;
	}
}
