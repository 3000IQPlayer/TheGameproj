import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Mrjones_Final_Exam_20questionstobecomeMillionare
{

 public static void main(String str[]) throws IOException
 {
 Scanner scan = new Scanner(System.in);
 ArrayList <String> list = new ArrayList <String>();

 
  System.out.println("Welcome to 20 Questions to become a Millionare Game!");
  System.out.println("Type \"PLAY\" to start your questions to have a chance to become a millionare!");
  String a; 
  String ab; 
  String abc; 
  int d;
  a = scan.nextLine();

  int g; 

  while (!a.equals("PLAY")) {
    System.out.println("ERROR: YOU DID NOT SAY PLAY!");
    a = scan.nextLine();
  }
 
  
  while (a.equals("PLAY")) {
  
    System.out.println("Question 1:Who was is our president?");
     ab = scan.nextLine();
       if(ab.equals("Barrack Obama")) {
             System.out.println("Winner"); 
             g = 2; 
       } else {
         System.out.println("Sorry, you get the question incorrect and ");
         g = 0; 
         
       }
       while (g == 2) {
          System.out.println("Question 2:Who was is our president?");
         ab = scan.nextLine();
       }
  break; 
  }
  
    
  }
 }



  
 

