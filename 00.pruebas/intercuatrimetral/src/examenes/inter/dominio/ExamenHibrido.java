package examenes.inter.dominio;

public class ExamenHibrido extends Examen
{
  static double FACTOR_CORRECCION = 1.1d;
	String plataforma;

	public ExamenHibrido(String nombre, double dificultad, String plataforma)
	{
	  super (nombre, dificultad);
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
		return super.toString() + " mediante plataforma " + plataforma;
	}
	
	public static void setFACTORCORRECCION(double factorCorrecion)
	{
	  FACTOR_CORRECCION = factorCorrecion;
	}
	
}
