package model.data_structures;

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

	public T darElemento(int i) {

		return i < elementos.length && i >= 0? elementos[i]:null;
	}

	public T buscar(T dato) {
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.

		for(T act:elementos )
		{
			if(act.compareTo(dato) == 0 )
				return (T) act;
		}

		return (T) null;
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

	public int darTamano() 
	{
		return tamanoAct;
	}

	
	public T darElemento(Integer i) 
	{
		return elementos[i];
	}



}
