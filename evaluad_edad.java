import java.util.*;
public class evaluad_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("por favor introdusca su edad: ");
		
		int edad= entrada.nextInt();
		
		if(edad <18) {
			System.out.println("eres un adolecente");
			
			
		}
		else if(edad<40){
			System.out.println("eres un maduro");
			
		}
		else if(edad<65) {
			System.out.println("eres un viejito");
		}
		else {
			System.out.println("cuidate");
			
		}
	}
		

	

}
