/* Eksrpesi kondisional dengan boolean */
public class KasusBoolean {  Membuat sebuah class dengan nama KasusBoolean
/**
* @param args Mendefinisikan parameter agar dapat melakukan plugin
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
boolean bool; Inisialisasi variabel
/* Algoritma */
bool= true; true menuju ke bool atau bool bernilai sama true
if(bool) { Memeriksa kondisi apakah bool bernilai sama true jika ia maka
akan mengeksekusi program dan menampilkan benar
System.out.print("true\n");
} else
System.out.print("false\n"); 
if(!bool) { jika kondisi tidak bernilai sama bool atau tidak bernilai true
maka akan mengeksekusi program false dan menampilkan salah
System.out.print("salah\n"); Menampilkan hasil output false
} else
System.out.print("benar\n"); Menampilkan hasil output true
}
}