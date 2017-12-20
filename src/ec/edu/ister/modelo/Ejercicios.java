/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;


import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author HP
 */
public class Ejercicios {
    private int [] arreglo;
    private String [] nombre;
    private int [] edad;
    private int [] vector;
    private int menor;
    private String []pais;
    private String []estudiante;
    private int []nota;
    private String []paises;
    private int [] habitantes; 

    public void arregloElementos(){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos desea ingresar: "));
        arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
        arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros: "));
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(arreglo));
    }

    public void imprimir(){
         int  suma = 0;
         for (int i = 0; i < arreglo.length; i++) {
             suma+=arreglo[i];
        }
         JOptionPane.showMessageDialog(null,"La suma de los elementos es :"+suma);
    }

    public void datosPersonas(){
        nombre=new String[5];
        edad=new int[5];
            for(int f=0;f < nombre.length;f++) 
            {
                nombre[f]=JOptionPane.showInputDialog("Nombre:");
                edad[f]=Integer.parseInt(JOptionPane.showInputDialog("Edad:"));      
            }
             JOptionPane.showMessageDialog(null,"Nombres"+Arrays.toString(nombre)+ "\nEdades"+ Arrays.toString(edad));  
        }
    

        public void mayoresEdad() 
        {
          JOptionPane.showMessageDialog(null,"Personas mayores de edad.");
          for(int k=0;k < nombre.length;k++) 
            {
                if (edad[k] >= 18) 
                {
                   JOptionPane.showMessageDialog(null,nombre[k]+ " - " + edad[k]);
                }
    	    }
        }

        public void cargar(){
            int n;
            n=Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos desea cargar:"));
             vector = new int[n];
             for(int f=0;f<vector.length;f++) {
           vector[f]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los componentes:"));     
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(vector));
    }

        public void imprimirMenor(){ 
        menor = vector[0];
        for(int f=1;f<vector.length;f++) {
            if (vector[f]<menor) {
                menor=vector[f];
            }
        }
       JOptionPane.showMessageDialog(null,"El valor menor es"+menor);       
    }

    public void repiteMenor() {
        int cant=0;
        for(int f=0;f<vector.length;f++) {
            if (vector[f]==menor) {
                cant++;
            }
        }
        if (cant>1) {
             JOptionPane.showMessageDialog(null,"Se repite el menor en el vector.");    
        } else {
             JOptionPane.showMessageDialog(null,"No se repite el menor en el vector.");
        }
    }

    public void paìses(){
        pais=new String[5];
         for(int f=0;f < pais.length;f++){
           pais[f]=JOptionPane.showInputDialog("Ingrese el nombre de los paìses:");  
         }
         JOptionPane.showMessageDialog(null,"Paises"+Arrays.toString(pais)); 
    }

    public void ordenar() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (pais[f].compareTo(pais[f+1])>0) {
                    String aux;
                    aux=pais[f];
                    pais[f]=pais[f+1];
                    pais[f+1]=aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Paises ordenados en forma alfabética:");
         JOptionPane.showMessageDialog(null,pais);
    }

    public void alumnos(){
        estudiante=new String[5];
        nota=new int[5];
            for(int f=0;f < estudiante.length;f++) 
            {
                estudiante[f]=JOptionPane.showInputDialog("Nombre del estudiente:");
                nota[f]=Integer.parseInt(JOptionPane.showInputDialog("Nota:"));      
            }
            JOptionPane.showMessageDialog(null,"Nombres"+Arrays.toString(estudiante));  
            JOptionPane.showMessageDialog(null,"Notas"+Arrays.toString(nota));
    }

    public void ordenarN(){
        for(int k=0;k<nota.length;k++) {
            for(int f=0;f<nota.length-1-k;f++) {
                if (nota[f]<nota[f+1]) {
                    int auxnota;
                    auxnota=nota[f];
                    nota[f]=nota[f+1];
                    nota[f+1]=auxnota;
                    String auxnombre;
                    auxnombre=estudiante[f];
                    estudiante[f]=estudiante[f+1];
                    estudiante[f+1]=auxnombre;
                }
        }
        JOptionPane.showMessageDialog(null,"Nombres de alumnos y notas de mayor a menor");
        for(int f=0;f<nota.length;f++) {
            JOptionPane.showMessageDialog(null,estudiante[f]+ " - " + nota[f]);
    }
   }
   }
        public void cargarPaises() {
        paises=new String[5];
        habitantes=new int[5];
        JOptionPane.showMessageDialog(null,"Carga de paises y habitantes");
        for(int f=0;f<paises.length;f++) {
            paises[f]=JOptionPane.showInputDialog("Pais:");
            habitantes[f]=Integer.parseInt(JOptionPane.showInputDialog("Numero de habitantes:"));
        }
           JOptionPane.showMessageDialog(null,"Pais"+Arrays.toString(paises));  
            JOptionPane.showMessageDialog(null,"Habitantes"+Arrays.toString(habitantes)); 
    }  

    public void ordenarNombres() {
        for(int k=0;k<paises.length;k++) {
            for(int f=0;f<paises.length-1-k;f++) {
                if (paises[f].compareTo(paises[f+1])>0) {
                    String auxpais;
                    auxpais=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=auxpais;
                    int auxhabitante;
                    auxhabitante=habitantes[f];
                    habitantes[f]=habitantes[f+1];
                    habitantes[f+1]=auxhabitante;
                }
            }
        }
        for(int f=0;f<paises.length;f++) {
            JOptionPane.showMessageDialog(null,paises[f] + " - " + habitantes[f]);
    } 
    }     

    public void ordenarHabitantes() {
        for(int k=0;k<paises.length;k++) {
            for(int f=0;f<paises.length-1-k;f++) {
                if (habitantes[f]<habitantes[f+1]) {
                    String auxpais;
                    auxpais=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=auxpais;
                    int auxhabitante;
                    auxhabitante=habitantes[f];
                    habitantes[f]=habitantes[f+1];
                    habitantes[f+1]=auxhabitante;
                }
            }
        }
        for(int f=0;f<paises.length;f++) {
            JOptionPane.showMessageDialog(null,paises[f] + " - " + habitantes[f]);
        }
    }
          
     public  void menuOpciones(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("MENU DE OPCIONES: \n\n"
               + "1.- Arreglo de los elementos\n"
               + "2.- Imprimir los elementos\n"
               + "3.- Datos de las personas\n"
               + "4.- impresion de los mayores de Edad\n"
               + "5.- Cargar los elementos\n"
               + "6.- Imprimir mensaje menor\n"
               + "7.- Repite Menor\n"
               + "8.- Nombre Paises\n"
               + "9.- Ordenar\n"
               + "10.-Alumnos\n"
               + "11.-Ordenar Notas\n"
               + "12.-Cargar Paises\n"
               + "13.-Ordenar Por Nombres\n"
               + "14.-Ordenar por Habitantes\n"
               + "15.- SALIR\n\n"));
        
       switch(op){
           
           case 1:
               arregloElementos();
               break;
           case 2:
               imprimir();
               break;
           case 3:
               datosPersonas();
               break;
           case 4:
               mayoresEdad();
               break;
           case 5:
               cargar();
               break; 
           case 6:
               imprimirMenor();
               break;
           case 7:
               repiteMenor();
               break;
           case 8:
               paìses();
               break;
           case 9:
               ordenar();
               break;
           case 10:
               alumnos();
               break;
           case 11:
               ordenarN();
               break;
           case 12:
               cargarPaises();
               break;
           case 13:
               ordenarNombres();
               break;
           case 14:
               ordenarHabitantes();
               break;
           
       }       
    }while (op!=15); 
}
}   
