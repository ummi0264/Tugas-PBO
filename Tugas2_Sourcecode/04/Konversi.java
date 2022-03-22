import java.util.Scanner;

public class Konversi{
	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);

int jam, menit, detik, konversi;
System.out.println("Masukkan Detik Yang Ingin Dikonversi : ");
konversi = masukan.nextInt();

jam = konversi/3600;
menit = (konversi%3600)/60;
detik = (konversi%3600)%60;
System.out.println("Konversi dari : "+konversi + "detik, adalah : ");
System.out.println(jam+ "jam : "+menit+"menit : "+detik+"detik");

}
}