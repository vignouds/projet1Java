import java.util.*;

import org.apache.commons.lang3.StringUtils;

class HelloWorld {
	
	public static void main(String[]args) {
		System.out.println("Hello World");
		
		/* Variables */
		Date auj = new Date();
		int a=5;
		int b=10;
		float c=4.5f;
		
		b=a+b;
		a=2*b-3;
		c=c*b;		
		

		System.out.println(auj);
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		System.out.println("c = " + c);

		/* Conditions et boucles */
		if(a!=b) 
			System.out.println("a est différent de b");
		else 
			System.out.println("a est égal à b");
		
		for(int i=10;i>=0;i-=2)
			System.out.println(i);
		
		int count=5;
		
		while(count<5) {
			count++;
			System.out.println("Count is " + count);			
		}
		
		do {
			count++;
			System.out.println("Le compte est " + count);
		}
		while(count<5);
		
		/* Chaînes de caractères */
		String prenom="Sébastien";
		String nom="Vignoud";
				
		if(StringUtils.equals(nom, prenom))
			System.out.println("Même nom et prénom");
		else
			System.out.println("Nom et prénom différents");
		
		String phrase="Bonjour je m'appelle ".concat(prenom).concat(" ").concat(nom).concat(".");
		System.out.println(phrase);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Bonjour je m'appelle ").append(prenom).append(" ").append(nom).append(".");		
		System.out.println(sb);
		
		StringBuffer sbuff = new StringBuffer();
		sbuff.append("Salut ").append(prenom).append(".");
		System.out.println(sbuff);
		
		/* Tableaux */
		int[]array = new int[10];
		int[]array2=array;
		array[4] = 5;
		System.out.println(array2[4]);
		System.out.println(array.length);
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = i*3-2;
			//System.out.println(i + " : " + array[i]);
		}
		
		String[][] couleurs = {{"bleu","rouge"},{"bleu",null}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			System.out.println(couleurs[i][j]);	
		}
		
		System.out.println(Language.FR);
	}
}
