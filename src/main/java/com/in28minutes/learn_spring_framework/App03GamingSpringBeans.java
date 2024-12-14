package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GammingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		var context =new AnnotationConfigApplicationContext
				(GammingConfiguration.class);
		
		context.getBean(GammingConsole.class).up();
		
//		// TODO Auto-generated method stub
////		var game = new MarioGame();
//		
////		var game = new SuperContraGame();
//		
//		var game = new PacManGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();

	}

}
