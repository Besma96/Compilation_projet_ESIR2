package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.FileReader;

public class CompareFile {
	
	public  static boolean compare (String entree, String sortie)
	{
		 boolean equal;
	    BufferedReader bExp;
	    BufferedReader bRes;
	    String expLine ;
	    String resLine ;

	    equal = false;
	    bExp = null ;
	    bRes = null ;

	    try {
	        bExp = new BufferedReader(new FileReader(entree));
	        bRes = new BufferedReader(new FileReader(sortie));

	        if ((bExp != null) && (bRes != null)) {
	            expLine = bExp.readLine() ;
	            resLine = bRes.readLine() ;

	            equal = ((expLine == null) && (resLine == null)) || ((expLine != null) && expLine.equals(resLine)) ;

	            while(equal && expLine != null)
	            {
	                expLine = bExp.readLine() ;
	                resLine = bRes.readLine() ; 
	                equal = expLine.equals(resLine) ;
	            }
	        }
	    } catch (Exception e) {

	    } finally {
	        try {
	            if (bExp != null) {
	                bExp.close();
	            }
	            if (bRes != null) {
	                bRes.close();
	            }
	        } catch (Exception e) {
	        }

	    }


       System.out.println(equal);
	    return equal;
     
	}

}
