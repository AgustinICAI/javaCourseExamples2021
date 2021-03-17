package examenInter2013.util;

import examenInter2013.profesor.Init;

public class ObjectGenerator
{
	static Object generate()
	{
		Init in = new Init();
		double d0 = Math.ramdom();
		if (d0 < 0.33)
			return new Persona(in.getNombre(),in.getEdad());
		else if (d0 < 0.66)
		  return new Coche(in.getMarca(),in.getCaballos());
		else
		  return new Alumno(in.getNombre(),in.getEdad(),in.getNotaMedia());
	
	}


}
