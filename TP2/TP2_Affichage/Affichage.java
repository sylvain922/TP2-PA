/**
 * 
 */
import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

class Exclusion{};
public class Affichage extends Thread{
	String texte; 
        
     static Exclusion exclusionMutuelle = new Exclusion();

	public Affichage (String txt){texte=txt;}
	
	public void run(){

	    synchronized (exclusionMutuelle) {
			System.out.println(Thread.currentThread().getName() + " : j'entre en section critique");
	    	for (int i=0; i<texte.length(); i++){
		    	System.out.print(texte.charAt(i));
		    	try {sleep(100);} catch(InterruptedException e){};
			}
			System.out.println(Thread.currentThread().getName() + " : je sors de section critique\n");
	    }
	}
}
