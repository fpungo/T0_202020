package model.logic;

public class Casting 
{
	private int id;
	private String actorName1;
	private int actorGender1; 
	private String actorName2; 
	private int actorGender2; 
	private String actorName3; 
	private int actorGender3; 
	private String actorName4; 
	private int actorGender4; 
	private String actorName5; 
	private int actorGender5; 
	private int totalActors;
	private String directorName;
	private int directorGender;
	private int directorNumber;
	private String producerName;
	private int producerNumber;
	private String screeplayName;
	private String editorName;
	
	public Casting(int pId, String pActorN1, int pActorG1, String pActorN2, int pActorG2, String pActorN3, int pActorG3, String pActorN4, int pActorG4, String pActorN5, int pActorG5, int pTotalActors, String pDirectorN, int pDirectorG, int pDirectorNumber, String pProducerN, int pProducerNumber, String pScreeplayN, String pEditorN)
	{
		id=pId;
		actorName1= pActorN1;
		actorName2=pActorN2;
		actorName3=pActorN3;
		actorName4=pActorN4;
		actorName5=pActorN5;
		actorGender1=pActorG1;
		actorGender2=pActorG2;
		actorGender3=pActorG3;
		actorGender4=pActorG4;
		actorGender5=pActorG5;
		totalActors=pTotalActors;
		directorName=pDirectorN;
		directorGender=pDirectorG;
		directorNumber=pDirectorNumber;
		producerName=pProducerN;
		producerNumber=pProducerNumber;
		screeplayName=pScreeplayN;
		editorName=pEditorN;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int id()
	{
		return id; 
	}
	public String actorName1()
	{
		return actorName1; 
	}
	public String actorName2()
	{
		return actorName2; 
	}
	public String actorName3()
	{
		return actorName3; 
	}
	public String actorName4()
	{
		return actorName4; 
	}
	public String actorName5()
	{
		return actorName5; 
	}
	public int actorGender1()
	{
		return actorGender1;
	}
	public int actorGender2()
	{
		return actorGender2;
	}
	public int actorGender3()
	{
		return actorGender3;
	}
	public int actorGender4()
	{
		return actorGender4;
	}
	public int actorGender5()
	{
		return actorGender5;
	}
	public int totalActors()
	{
		return totalActors;
	}
	public String directorName()
	{
		return directorName;
	}
	public int directorGender()
	{
		return directorGender;
	}
	public int directorNumber()
	{
		return directorNumber;
	}
	public String producerName()
	{
		return producerName;
	}
	public int producerNumber()
	{
		return producerNumber;
	} 
	public String screeplayName()
	{
		return screeplayName;
	}
	public String editorName()
	{
		return editorName;
	}
	
	/**
	 * 
	 * @param 
	 */
	
	public void cambiarId(int nId)
	{
		id = nId; 
	}
	public void cambiarActorName1 (String nActorName1)
	{
		actorName1 = nActorName1; 
	}
	public void cambiarActorName2 (String nActorName2)
	{
		actorName2 = nActorName2; 
	}
	public void cambiarActorName3 (String nActorName3)
	{
		actorName3 = nActorName3; 
	}
	public void cambiarActorName4 (String nActorName4)
	{
		actorName4 = nActorName4; 
	}
	public void cambiarActorName5 (String nActorName5)
	{
		actorName5 = nActorName5; 
	}
	public void cambiarActorGender1 (int nActorGender1)
	{
		actorGender1 = nActorGender1; 
	}
	public void cambiarActorGender2 (int nActorGender2)
	{
		actorGender2 = nActorGender2; 
	}
	public void cambiarActorGender3 (int nActorGender3)
	{
		actorGender3 = nActorGender3; 
	}
	public void cambiarActorGender4 (int nActorGender4)
	{
		actorGender4 = nActorGender4; 
	}
	public void cambiarActorGender5 (int nActorGender5)
	{
		actorGender5 = nActorGender5; 
	}
	public void cambiarTotalActors (int nTotalActors)
	{
		totalActors = nTotalActors;
	}
	public void cambiarDirectorName (String nDirectorName)
	{
		directorName = nDirectorName; 
	}
	public void cambiarDirectorGender (int nDirectorGender)
	{
		directorGender = nDirectorGender; 
	}
	public void cambiarDirectorNumber (int nDirectorNumber)
	{
		directorNumber = nDirectorNumber; 
	}
	public void cambiarProducerName (String nProducerName)
	{
		producerName = nProducerName;
	}
	public void cambiarProducerNumber (int nProducerNumber)
	{
		producerNumber = nProducerNumber;
	} 
	public void cambiarScreeplayName (String nScreeplayName)
	{
		screeplayName = nScreeplayName; 
	}
	public void cambiarEditorName (String nEditorName)
	{
		editorName = nEditorName; 
	}
}
