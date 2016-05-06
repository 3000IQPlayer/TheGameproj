import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 
class mymethod {
 
 public static void main (String str[]) throws IOException {
 
 Scanner scan = new Scanner(System.in);
 
 ArrayList <String> list = new ArrayList <String>();
 String [] file = {"H1.txt","H2.txt","H3.txt","M4.txt","M5.txt","M6.txt"};
 ArrayList<String> fileList = new ArrayList<String> (Arrays.asList(file));
 Collections.shuffle(fileList);


 


 
 System.out.println(fileList.get(3));
 }
 
}