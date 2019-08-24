package presentation;
import java.util.EnumSet;
import java.util.Scanner;

import presentation.TypeOfFigure.figuras;
import presentation.TypeOfFigure.operaciones;
import shapes.Circle;
import shapes.Equilateral;
import shapes.Isosceles;
import shapes.Rectangle;
import shapes.Scalene;
import shapes.Shape;
import shapes.Square;

public class LayerPresentation {
	
	public LayerPresentation() {
		
		
	}
	//Scanner se delcara static para que se use en varios metodos
	static Scanner sc= new Scanner(System.in);
	
	//Todos los metodos son statics ya que se mandan a llamar en el main
	
		//En este método se pregunta cual es la figura que vamos a estar calculando su perimetro o área
		public static figuras askForFigure() {
			System.out.println("Elige la figura:");
			int i=0;
			//For each del enum
			for (figuras texto : EnumSet.allOf(figuras.class)) {
				i++;
			    System.out.println(i + "- " + texto);
			}
			
			String selectedOption="1";
			//Eliges la figura
			selectedOption=sc.nextLine();
			//Regresa la seleccion hecha
			return figuras.values()[Integer.parseInt(selectedOption)-1];
		}
		//En este método se preguntan por los datos de la figura
		public static Shape askForData (figuras selectedOption) {
			

			Shape shape;
			shape=null;
		
			switch(selectedOption) {
			
			//En el caso cuadrado, se preguntara por los lados de un cuadrado y se guardara esa figura
				case cuadrado:
					System.out.println("Dame el lado del cuadrado: ");
					double side= sc.nextDouble();
					shape= new Square(side);
					shape.setName("Cuadrado");
					break;
			//En el caso circulo, se preguntara por el radio de un circulo y se guardara esa figura
				case circulo:
					System.out.println("Dame el radio del círculo");
					double radius=sc.nextDouble();
					shape=new Circle(radius);
					shape.setName("Círculo");
					break;
			//En el caso rectangulo, se preguntara por los lados de un rectangulo y se guardara esa figura
				case rectangulo:
					System.out.println("Dame la anchura del rectángulo: ");
					double width= sc.nextDouble();
					sc.nextLine();
					System.out.println("Dame la altura del rectángulo: ");
					double heightRec= sc.nextDouble();
					shape= new Rectangle(width,heightRec);
					shape.setName("Rectángulo");
					break;
			//En el caso de que sea alguno de los triangulos, se guarda que triangulo es en una variable y se imprime un texto especificando que todos los datos recopilados son de un triangulo
				case escaleno:
				case isoceles:
				case equilatero:
					
					double base;
					double heightTrian;
					double side1;
					double side2;
					
					figuras typeOfTriangle=selectedOption;
					System.out.println("Datos para el triángulo " + typeOfTriangle.toString());

					switch (typeOfTriangle) {
					
					 //En el caso equilatero, solo se pide un lado y la altura
					case equilatero:
						System.out.println("Dame un lado:");
						base= sc.nextDouble();
						System.out.println("Dame la altura:");
						heightTrian= sc.nextDouble();
						shape= new Equilateral (base, heightTrian);
						
						shape.setName("Triángulo Equilátero");
					break;
					//En el caso escaleno, se piden todos los lados y la altura
					case escaleno:
						System.out.println("Dame un lado:");
						side1= sc.nextDouble();
						System.out.println("Dame otro lado:");
						side2= sc.nextDouble();
						System.out.println("Dame la base:");
						base= sc.nextDouble();
						System.out.println("Dame la altura:");
						heightTrian= sc.nextDouble();
						shape= new Scalene (side1, side2, base, heightTrian);
						shape.setName("Triángulo Escaleno");
					break;
					//Este default hace el papel del isoceles, en el cual solo pide un lado, la base y la altura
					default:
						System.out.println("Dame un lado:");
						side1= sc.nextDouble();
						System.out.println("Dame la base:");
						base= sc.nextDouble();
						System.out.println("Dame la altura:");
						heightTrian= sc.nextDouble();
						shape= new Isosceles(side1, base, heightTrian);
						shape.setName("Triángulo Isóceles");
					break;
					
					
					
					
					}
					
					break;
					
				default:
				//Aqui se realiza este proceso para poder inicializar shapes y que no haya problemas en el resto del programa
					System.out.println("Dame el lado del cuadrado: ");
					double sideD= sc.nextDouble();				
					shape=new Square(sideD);
					shape.setName("Cuadrado");
					break;
			}
			sc.nextLine();
			return shape;
			
			
			
		}
		//En este metodo se pregunta por que operacion se va a realizar	
		public static operaciones askForOperation() {
			
			//Aquí decides si quieres calcular el área o el perímetro
			System.out.println("¿Qué deseas calcular?");
			int i=0;
			//For each del enum
			for (operaciones operacion : EnumSet.allOf(operaciones.class)) {
				i++;
			    System.out.println(i + "- " + operacion);
			}
			
			String selectedOperation="1";
			//Eliges la operacion
			selectedOperation=sc.nextLine();
			//Regresa la seleccion hecha
			return operaciones.values()[Integer.parseInt(selectedOperation)-1];
		}
		
		//En este metodo imprimes el resultado
		public static void printResult(Shape shape, operaciones operacion) {
			switch(operacion) {
			//Si eliges el caso area, con el método calculateArea que se encuentra en Shape.java
				case area:
					System.out.println("El área del " + shape.getName());
					System.out.println("Resultado: " + shape.calculateArea());
					break;
					//Default hace el papel de perimetro, y hace la operacion con el metodo calculatePerimeter que se encuentra en Shape.java
				case perimetro:
					System.out.println("El perímetro del " + shape.getName());
					System.out.println("Resultado: " + shape.calculatePerimeter());
					break;
				default:
					break;
			}
			//En caso de que operacion no sea ninguna, pide que se presione una tecla para continuar, de esta manera puedes ver cual fue el resutlado de la operacion
			//Aqui muestra un warning ya que readLine en si nunca se usa como lo espera el IDE, pero en realidad de usa como un tipo de ReadLine que se encuentra en C#
			if (operacion != operaciones.ninguna) {
			System.out.println("Presiona Enter para continuar");
			String readLine=sc.nextLine();
			}
		}

		//En este metodo imprime un mensaje indicando que se acabo el programa
		public static void goodbyeMessage() {
			
			System.out.println("El programa ha finalizao");
		}
}