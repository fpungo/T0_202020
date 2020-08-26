package model.data_structures;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import model.logic.Pelicula;


/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable<T>> implements IArregloDinamico<T> {




	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private T elementos[ ];
	
	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	public ArregloDinamico( int max )
	{
		elementos =(T[]) new Comparable[max];
		tamanoMax = max;
		tamanoAct = 0;
	}


	public void agregar( T dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			T [ ] copia = elementos;
			elementos =(T[]) new Comparable[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = dato;
		tamanoAct++;
	}

	public T getElement(int i) {

		return i < elementos.length && i >= 0? elementos[i]:null;
	}

	public T buscar(T dato) {
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		int i = 0;
		T a = elementos[0];
		while(i < elementos.length && a != null)
		{
			if(a.compareTo(dato) == 0 )
				return (T) a;
			i++;
			a = elementos[i];
		}

		return null;
	}

	public T eliminar(T dato) {

		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		int i = 0;
		T resp = null;
		while(i < elementos.length && resp == null)
		{
			T act = elementos[i];
			if(dato.compareTo(act) == 0)
			{
				resp = act;
				elementos[i] = null;
				i--;
			}
			i++;
		}
		if(resp != null)
		{
			while(i+1< elementos.length)
			{
				elementos[i] = elementos[i+1];
				i++;
			}
		}
		return (T) resp;
	}


	public int darCapacidad() 
	{
		return tamanoMax;
	}

	public int size() 
	{
		return tamanoAct;
	}


	public T darElemento(Integer i) 
	{
		return elementos[i];
	}
	public void addFirst(T elemento)
	{
		T[ ] temp = elementos;
		if(tamanoAct == tamanoMax)
			tamanoMax *= 2;

		elementos =(T[]) new Comparable[tamanoMax];
		elementos[0] = elemento;

		for(int i = 0; i < tamanoAct;i++)
			elementos[i+1] = temp[i];

		tamanoAct++;


	}

	public void addLast(T dato)
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			T [ ] copia = elementos;
			elementos =(T[]) new Comparable[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = dato;
		tamanoAct++;
	}

	public void  insertElement(T element, int pos)
	{
		T[ ] temp = elementos;
		if(tamanoAct == tamanoMax)
			tamanoMax *= 2;

		elementos =(T[]) new Comparable[tamanoMax];
		elementos[pos] = element;

		for(int i = pos; i < tamanoAct;i++)
			elementos[i+1] = temp[i];

		tamanoAct++; 
	}

	public T removeFirst( )
	{
		T temp = elementos[0];
		elementos[0] = null;

		for(int i = 0; i+1 < tamanoAct && elementos[i+1] != null;i++)
			elementos[i] = elementos[i+1];

		tamanoAct--;
		return temp;
	}

	public T removeLast( )
	{
		T temp = elementos[tamanoAct-1];
		elementos[tamanoAct-1] = null;
		tamanoAct--;
		return temp;
	}

	public T deleteElement(int pos)
	{
		T temp = elementos[pos];
		elementos[pos] = null;

		for(int i = pos; i+1 < tamanoAct;i++)
			elementos[i] = elementos[i+1];

		tamanoAct--;
		return temp;
	}

	public T firstElement( ) 
	{
		return elementos[0];
	}

	public T lastElement( )
	{
		return tamanoAct > 0 ? elementos[tamanoAct-1] :null;
	}

	public boolean isEmpty()
	{
		return elementos[0] == null?true:false;

	}
	public int isPresentBinary (T element) 
	{
		return Arrays.binarySearch(elementos, element);
	}

	public int isPresent (T element) 
	{
		int i = 0;
		int resp = -1;
		while(i < tamanoAct && resp == -1)
		{
			if(elementos[i].equals(element))
				resp = i;
			i++;
		}

		return resp;
	}
	public void exchange (int pos1, int pos2)
	{
		T temp = elementos[pos1];
		elementos[pos1] = elementos[pos2];
		elementos[pos2] = temp;
	}

	public void changeInfo (int pos, T elem)
	{
		elementos[pos] = elem;
	}

<<<<<<< HEAD

=======
	public int darTamano() 
	{
		return tamanoAct;
	}


	public T darElemento(int i) 
	{
		return getElement(i);
	}
	 
>>>>>>> 876659cde7c95d2a2b46aa36ea28b9ebe197d4e1

}









