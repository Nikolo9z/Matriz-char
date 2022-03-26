
package solemnetwo;

import java.util.Scanner;

public class Operacion {
        private char[][] matriz=new char[4][4];
        Matriz m1=new Matriz();
        Scanner l=new Scanner(System.in);
    
    
    public void mostrar(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("La matriz es"+ matriz[i][j]);
                
            }
        }
        
    }
    public void agregar(){
        mostrar();
        System.out.println("Ingrese la fila");
        int fila=l.nextInt();
        System.out.println("Ingrese la columna");
        int columna=l.nextInt();
        if (matriz[fila][columna]!='x') {
                    matriz[fila][columna]=m1.getElemento();
            
        }
        else{
            System.out.println("El espacio esta ocupado");
        }
    }
    public void Menu(){
        Scanner a=new Scanner(System.in);
        int opcion=0;
        boolean b=false;
        do{
            do{
                b=false;
                try{
                      System.out.println("Menu Matriz");
            System.out.println("Presione:");
            System.out.println(" -1) Si desea Agregar\n"
                    + " -2) Si desea Mostrar\n"
                    + "3) para salir. ");
            opcion=a.nextInt();
                }catch(Exception e){
                    System.out.println("no es un numero");
                    b=true;
                    a.nextLine();
                }
                }while(b==true);
            switch(opcion){
                case 1 -> {agregar();
                }
                case 2 -> {mostrar();}
            }     
        } while (opcion!=3);
    }
}
