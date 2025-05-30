package tpeMATIMARIAN;

import java.util.ArrayList;
import java.util.List;

public class Greedy {
	
	
	public static void GreedyMethod(int total, List<Maquina> maq) {
		  List<Maquina> secuencia = new ArrayList<>();
		  int resto = total;
		  int candidatosConsiderados = 0;
		  
		  while(resto > 0) {
			  boolean flag = false;
			  for(Maquina m : maq) {
				  candidatosConsiderados++;
				  if(m.getPiezas() <= resto) {
					  secuencia.add(m);
					  resto = resto - m.getPiezas();
					  flag = true;
					  break;
				  }
				  
			  }
			  if(!flag) {
				  System.out.println("No hay maquinas con ese numero");
			  }
		  }
	        // Mostrar resultados
	        System.out.println(total);
	        System.out.println("Candidatos evaluados: " + candidatosConsiderados);
	        for(Maquina m : secuencia) {
	        	System.out.println(m.getNombre() + "-" + m.getPiezas());
	        }
	}
	/*
	public static void main(String[] args) {
		Maquina m1 = new Maquina("M1", 7);
		Maquina m2 = new Maquina("M2", 8);
		
		List<Maquina> maquinas = new ArrayList<Maquina>();
		maquinas.add(m1);
		maquinas.add(m2);
		
		Greedy.GreedyMethod(14, maquinas);
		
		
	}
	*/

}
