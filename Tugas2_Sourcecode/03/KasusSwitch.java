import java.util.Scanner;
public class KasusSwitch {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
char cc;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n"); 
cc=masukan.next().charAt(0);
switch (cc) {
case 'a': { System.out.println (" Yang anda ketik adalah a "); break;}
case 'u': { System.out.println (" Yang anda ketik adalah u "); break;}
case 'e': { System.out.println (" Yang anda ketik adalah e "); break;}
case 'i': { System.out.println(" Yang anda ketik adalah i "); break;}
case 'o': { System.out.println(" Yang anda ketik adalah o"); break;}
default:
System.out.println (" Yang anda ketik adalah huruf mati ");
}
}
}

