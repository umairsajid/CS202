package monsterTrackerGUI;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MonsterHerd implements Serializable{
	private List<Monster> monsters;	
	private MonsterHerdPersister persister;
	
	public MonsterHerd(){
		monsters = new ArrayList<Monster>();
		persister = new MonsterHerdPersister();
	}
	
	public List<Monster> getMonsters() {
		return monsters;
	}	
	
	public void saveBinary(File fileOut){		
		persister.saveHerdToFile(fileOut, this);
	}
	
	public void populateFromFile(File fileIn){
		monsters = persister.readHerdFromFile(fileIn).getMonsters();
	}
	
	public void addMonster(Monster m){monsters.add(m);}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(Monster m: monsters) sb.append(m + "\n");
		return sb.toString();		
	}
}

