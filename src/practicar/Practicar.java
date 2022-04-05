/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicar;

/**
 *
 * @author Nicole
 */
public class Practicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int a=5;
       int b=4;
       
      // int resultado=SumarNumero(a, b);
       // System.out.println("El resultado es: "+resultado);
       
        System.out.println("El resultado es: "+SumarNumero(a, b));
        
        int d=2;
        int e=9;
       
        System.out.println(SumarNumeros(d, e));
}
    
    public static int SumarNumero(int x, int y){
        int reultad=x+y;
        return reultad;
    }
    
    
    public static String SumarNumeros(int m, int n){
        int resultado=m+n;
        return "El resultado es: "+resultado;
    }
    
    
}
