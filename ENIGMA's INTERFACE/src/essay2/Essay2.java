/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essay2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author salah
 */
public class Essay2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Enigma_Simulator prototype");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
     public static final String ANSI_BLUE = "\u001B[34m";
    /* ------------Création des Rotor-----*/
       // Matrice 5 ligne et 26 colomn
    /* ligne 0 :alphabet */ /* ligne 1:Rotor1 */ /* ligne 2:Rotor2 */ /* ligne 3:Rotor3 */
         static char [][]rotor={{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},//Alphabet
                                {'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'}, //Rotor1
                                {'A','J','D','K','S','I','R','U','X','B','L','H','W','T','M','C','Q','G','Z','N','P','Y','F','V','O','E'},//Rotor2
                                {'B','D','F','H','J','L','C','P','R','T','X','V','Z','N','Y','E','I','W','G','A','K','M','U','S','Q','O'}//Rotor3
                                    };
     
     static char [][]reflector={{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},//Alphabet
                                {'Y','R','U','H','Q','S','L','D','P','X','N','G','O','K','M','I','E','B','F','Z','C','W','V','J','A','T'}, //Ref_B
                                {'F','V','P','J','I','A','O','Y','E','D','R','Z','X','W','G','C','T','K','U','Q','S','B','N','M','H','L'},//Ref_C
                                };
     
     
     static char [][] reverse ={{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},//Alphabet
                                {'U','W','Y','G','A','D','F','P','V','Z','B','E','C','K','M','T','H','X','S','L','R','I','N','Q','O','J'}, //r_Rotor1
                                {'A','J','P','C','Z','W','R','L','F','B','D','K','O','T','Y','U','Q','G','E','N','H','X','M','I','V','S'},//r_Rotor2
                                {'T','A','G','B','P','C','S','D','Q','E','U','F','V','N','Z','H','Y','I','X','J','W','L','R','K','O','M'}//r_Rotor3
                                };
     /*--------- Déclaration des varialbe -----*/
       static int position; // reglage de Rotor
      static int rot_num; // numero de rotor utilisé   1 parmis 3
    static   char name;
    char input; // le text en entr
    
    /*---------- Fonctionnement de rotor (Chiffrement)-----*/
      public static char MaS_chiffrement( int rot_num, char input, int position ){
        char output=0;// le resultat
       
                  for (int i = 0; i < 26; i++) {
        /*--- Etape 2 :Recherche de input dans l'alphabet  ---*/    
            if(input==rotor[0][i]){   //Chercher le input dans l'alphabet  (ligne 0)
                switch(rot_num) {  // choisir un Rotor a utilisé pour le chiffrement de l'input
            case 1:
                   name = rotor[1][(i+position)%26];   /*--- Etape 3:Chiffrement(cadepant le rotor)---*/ 
                  break;                             
            case 2:
                  name = rotor[2][(i+position)%26];/*--- Etape 3:Chiffrement(cadepant le rotor)---*/ 
                  break;
            case 3:
                 name = rotor[3][(i+position)%26];/*--- Etape 3:Chiffrement(cadepant le rotor)---*/ 
                  break;  
}
            int convert= (((int)name)-position); /* name est t'un char 
                                                 position est t'un entier 
                                                 pour etablir operation de substration il faut
                                                 convertir le name au entier ,le resulat obtunu c'est la sortie codé au ascii  */
            if(convert<65)// une condition utilisé pour pour évité affichage de autre chose a par l'alphabet.
                convert+=26;
                output= (char)convert;// Convertir le output  de entier au char pour puis affiché
            }
        }  
return output;        
    }
      
 public static char ref(char in,String ref){
    char ou = 0;
         for (int i = 0; i < 26; i++) {
             if (in==reflector[0][i]) {   
              switch (ref){
            case"UKW-B":
             ou=reflector[1][i];   
            break;
            case "UKW-C":
            ou=reflector[2][i];
        }
             }
        }
       return ou ;
    }
