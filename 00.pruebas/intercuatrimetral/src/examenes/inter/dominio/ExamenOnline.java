package examenes.inter.dominio;

public class ExamenOnline extends Examen
{
  static double FACTOR_CORRECCION = 1.2d;

	String herramienta;
	String plataforma;
  
	public ExamenOnline(String nombre, double dificultad, String herramienta, String plataforma)
	{
	  super (nombre, dificultad);
		this.herramienta = herramienta;
		this.plataforma = plataforma;
	}

	//NO se puede modificar la definición de este método
	Object calcula()
	{
		int numero = 78;
		char temp = (char)numero;
		temp = (char)((int)temp + 1);
		//Debe devolver temp 
		return temp;
	}	
	
	public String toString()
	{
		return super.toString() + " mediante " + herramienta + " y plataforma " + plataforma;
	}

	public static void setFACTORCORRECCION(double factorCorrecion)
	{
	  FACTOR_CORRECCION = factorCorrecion;
	}
}
