package com.nima;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HeroQuest {
	public static void main(String[] args) {
		System.out.println("Welcome to HeroQuest Engine!!!");
		
		Properties props = new Properties();		
		File conf = new File("src/com/nima/conf.hq");
		try {
			FileReader fr = new FileReader(conf);
			props.load(fr);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}