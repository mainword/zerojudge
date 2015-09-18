package com.zerojudge.basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (String line = reader.readLine(); line != null; line = reader.readLine()) {
		    int input = Integer.valueOf(line);
		    int out = 0;
	          if (input >=40)
	        	  out=100 ;
	          else if (input >20)
	              out =80 +(input -20) *1 ;
	          else if (input >10)
	              out =60 +(input -10) *2 ;
	          else 
	              out =input *6 ;
	          
	          System.out.println(out);
		}
		
	}
	
}
