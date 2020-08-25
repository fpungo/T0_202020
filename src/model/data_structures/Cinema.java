package model.data_structures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cinema 
{	
	public static final String SEPARATOR=";";
	private ArregloDinamico<Director> directores; 
	public Cinema()
	{
		directores = new ArregloDinamico<Director>(4000);
	}

	public void CargarArchivos()
	{

		BufferedReader bufferLectura = null;
		ArregloDinamico votacion = new ArregloDinamico<>(3000);


		try{
			bufferLectura = new BufferedReader(new FileReader("./data\\MoviesCastingRaw-small.csv"));

			String linea = bufferLectura.readLine();

			while (linea!= null){
				String[] campos = linea.split(SEPARATOR);
				Director temp = new Director(campos[0], campos[12]);
				directores.agregar(temp);


				linea = bufferLectura.readLine();

			}

		}
		catch(IOException e){
			e.printStackTrace();
		}

		try{
			bufferLectura = new BufferedReader(new FileReader(".//data\\SmallMoviesDetailsCleaned.csv"));

			String linea = bufferLectura.readLine();

			while (linea!= null){
				String[] campos = linea.split(SEPARATOR);

				votacion.agregar(campos[17]);


				linea = bufferLectura.readLine();

			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally 
		{
			if( bufferLectura != null)
			{
				try
				{
					bufferLectura.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}









}






