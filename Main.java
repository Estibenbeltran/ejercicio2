import java.util.Scanner;
Public class Main{
	public static void main(String[] arg){
	int opc;
	float pi=3.1416; 
	double acu,pcu,aci,a,b,c,cap,rr,altr,atr,ptr;
	Scanner cap = new Scanner(System.in);
	System.out.println("Digita la opcion que deses hacer: ");
	System.out.println("1: area cuadrado");
	System.out.println("2: area circulo");
	System.out.println("3: area triangulo");
		switch(opc){
			case 1: 
			System.out.println("Ingresa el lado del cuadrado");
			a = cap.nextDouble();
			acu = (a*a);
			pcu = (a*4); 
    			System.out.println("El area del cuadrado es: "+acu);
			System.out.println("El perimetro del cuadrado es: "+pcu);
			break;

			case 2: 
			System.out.println("Ingresa el radio del circulo");
			b = cap.nextDouble();
			aci = (pi*(b*b));
    			System.out.println("El area del circulo es: "+aci);
			System.out.println("El radio del circulo es: "+b);
			break;

			case 3:
			System.out.println("Ingresa el area triangulo");
			c = cap.nextDouble();
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