import java.util.*;

import com.zubiri.geometria.*;


public class OperacionesGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecla1=new Scanner(System.in);
		String opcion=" ";
		
		System.out.println("Elige una figura geometrica:");
		System.out.println("a) Circulo");
		System.out.println("b) Rectangulo");
		
		opcion=tecla1.next();
		
		Scanner tecla2=new Scanner(System.in);
		double radio=0; double base=0; double altura=0;
		
		if ((opcion.equalsIgnoreCase("a"))||(opcion.equalsIgnoreCase("b"))){
			if (opcion.equalsIgnoreCase("a")){
				Circulo c1=new Circulo();
				System.out.println("Circulo");
				System.out.println("Introduce el radio:");
				radio=tecla2.nextDouble();
				c1.setRadio(radio);
				System.out.println("Area: "+c1.calculaArea());
				System.out.println("Perimetro: "+c1.calculaPerimetro());
			}
			if (opcion.equalsIgnoreCase("b")){
				Rectangulo r1=new Rectangulo();
				System.out.println("Rectangulo");
				System.out.println("Introduce la base:");
				base=tecla2.nextDouble();
				r1.setBase(base);
				System.out.println("Introduce la altura:");
				altura=tecla2.nextDouble();
				r1.setAltura(altura);
				System.out.println("Area: "+r1.calculaArea());
				System.out.println("Perimetro: "+r1.calculaPerimetro());
			}

		}else{
			System.out.println("Opcion no valida");
		}
		
	}

}
