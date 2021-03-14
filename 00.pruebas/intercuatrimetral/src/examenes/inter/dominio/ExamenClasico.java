package examenes.inter.dominio;

public class ExamenClasico extends Examen
{
  static double FACTOR_CORRECCION = 1.0d;
  
	public ExamenClasico(String nombre, double dificultad)
	{
	  super (nombre, dificultad);
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
		return super.toString();
	}
	
	public static void setFACTORCORRECCION(double factorCorrecion)
	{
	  FACTOR_CORRECCION = factorCorrecion;
	}
}
