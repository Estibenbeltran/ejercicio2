import java.util.Scanner;
public class Main{
	public static void main(String[] arg){
		int opc;
		double pi=3.1416; 
		double acu,pcu,aci,a,b,c,rr,altr,atr,ptr;
		Scanner res = new Scanner(System.in);
		System.out.println("Digita la opcion que deses hacer: ");
		System.out.println("1: area cuadrado");
		System.out.println("2: area circulo");
		System.out.println("3: area triangulo");
		opc = res.nextInt();
		switch(opc){
			case 1: 
				System.out.println("Ingresa el lado del cuadrado");
				a = res.nextDouble();
				acu = (a*a);
				pcu = (a*4); 
    				System.out.println("El area del cuadrado es: "+acu);
				System.out.println("El perimetro del cuadrado es: "+pcu);
				break;
			case 2: 
				System.out.println("Ingresa el radio del circulo");
				b = res.nextDouble();
				aci = (pi*(b*b));
    				System.out.println("El area del circulo es: "+aci);
				System.out.println("El radio del circulo es: "+b);
				break;
			case 3:
				System.out.println("Ingresa el area triangulo");
				c = res.nextDouble();
				rr = Math.sqrt(3);
				ptr = (c*3);
				altr = (rr*c)/2;
				atr = (c*altr)/2;
				System.out.println("El area del triangulo es: "+atr);
				System.out.println("El perimetro del triangulo es: "+ptr);
				break;
		}
	}

}	