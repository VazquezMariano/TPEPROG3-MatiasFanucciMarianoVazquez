package tpeMATIMARIAN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Backtracking {
	
	
	public static class Resultado {
	    List<Maquina> secuencia = new ArrayList<>();
	    int llamadas = 0;
	}
	
	public Resultado backtrackingOptimo(int objetivo, List<Maquina> maq) {
		Collections.sort(maq);
		Resultado resultado = new Resultado();
	    backtracking(objetivo, maq, new ArrayList<>(), 0, resultado);
	    return resultado;
	}

	public static void backtracking(int objetivo, List<Maquina> maquinas, List<Maquina> actual, int sumaActual, Resultado resultado) {
	    resultado.llamadas++;
	    if (sumaActual > objetivo) return;

	    if (sumaActual == objetivo) {
	        if (resultado.secuencia.isEmpty() || actual.size() < resultado.secuencia.size()) {
	            resultado.secuencia = new ArrayList<>(actual);
	        }
	        return;
	    }

	    for (Maquina m : maquinas) {
	        actual.add(m);
	        backtracking(objetivo, maquinas, actual, sumaActual + m.getPiezas(), resultado);
	        actual.remove(actual.size() - 1);
	    }
	}
}
