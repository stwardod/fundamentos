/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class CuentaBancaria {
     public static void main(String[] args) {
      int cuenta = 0;
      String decision;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Introduzca la accion");
      decision = scanner.next();
      while (decision.compareTo("s") != 0) {
          if (decision.compareTo("d") == 0) {
              System.out.println("Introduzca el monto a debitar: ");
              int monto = scanner.nextInt();
              
              int remanente = cuenta - monto;
              if (remanente >= 0){
                  cuenta = cuenta - monto;
                  System.out.println("Debito listo! Quedan: $"+ cuenta);
              }else{
                  System.out.println("No tiene fondos suficientes. Solo tiene $" + cuenta);
              }
          }else if (decision.compareTo("c") == 0) {
              System.out.print("Introduzca el monto a acreditar: ");
              int monto = scanner.nextInt();
              cuenta = cuenta + monto;
              System.out.println("Credito listo! Quedan: $" + cuenta);
             
          }
          System.out.println("Introduzca la accion:");
          decision = scanner.next();
      }
      System.out.print("Al final quedaron: $" + cuenta);
      
              }

    
}
