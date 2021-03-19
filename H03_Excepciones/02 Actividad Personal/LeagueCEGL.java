
import java.io.*;
import java.util.Scanner;

public class LeagueCEGL {

	public static void main(String[] args) {
		LeagueCEGL league = new LeagueCEGL();
		league.readFile("resultados_1.txt");
		league.calculateChampion();
	}
	
	public void calculateChampion() {
		// COMPLETE WITH METHOD IMPLEMENTATION
		
	}

	public void readFile(String file) {
	    Scanner inputStream = null;
	    try {
	      inputStream = new Scanner(new File(file));
	    } catch (FileNotFoundException e) {
	      System.out.println(e.getMessage());
	      System.exit(0);
	    }

	    while (inputStream.hasNextLine()) {
	      String line = inputStream.nextLine();
	      String[] data = line.split("\t"); //split file into an array by tabs
	      
	      for(int i=0; i<data.length; i++) {
	    	  System.out.print(data[i] + "\t");
	      }
	      System.out.println();
	    
	    }
	    inputStream.close();		
	}

}
