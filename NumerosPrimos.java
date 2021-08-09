/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author Vaio
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resultado = "";
        int contador =0;
        int numero = 1;
        while(contador<100){
            if(esPrimo(numero)){
                resultado += numero + ", ";
                    contador++;

            }
            numero++;
        }
    System.out.println("los primoeros 100 numero primos son "+ resultado);
    }
    private static boolean esPrimo(Integer numero){

        boolean esUnNumeroPrimo = true;
    
    for(int i=2; i<numero;i++){
        if (numero % i==0){
            esUnNumeroPrimo = false;
        }
        
    }
    return esUnNumeroPrimo;
    }
}
