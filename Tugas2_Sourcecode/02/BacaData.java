import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int a;
Scanner masukan;
/* Program */
System.out.println("integer:\n\n");
masukan = new Scanner(System.in);
a = masukan.nextInt(); 
System.out.println ("Nilai yang dibaca : "+ a);
}
}