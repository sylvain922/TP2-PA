import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Affichage TA = new Affichage("AAA\n");
		Affichage TB = new Affichage("BB\n");
		Affichage TC = new Affichage("CCCC\n");
		Affichage TD = new Affichage("DDD\n");

		TA.start();
		TC.start();
		TB.start();
		TD.start();


	}

}
