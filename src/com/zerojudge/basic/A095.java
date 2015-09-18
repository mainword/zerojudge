package com.zerojudge.basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * a095: 麥哲倫的陰謀
 */
public class A095 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (String line = reader.readLine(); line != null; line = reader.readLine()) {
			String [] input = line.split("\\s+");
			int in0 = Integer.valueOf(input[0]);
			int in1 = Integer.valueOf(input[1]);
	        if( in0 == in1 ){
	        	System.out.println(in1);
	        }
	        else{
	        	System.out.println(in1+1);
	        }	
		}
	}
}
