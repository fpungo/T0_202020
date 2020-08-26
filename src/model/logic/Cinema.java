package model.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;


/**
 * Definicion del modelo del mundo
 *
 */
public class Cinema {
	/**
	 * Atributos del modelo del mundo
	 */
	private IArregloDinamico datos;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public static final String SEPARATOR=";";
	private ArregloDinamico<Pelicula> peliculas; 

	public Cinema()
	{
		peliculas = new ArregloDinamico<Pelicula>(4000);
	}

	public Cinema(int tamano)
	{
		peliculas = new ArregloDinamico<Pelicula>(tamano);
	}
	public ArregloDinamico<Pelicula> darPeliculas()
	{
		return peliculas;
	}

	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.size();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(String dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public Comparable buscar(String dato)
	{
		return  datos.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public Comparable eliminar(String dato)
	{
		return datos.eliminar(dato);
	}

	
	public void CargarArchivos()
	{

		BufferedReader bufferLectura = null;
		ArregloDinamico votacion = new ArregloDinamico<>(5000);


		try{
			bufferLectura = new BufferedReader(new FileReader("./data\\MoviesCastingRaw-small.csv"));

			String linea = bufferLectura.readLine();

			while (linea!= null){
				String[] campos = linea.split(SEPARATOR);
				Pelicula temp = null;// (campos[0], campos[12])
				peliculas.agregar(temp);
				linea = bufferLectura.readLine();

			}

		}
		catch(IOException e)
		{
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
		catch(IOException e)
		{
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
