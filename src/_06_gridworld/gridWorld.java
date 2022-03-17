package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld {
	static World world = new World();
	
	static Bug bug = new Bug();
	static Bug bug1 = new Bug();
	
	static Flower flow = new Flower();
	static Flower flo = new Flower();
	
	static Location locBug = new Location(1,1);
	
	
	public static void main(String[] args) {
		Random rloc = new Random();
		int randomRow = rloc.nextInt(5);
		int randomCol = rloc.nextInt(5);
		
		Location locBug1 = new Location(randomRow,randomCol);
		Location locflo = new Location(randomRow-1,randomCol);
		Location locflo1 = new Location(randomRow+1,randomCol);
		
		for(int i = 0; i <10; i++) {
			for(int j = 0;j<10;j++) {
				Location flowe = new Location(i,j);
				world.add(flowe, flow);
			}
		}

		world.show();
		//world.add(locBug, bug);
		bug1.setColor(Color.blue);
		bug1.turn();
		bug1.turn();
		//world.add(locBug1,bug1);
		//world.add(locflo, flow);
		//world.add(locflo1, flo);

		
		
	}
	
}
