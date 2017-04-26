/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgarzag.proyecto.pkgfinal.p4;

/**
 *
 * @author Carlos Rafael
 */
import javax.swing.JOptionPane;
import java.util.*;
public class SPP2CGarzaGProyectoFinalP4 {

    /**
     4.	Realiza un programa en Java que muestre un Menú con 3 opciones: Opción 1: Inventario, Opción 2: Vender, Opción 3: Salir. 
     * Al presionar la Opción 1 el usuario podrá introducir un artículo con los campos clave, descripción y precio unitario, 
     * deberá guardarlos en un arreglo. Al presionar la opción 2, el usuario introducirá una clave de productos ya registrados 
     * para guardarlos en otro arreglo, la opción deberá repetirse hasta presionar el botón Cancelar, 
     * después deberá mostrar el total a pagar de los artículos introducidos, si se introduce alguna clave inexistente 
     * deberá notificarse al usuario. 
     * @param args the command line arguments
     * Carlos Rafael Garza García A01411468
     */
    public static void main(String[] args) {
     int [] inventario=new int[222];  
        int []vender=new int [444];
        
        int x=0;                            
        
        
        for (int w=0;w<232;w++){    
        x= menu();  
        switch(x){
            case 0:
             JOptionPane.showMessageDialog(null,"Caracteristicas del producto");
             String me= "Ingrese el precio";
             String nombre=inventNombre();              
             inventario[w]=inventValor(me);
             int u=w+1;
             JOptionPane.showMessageDialog(null,"El nombre del producto registrado es "+nombre+". La clave sera= "+u);
            break;
            case 1:
                int n;
                int y;               
                String ma="Ingrese la clave del producto a vender";
                n=inventValor(ma);
                
                y=inventario[n-1];
                if(y>0){
                   vender[w]=n; 
                }else{
                    JOptionPane.showMessageDialog(null, "La clave ingresada no cuenta con ningun valor");
                }   
                break;
            case 2:
                sumaTotal(inventario,vender);
                System.exit(0);
                break;
        } 
        }
        
        
        }
    
public static void sumaTotal(int[]inventario,int[] ventas){
    int suma=0;
    int n=0;
    int g;
    for (int i=0;i<ventas.length;i++){
        if (ventas[i]>0){
            g=ventas[i]-1;
          n= inventario[g];
            suma=suma+n;
        }else{
            suma=suma;
        }         
    }
    
    JOptionPane.showMessageDialog(null,"La suma total seria de "+suma+"¡Hasta luego!");       
}
public static int menu(){
    String[]opciones ={"Inventario","Vender","Salir"};
     int x=JOptionPane.showOptionDialog(null
                ,"Escoje entre las siguientes opciones"
                ,null
                ,JOptionPane.DEFAULT_OPTION
                ,JOptionPane.INFORMATION_MESSAGE
                ,null
                ,opciones
                ,null
             );
     return x;
}

public static int inventValor(String me){
    int n=0;    
    Scanner kb=new Scanner(System.in);
    boolean flag;
    do{
    try{
        String x=JOptionPane.showInputDialog(null,me);
        n=new Integer (x);
        flag=false;
    }catch (Exception er){
        JOptionPane.showMessageDialog(null,"Intententelo de nuevo");
        kb.nextLine();
        flag=true;
    }
    }while(flag);      
    return n;
}
public static String inventNombre(){
    String x=JOptionPane.showInputDialog(null,"Ingresar nombre del producto");
    return x;
} 
}    
