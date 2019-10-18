package application;

public class Estudiante<T> {
	
	private int calificacion;
	private T nombre;
	private T matricula;
	private Estudiante<T> siguiente;
	
	public Estudiante(int calificacion, T nombre, T matricula) {
		super();
		this.calificacion = calificacion;
		this.nombre = nombre;
		this.matricula=matricula;
	}
	
	
	public Estudiante<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Estudiante<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public T getNombre() {
		return nombre;
	}
	public void setNombre(T nombre) {
		this.nombre = nombre;
	}
	
	
	public T getMatricula() {
		return matricula;
	}
	public void setMatricula(T matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	

}
