package model.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


//CLASE EN DESARROLLO 
public class Director implements Comparable<Director>
{
	private ArrayList<String> director;
	
	
	
	public Director()
	{
		director = null;
	}
	
	public void guardarDirector()
	{
		BufferedReader lectura = null;
		try
		{
			lectura = new BufferedReader(new FileReader(".//data\\SmallMoviesDetailsCleaned.csv"));

			String linea = lectura.readLine();

			while (linea!= null){
				String[] campos = linea.split(";");
				director.add(campos[13]);
				linea = lectura.readLine();

			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	
	@Override
	public int compareTo(Director o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
