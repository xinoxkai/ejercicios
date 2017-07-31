/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author juanh
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        cuentas cuenta[] = new cuentas[3];

 int selec,C;
 String name;
 double pisto;
 
do{
 do{
System.out.println("que accion desea realizar");
System.out.println("digite el numero para decidir la accion");
System.out.println("1-Crear cuenta\n2-ingresar dinero en la cuenta\n3-retirar dinero de la cuenta\n4-ver las cuentas existentes");
selec = leer.nextInt();

switch (selec) {

	case 1:
            int i=0;
	do {
    
            System.out.println("ingrese el nombre del titular");
            name=leer.next();

            System.out.println("ingrese la cantidad inicial de la cuenta");
            pisto = leer.nextDouble();


            cuenta[i] = new cuentas(name,pisto);

            System.out.println("desea seguir creando cuentas");
            System.out.println("digite el numero \n1-si\n2-no");
            C = leer.nextInt();
            i=i+1;
            //puede dar error si se ingresa mas del indice del areglo y no se como se condiciona eso
            
        } while (C==1);

                break;
                      
            case 2:
                
        do{ 
            System.out.println("seleciones la cuenta en la que se depositara");
            i = leer.nextInt();


            System.out.println("digite la cantidad de dinero a ingresar");
            pisto = leer.nextInt();
   
            cuenta[i].ingresar(pisto);

            System.out.println("desea seguir");
            System.out.println("digite el numero \n1-si\n2-no");
            C = leer.nextInt();

        } while (C== 1);

                break;
                
            case 3:

                do{ 
            System.out.println("seleciones la cuenta en la que se depositara");
            i = leer.nextInt();


            System.out.println("digite la cantidad de dinero a retirar");
            pisto = leer.nextInt();

            cuenta[i].retirar(pisto);

            System.out.println("desea seguir");
            System.out.println("digite el numero \n1-si\n2-no");
            C = leer.nextInt();

        } while (C== 1);

                break;
                
             case 4:
                
                 for (int j = 0; j < 3; j++) {
                     
                     System.out.println("nombre:   "+cuenta[j].getTitular()+"----dinero: $"+cuenta[j].getCantidad());
                     
                 }
                 
                break;
            default:
                System.out.println("el numero ingresado es invalido");     
        
     }        
 } while (selec>=5);
 
 
             System.out.println("desea seguir");
            System.out.println("digite el numero \n1-si\n2-no");
            C = leer.nextInt();
 
 } while (C==1);
    }

}

    
    






	






        
        
        

