import java.util.Scanner;

public class Main {
	
	//Estas variables son public para que puedan usarlas todos los metodos que se encuentran en el main, y son final, ya que son constantes y no van a estar cambiand
	public static final String TowerSource = "First Tower";
	public static final String ExtraTower = "Second Tower";
    public static final String TowerGoal = "Third Tower";
    

	public static void main(String[] args) {
		//Se crea el Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of plates");
		//Ingresamos el numero de discos que vamos a usar
        int numOfPlates = sc.nextInt();
        //Se llama al metodo towersOfHanoi, dentro de el esta la recursion
        //El orden de las variables es importante, como se puede ver, primero se ingresa la primera torre, luego la tercera y por ultimo la segunda
        //Esto es para que el caso base se pueda cumplir
        
        towersOfHanoi(numOfPlates, TowerSource, TowerGoal, ExtraTower);
        sc.close();
        
	}
	
	public static void towersOfHanoi (int numOfPlates, String TowerSource, String TowerGoal, String ExtraTower) {
		//Este es el caso base, en donde si solo se tiene un disco, imprimira que de la primera torre, el disco ira a la tercera torre, pues si solo es un disco el restante, la movida que falta es que vaya de la torre de origen a la torre meta
		if(numOfPlates == 1){
			
			System.out.println(TowerSource + " to " + TowerGoal);
			
		}else {
			//Aqui, hacemos la recursion al volver a llamar al metodo, solo que ahora el orden de las torres cambia
			//Cambiamos cual es la torre de origen y cual es la torre meta
			towersOfHanoi(numOfPlates - 1, TowerSource, ExtraTower, TowerGoal);
			System.out.println(TowerSource + " to " + TowerGoal);
			//Aqui se cambia de nuevo el orden de las torres para que de esta manera, se pueda seguir resolviendo el rompecabezas y poder imprimir bien los pasos que toman
			towersOfHanoi(numOfPlates - 1, ExtraTower, TowerGoal, TowerSource);
		}
		
	}

}
