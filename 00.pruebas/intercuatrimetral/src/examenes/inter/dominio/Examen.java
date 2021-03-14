package examenes.inter.dominio;

public abstract class Examen
{
	String nombre;
	double dificultad; //del 0 al 1, expresa porcentaje de dificultad: 0.0 muy fácil, 1.0 muy difícil
  
	Examen(String nombre, double dificultad)
	{
		this.nombre = nombre;
		this.dificultad = dificultad;
	}

	//NO se puede modificar la definición de este método
	private Object calcula()
	{
		int numero = 78;
		char temp = (char)numero;
		//Debe devolver temp
		return temp; //Internamente java hace Character.valueOf(temp);
	}	
  
	/*
	Método a implementar para que devuelva al abreviatura de una asignatura, siempre 3 caracteres.
	Por ejemplo: de la asignatura programación orientada a objetos, deberá devolver: POO.
	De circuitos Electrónicos: CEL
	De Teoría de la Comunicación: TDL
	De Sistemas Digitales II: SDI
	De estadística: EST
	*/
	public String getAbreviatura()
	{
    String cad[] = nombre.toUpperCase().split(" ");
    if (cad.length == 0)
      return null;
    else if(cad.length == 1)
      return cad[0].substring(0,3);
    else if (cad.length == 2)
      return cad[0].substring(0,1) + cad[1].substring(0,2);
    else
      return cad[0].substring(0,1) + cad[1].substring(0,1) + cad[2].substring(0,1);
	}

	public String toString()
	{
		return nombre + "["+ this.getAbreviatura()+ "]" + " (" + dificultad + ")";
	}
  double getDificultad()
	{
		return this.dificultad;
	}

}
