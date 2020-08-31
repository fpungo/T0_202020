package controller;

import java.util.Scanner;

import model.logic.Cinema;
import model.logic.Pelicula;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Cinema modelo;
	
	/* Instancia de la Vista*/
	private  View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Cinema();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		int dato = -1;
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
				    modelo = new Cinema(3000); 
				    modelo.CargarArchivos();
				    view.printMessage("datos primera pelicula: " + modelo.darPeliculas().firstElement());
				    view.printMessage("datos ultima pelicula: " + modelo.darPeliculas().lastElement());
				    view.printMessage("La cantidad total de peliculas es: " + modelo.darTamano());
					break;

				case 2:
		
					for(int i= 0; i<modelo.darBuenasPeliculas(respuesta).size();i++){
					
						Pelicula actual = modelo.darBuenasPeliculas(respuesta).darElemento(i);
					 String loBasico = "los datos son: " + actual.darId() + actual.darTitle() + actual.darGeneros() + actual.darRelease_date() + actual.darCasting();
						
					 view.printMessage(loBasico);
					}
					break;

			

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}
	
}
