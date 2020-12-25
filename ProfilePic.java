package javahe;

import java.util.Scanner;

public class ProfilePic {
	 public static void main(String args[] ) throws Exception {
	        int L,W,N,H;
	        Scanner scanner= new Scanner(System.in);
	        L=scanner.nextInt();
	        N=scanner.nextInt();
	       for(int i=0;i<N;i++){ 
	            W=scanner.nextInt();
	            H=scanner.nextInt();
	            if(W>L&&H>L&&W==H){
	                System.out.println("ACCEPTED");
	            }
	            else if(W<L||H<L){
	                System.out.println("UPLOAD ANOTHER");
	            }
	            else if(W>L||H>L){
	                System.out.println("CROP IT");
	                
	            }
	            else if(W==L&&H==L) {
	            	 System.out.println("ACCEPTED");
	            }
	       }
	    }
}
