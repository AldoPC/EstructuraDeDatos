package application;
import javafx.scene.control.*;


public class ListaLigada<T extends Comparable<T>> {
	
	private Estudiante<T> inicial;
	private ListView<String> lista;

	
	public ListaLigada() {
		
		
	}
	
	

	public ListView<String> getLista() {
		return lista;
	}



	public void setLista(ListView<String> lista) {
		this.lista = lista;
	}

	public Estudiante<T> getInicial() {
		return inicial;
	}

	public void setInicial(Estudiante<T> inicial) {
		this.inicial = inicial;
	}
	
	public boolean estaVacia() {
		return inicial==null;
	}
	
	public void insertarAlInicio(int calificacion, T nombre, T matricula ) {
			Estudiante<T> temp=inicial;
			if (temp==null) {
				setInicial(new Estudiante<T>(calificacion, nombre, matricula));
				
			}else {
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(new Estudiante<T>(calificacion, nombre, matricula));
			}
		}
	
	
	
	public int contarElementos() {
		if(estaVacia())
			return 0;
		else {
			Estudiante<T> temp = inicial;
			int contador=0;
			while(temp!=null) {
				contador++;
				temp=temp.getSiguiente();
			}
			return contador;
		}
	}
	

	
	public Estudiante<T> encontrarNodoEnIndice(int indice){
		if(indice<contarElementos()) {
			Estudiante<T> temp = inicial;
			for(int i=0;i<indice;i++) {
				temp=temp.getSiguiente();
			}
			return temp;
		}else {
			System.out.println("Index out of bounds");
			return null;
		}
	}
	
	public int encontrarElementoEnElIndice(int indice) {
		return encontrarNodoEnIndice(indice).getCalificacion();
	}
	
	
	
	public Integer mergeEstudiante(Estudiante<T> inicial) {
		
		Estudiante<T> listaOrdenada = mergeSort(inicial);
		this.inicial = listaOrdenada;
		return null;
		
	}
	
	
	
	public Estudiante<T> mergeSort(Estudiante<T> inicial) {
		
		Estudiante<T> inicioAnterior = inicial;
		int mid = contarElementos()/2;
		
		if (inicial.getSiguiente()==null) {
			
			return inicial;
		}
		
		while(mid-1>0) {
			
			inicioAnterior=inicioAnterior.getSiguiente();
			mid--;
		}
		
		Estudiante<T> nuevoInicio = inicioAnterior.getSiguiente();
		inicioAnterior.setSiguiente(null);
		inicioAnterior = inicial;
		Estudiante<T> temp1 = mergeSort(inicioAnterior);
		Estudiante<T> temp2 = mergeSort(nuevoInicio);
	
		return merge(temp1,temp2);
		
		
	}
	
	private Estudiante<T> merge(Estudiante<T> primero, Estudiante<T> segundo){
		
		Estudiante<T> resultado = null;
		
		if(primero == null) {
			
			return segundo;
		}
		
		if(segundo == null) {
			
			return primero;
		}
		int c1=(int) primero.getCalificacion();
		int c2= (int) segundo.getCalificacion();
		if (c1<c2) {
			
			resultado = segundo;
			resultado.setSiguiente(merge(primero,segundo.getSiguiente()));
		}else {
			resultado = primero;
			resultado.setSiguiente(merge(primero.getSiguiente(),segundo));
		}
		
		return resultado;
	}
	
		
		public void imprimeLista() {
			if(estaVacia()) {
				System.out.println("Lista vacía");
			}else {
				lista.getItems().clear();
				Estudiante<T> temp = this.inicial;
				while (temp!=null) {
				lista.getItems().add("Nombre: "+ temp.getNombre().toString() + " | " + "Matricula: "+ temp.getMatricula().toString() + " | " + "Calificación: "+ temp.getCalificacion());
					temp=temp.getSiguiente(); 
				}
			}
		}
}