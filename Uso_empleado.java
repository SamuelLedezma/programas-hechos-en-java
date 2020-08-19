package poo;
import java.util.*;
public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primera froma de hacerlo lleva mucho codigo
		/*empleado empleado1= new empleado("rodri", 85000, 1990, 12, 17);
		empleado empleado2= new empleado("pablo", 95000, 1995, 06, 02);
		empleado empleado3= new empleado("martin", 105000, 2002, 03, 15);

		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("nombre: "+empleado1.dameNombre()+" sueldo: "+ empleado1.dameSueldo()+
				" fecha de alta: "+empleado1.dameFechaContrato());
		System.out.println("nombre: "+empleado2.dameNombre()+" sueldo: "+ empleado2.dameSueldo()+
				" fecha de alta: "+empleado2.dameFechaContrato());
		System.out.println("nombre: "+empleado3.dameNombre()+" sueldo: "+ empleado3.dameSueldo()+
				" fecha de alta: "+empleado3.dameFechaContrato());
	*/
		//esta es la segunda forma de hacerlo mejora las lineas
		Jefatura jefe_RRHH= new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		empleado [] misEmpleados= new empleado[6];
		misEmpleados[0]=new empleado("rodri", 30000, 2000, 7, 07);// esto seria la alternativa a crear un array con muchos tipos de datos distintos
		misEmpleados[1]=new empleado("pablo", 50000, 1995, 6, 15);
		misEmpleados[2]=new empleado("martin", 25000, 2005, 9, 25);
		misEmpleados[3]=new empleado("Antonio", 47500, 2009, 11, 9);
		misEmpleados[4]=jefe_RRHH; // POLIMORFISMO EN ACCION. PRINCIPIO DE SUSTITUCION
		misEmpleados[5]= new Jefatura("Maria", 95000, 1999, 5, 26);
		
		
		/*for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for(empleado e: misEmpleados) { // bucle for mejorado
			e.subeSueldo(5);
		}
		
		/*for(int i=0;i<3;i++) {
			System.out.println("nombre: "+misEmpleados[i].dameNombre()+ " sueldo: "+misEmpleados[i].dameSueldo()+
					" fecha de alta: "+ misEmpleados[i].dameFechaContrato());
		}*/
		for(empleado e:misEmpleados) { //for mejorado aconsejable hacerlo
			System.out.println("nombre: "+e.dameNombre()+ " sueldo: "+e.dameSueldo()+
					" fecha de alta: "+ e.dameFechaContrato());
		}
	}

}
class empleado{  //clase
	 public empleado(String nom, double sue, int anio, int mes, int dia) {//este es el constructor
		
		 nombre =nom;
		 sueldo =sue;
		 GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);//objetivo construye una fecha nada mas para darle valor al objeto calendario
		 altaContrato = calendario.getTime();
		 ++IdSiguiente;
		 Id=IdSiguiente;
	 }
	 public empleado(String nom) {
		 this(nom, 30000, 2000, 1, 1);
	 }
	 public String dameNombre() {//getter
		return nombre + " Id: " +Id;
	 }
	 public double dameSueldo() { //getter
		 return sueldo;
	 }
	 public Date dameFechaContrato() {// getter
		 return altaContrato;
	 }
	 public void subeSueldo(double porcentaje) {// setter
		 double aumento= sueldo*porcentaje/100;
	 sueldo +=aumento;
	 }
	 
	 private String nombre;
	 private double sueldo;
	 private Date altaContrato;
	 private static int IdSiguiente;
	 private int Id;
} 
	 class Jefatura extends empleado {
		 public Jefatura(String nom, double sue, int anio, int mes, int dia) {
			super( nom, sue, anio, mes, dia ); // depende de los parametros q le pasemos va a usar el constructor por defecto o el nuevo
		 
		 }
	 public void estableceIncentivo(double b ) { // inventamos un variable b para el procedimiento
		 incentivo = b;
	 }
	 
	 public double dameSueldo(){
		 
		 double sueldoJefe = super.dameSueldo();
		 
		 return sueldoJefe + incentivo;
	 }
	 private double incentivo;
	 }

