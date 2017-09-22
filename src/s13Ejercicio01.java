
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class s13Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //Pedir al usuario que ingrese el total de estudiantes
        System.out.println("Ingrese el numero de estudiantes:   ");
        int[] scores=new int[input.nextInt()];
        char[] grades= new char[scores.length];
        
        //Pedir al usuario que ingrese tpdas ñas mptas
        System.out.println("Enter "+scores.length + "scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i]=input.nextInt();
        }
        
        //Obtener grados
        getGrades(scores, grades);
        
        //mostrar resultados
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Estudiantes "+i+"su puntaje es "+scores[i]+"y su grado es "+grades[i]);
            
        }
    }
    
    /** El metodo max return el la puntuacion mas alta     */
        public static int max(int[]array){
            int max=array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i]>max) 
                
                    max=array[i];
        }
                return max;
            }
        
            
        /**El metodo getGrade asigna grados basado en los grados :# */
        public static void getGrades(int[] scores, char[] grades) 
        {
            int best=max(scores);
          for (int i = 0; i < scores.length; i++) {
                if (scores[i]>=best -10)
                    grades[i]='A';
           
                else if (scores[i]>=best -20) 
                    grades[i]='B';
                
                else if (scores[i]>=best -30) 
                    grades[i]='C';
                
                else if (scores[i]>=best -40) 
                    grades[i]='D';
                
                else    
                    grades[i]='F';
        
          }
        }
}

     


        


        
        

    


                    
            
            
                
            
            
        
       
    
        
        

