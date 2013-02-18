package com.nima;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class HeroQuest {
	public static void main(String[] args) {
		System.out.println("Welcome to HeroQuest Engine!!!");
		
		//read configuration file		
		Properties config = getProperties("src/com/nima/conf.hq");

		//create new game
		Game game = new Game();
		
		//Prepare Board with a quest
		Properties questProps = getProperties("src/com/nima/quest1.hq");
		try{
			game.startQuest(questProps.getProperty("name"), questProps.getProperty("map"), 
					questProps.getProperty("text"), questProps.getProperty("notes"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("Finished!!!");
	}
	
	private static Properties getProperties(String fileName){
		Properties props = new Properties();
		File file = new File(fileName);
		try {
			FileReader fr = new FileReader(file);
			props.load(fr);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}
}