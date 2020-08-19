import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner entrada = new Scanner(System.in);
	 int aleatorio =(int)(Math.random()*100);
	 
	 
	 int numero= 0;
	 int intentos= 0;
	 
	 while(numero !=aleatorio){
		intentos ++; 
		 System.out.println("introduce un numero, por favor");
		 numero = entrada.nextInt();
		 
	 if(numero < aleatorio) {
			 
			 System.out.println("mas alto");
			 
		 }
		  else if(numero>aleatorio ) {
			 System.out.println("mas bajo");
			 
			 
		 }
	 
	 }
	 
	System.out.println("correcto, acertaste en "+intentos+ " intentos");
	 
	}
}