public static char back_chiffrement( int rot_num, char input, int position ){
        char output=0;// le resultat
        /*--- Etape 1 : Décalage de rotor ---*/
                  for (int i = 0; i < 26; i++) {
        /*--- Etape 2 :Recherche de input dans l'alphabet  ---*/    
            if(input==reverse[0][i]){   //Chercher le input dans l'alphabet  (ligne 0)
                switch(rot_num) {  // choisir un Rotor a utilisé pour le chiffrement de l'input
            case 1:
                   name = reverse[1][(i+position)%26];   /*--- Etape 3:Chiffrement(cadepant le rotor)---*/ 
                  break;                             
            case 2:
                  name = reverse[2][(i+position)%26];/*--- Etape 3:Chiffrement(cadepant le rotor)---*/ 
                  break;
            case 3:
                 name = reverse[3][(i+position)%26];/*--- Etape 3:Chiffrement(cadepant le rotor)---*/ 
                  break;  
}
            int convert= (((int)name)-position); /* name est t'un char 
                                                 position est t'un entier 
                                                 pour etablir operation de substration il faut
                                                 convertir le name au entier ,le resulat obtunu c'est la sortie codé au ascii  */
            if(convert<65)// une condition utilisé pour pour évité affichage de autre chose a par l'alphabet.
                convert+=26;
                output= (char)convert;// Convertir le output  de entier au char pour puis affiché
            }
        }  
return output;        
    }


public static char plug(String a,char b){
      char x=0;
       if("null".equals(a)||"".equals(a))
       {
         
           return b;
       }
       
           
      for (int i = 0; i < a.length(); i++) {
          
          if(a.charAt(i)==b){
             if(i%2==0){
                //  System.out.println("pair");
                  x=a.charAt(++i);
                return x;
             }
             else if(i%2!=0){
                 //System.out.println("impair");
                 x=a.charAt(--i);
                     return x;

             } 
          }
          else
                  x=b;
      }
    
     return x;
  }




public static String affiche(String in,int rot3,int rot2,int rot1,int right,int med,int left,String ref,String pl){
        String dss="";
        
             
           
            
             
          
           
            
            
            
           
            
                System.out.println("");
            //    S=(S+1)%26;
                
                
                
                
       System.out.println("\n Rotor position: "+ left+" | "+med+" | "+right);
       
         char input =in.charAt(0);
          System.out.println(""+input);
          
                 char inpu=plug(pl,input);
                System.out.println("plug :"+inpu);      
                
         System.out.println("\tThe wheel third's output  is : "+MaS_chiffrement(rot3,inpu,right));
           char z= MaS_chiffrement(rot3,inpu,right);
          System.out.println("\t\tThe wheel second's output  is : "+MaS_chiffrement(rot2,z,med));
          char y=MaS_chiffrement(rot2,z,med);
          System.out.println("\t\t\tThe wheel first's output  is : "+MaS_chiffrement(rot1,y,left));
          char w=MaS_chiffrement(rot1,y,left); 
          System.out.println("\t\t\t\tThe reflector  is : "+ref(w, ref));
            char v=ref(w, ref);
        System.out.println("\t\t\twheel first's backword output :"+back_chiffrement(rot1, v, left));
          char u = back_chiffrement(rot1, v, left);
        System.out.println("\t\twheel second's backword output :"+back_chiffrement(rot2, u, med)); 
        
        char d= back_chiffrement(rot2, u, med); 
       System.out.println("\twheel third's backword output :"+back_chiffrement(rot3,d, right)); 
      
       
       char out=back_chiffrement(rot3,d, right);
       char output=plug(pl,out);
               System.out.println("plug :"+output);
                  System.out.println((char)27 + "[31m" +"--output: "+output); 
                   
                 
                  dss=dss+output;
          
       System.out.println("------------------------------------------");
    
            return dss;
    }
    
}
