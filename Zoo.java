package javahe;

import java.util.Scanner;

public class Zoo {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     String zoo ;
     zoo= scanner.nextLine();
     int zcount=0;
     int ocount=0;
     for(int i =0;i<zoo.length();i++){
         if(zoo.charAt(i) =='Z'){
             zcount++;
         }
     }
     for(int j =0;j<zoo.length();j++){
         if(zoo.charAt(j) =='O'){
             ocount++;
         }
     }
     if(2*zcount==ocount){
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
     }


}
}
