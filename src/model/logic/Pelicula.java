package model.logic;

public class Pelicula implements Comparable<Pelicula>
{
	private int id;
	private String presupuesto;
	private String generos;
	private String imdb_id;
	private String lenguajeOriginal;
	private String tituloOriginal;
	private String descripcion; 
	private String popularidad;
	private String companiasProductoras;
	private String production_countries;
	private String release_date;
	private String revenue; 
	private String runtime; 
	private String spoken_languages; 
	private String status; 
	private String tagline; 
	private String title;
	private int vote_average;
	private String vote_count;
	private String production_companies_number;
	private String spoken_languages_number;
	private Casting cast;

	public Pelicula(int pId, String pPresupuesto, String pGeneros, String pImdb_id, String pLenguajeOriginal, String pTituloOriginal, String pDescripcion, String pPopularidad, String pCompaniasProductoras, String pProduction_countries, String pRelease_date, String pRevenue, String pRuntime, String pSpoken_languages, String pStatus, String pTagline, String pTitle, int pVote_average, String pVote_count, String pProduction_companies_number, String pSpoken_languages_number, Casting nCast)
	{
		id = pId; 
		presupuesto = pPresupuesto;
		generos = pGeneros;
		imdb_id = pImdb_id;
		lenguajeOriginal = pLenguajeOriginal;
		tituloOriginal = pTituloOriginal;
		descripcion = pDescripcion;
		popularidad = pPopularidad;
		companiasProductoras = pCompaniasProductoras;
		production_countries = pProduction_countries;
		release_date = pRelease_date;
		revenue = pRevenue;
		runtime = pRuntime;
		spoken_languages = pSpoken_languages;
		status = pStatus;
		tagline = pTagline;
		title = pTitle;
		vote_average = pVote_average;
		vote_count = pVote_count;
		production_companies_number = pProduction_companies_number;
		spoken_languages_number = pSpoken_languages_number;
		cast = nCast;
		
	}
	public int darId()
	{
		return id;
	}
	public String darPresupuesto()
	{
		return presupuesto;
	}
	public String darGeneros()
	{
		return generos;
	}
	public String darimdb()
	{
		return imdb_id;
	}
	public String darLenguajeoriginal()
	{
		return lenguajeOriginal;
	}
	public String darTituloOriginal()
	{
		return tituloOriginal;
	}
	public String darDescripcion()
	{
		return descripcion;
	}
	public String darPopularidad()
	{
		return popularidad;
	}
	public String darCompaniasProductoras()
	{
		return companiasProductoras;
	}
	public String darProduction_countries()
	{
		return production_countries;
	}
	public String darRelease_date()
	{
		return release_date;
	}
	public String darRevenue()
	{
		return revenue;
	}
	public String darRuntime()
	{
		return runtime;
	}
	public String darSpoken_languages()
	{
		return spoken_languages;
	}
	public String darStatus()
	{
		return status;
	}
	public String darTagline()
	{
		return tagline;
	}
	public String darTitle()
	{
		return title;
	}
	public int darVote_average()
	{
		return vote_average;
	}
	public String darVote_count()
	{
		return vote_count;
	}
	public String darProduction_companies_number()
	{
		return production_companies_number;
	}
	public String darSpoken_languages_number()
	{
		return spoken_languages_number;
	}
	public Casting darCasting()
	{
		return cast;
	}

	
	
	public void cambiarid(int pId)
	{
		id = pId;
	}
	public void cambiarPresupuesto(String nPresupuesto)
	{
		presupuesto = nPresupuesto;
	}
	public void cambiarGeneros(String nGeneros)
	{
		generos = nGeneros;
	}
	public void cambiarimdb(String nImdb)
	{
		imdb_id = nImdb;
	}
	public void cambiarLenguajeoriginal(String nLenguajeOriginal)
	{
		lenguajeOriginal = nLenguajeOriginal;
	}
	public void cambiarTituloOriginal(String nTituloOriginal)
	{
		tituloOriginal = nTituloOriginal;
	}
	public void cambiarDescripcion(String nDescripcion)
	{
		descripcion = nDescripcion;
	}
	public void cambiarPopularidad(String nPopularidad)
	{
		popularidad = nPopularidad;
	}
	public void cambiarCompaniasProductoras(String nCompaniasProductoras)
	{
		companiasProductoras = nCompaniasProductoras;
	}
	public void cambiarProduction_countries(String nProduction_countries)
	{
		production_countries = nProduction_countries;
	}
	public void cambiarRelease_date(String nRelease_date)
	{
		release_date = nRelease_date;
	}
	public void cambiarRevenue(String nRevenue)
	{
		revenue = nRevenue;
	}
	public void cambiarRuntime(String nRuntime)
	{
		runtime = nRuntime;
	}
	public void cambiarSpoken_languages(String nSpoken_languages)
	{
		spoken_languages = nSpoken_languages;
	}
	public void cambiarStatus(String nStatus)
	{
		status = nStatus;
	}
	public void cambiarTagline(String nTagline)
	{
		tagline = nTagline;
	}
	public void cambiarTitle(String nTitle)
	{
		title = nTitle;
	}
	public void cambiarVote_average(int nVote_average)
	{
		vote_average = nVote_average;
	}
	public void cambiarVote_count(String nVote_count)
	{
		vote_count = nVote_count;
	}
	public void cambiarProduction_companies_number(String nProduction_companies_number)
	{
		production_companies_number = nProduction_companies_number;
	}
	public void cambiarSpoken_languages_number(String nSpoken_languages_number)
	{
		spoken_languages_number = nSpoken_languages_number;
	}
	public void cambiarCast(Casting nCast)
	{
		cast = nCast;
	}


	@Override
	public int compareTo(Pelicula p) {

		return (id - p.darId());
	}
}
