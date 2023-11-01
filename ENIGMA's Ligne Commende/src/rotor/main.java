/* -Guide:-----*/
/* ------------Les Rotors -utilise entre 1 est 3----*/
/* ------------Postion de rotor entre 0 est 25-----position 26 calcule comme position 0*/
/* ------------Input doit etre MAJ-----*/



package rotor;

import java.util.*;

public class main {
    
       
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("#                 _______   ______________  ______       \n" +
"#                / ____/ | / /  _/ ____/  |/  /   |      \n" +
"#               / __/ /  |/ // // / __/ /|_/ / /| |      \n" +
"#              / /___/ /|  // // /_/ / /  / / ___ |      \n" +
"#             /_____/_/ |_/___/\\____/_/  /_/_/  |_|      \n" +
"#                                                                                                                                                                                                                                " +
"                                                                                                                                                                                                                                                                                                                                                                        ");
        System.out.println("\n#Remarque:les positions des rotors entre 0 et 25,les types sont:1,2,3 .");
        
        System.out.println("\n\nType de rotor à droite :");
        int roto3 = sc.nextInt();
        System.out.println("Type de rotor à centre:");
        int roto2 = sc.nextInt();
       
        
        System.out.println("Type de rotor à gauche :");
        int roto1 =sc.nextInt();
        System.out.println("Postion de rotor à droite :");
        int prot3 =sc.nextInt();
        System.out.println("Postion de rotor à centre :");
        int prot2 = sc.nextInt();
        System.out.println("Postion de rotor à gauche :");
        int prot1 = sc.nextInt();
        System.out.println("Choisis votre réflecteur(B/C) :");
        char ref = sc.next().charAt(0);
        ref=Character.toUpperCase(ref);
        
        System.out.println("Connctes les lettres :");
        sc.nextLine();
        String pl = sc.nextLine();
       pl=pl.toUpperCase();
        System.out.println("Entrez votre message :");
        
        
        String in = sc.nextLine();
        in=in.toUpperCase();
       
  in = in.replaceAll("[^a-zA-Z]","");
        Enigma.affiche( in,roto3, roto2, roto1, prot3, prot2, prot1,ref,pl);
         
}}