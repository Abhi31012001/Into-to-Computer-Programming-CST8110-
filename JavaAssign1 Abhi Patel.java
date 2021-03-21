package assignment;
import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner input1=new Scanner(System.in);
		System.out.println("                                SICK NOTE AD-LIB");
		System.out.println("                                PRINTER FRIENDLY");
		System.out.println("\n                             Dear School Nurse: ");
		System.out.println("_____________  ___________ will not be attending school today. He/she has come down with");
		System.out.println(" SILLY WORD     LAST NAME           " );
		System.out.println("a case of ________ and has horrible ____________ and a/an ___________ fever. We have made");
		System.out.println("          ILLNESS                   NOUN(PLURAL)           ADJECTIVE  ");
		System.out.println("an appointment with the ___________ Dr.____________, who studied for many years in");
		System.out.println("                         ADJECTIVE      SILLY WORD ");
		System.out.println("   __________ and has ____________ degrees in pediatrics. He will spend you all the");
		System.out.println("     PLACE              NUMBER  ");
		System.out.println("                          information you need. Thank you!                    I");
		System.out.println("                                   Sincerely");
		System.out.println("                                   Mrs. _________.");
		System.out.println("                                      ADJECTIVE  ");
		
		System.out.print("\n SILLY WORD:");
		String a=input.next();
		System.out.print("\n LAST NAME: ");
		String b=input.next();
		System.out.print("\n ILLNESS: ");
		String c=input.next();
		System.out.print("\n NOUN(PLURAL): ");
		String d=input.next();
		System.out.print("\n ADJECTIVE: ");
		String e=input.next();
		System.out.print("\n ADJECTIVE:" );
		String j=input.next();
		System.out.print("\n SILLY WORD: ");
		String f=input.next();
		System.out.print("\n PLACE:");
		String g=input.next();
		System.out.print("\n NUMBER:");
		double h=input1.nextDouble();
		System.out.print("\n ADJECTIVE:");
		String i=input.next();
		
		System.out.println("                        SICK NOTE AD-LIB");
		System.out.println("                        PRINTER FRIENDLY");
		System.out.println("                       Dear School Nurse: ");
		System.out.println(a+" "+b+" will not be attending school today. He/she has come down with" );
		System.out.println("a case of "+c+" and has horrible "+d+" and a/an "+e+" fever. We have made");
		System.out.println("an appointment with the "+j+" Dr. "+f+" , who studied for many years in");
		System.out.println(" "+g+"and has "+h+" degrees in pediatrics. He will spend you all the");
		System.out.println("                information you need. Thank yoy!");
		System.out.println("                          Sincerely");
		System.out.println("                          Mrs. " +i+".");
	}

}
