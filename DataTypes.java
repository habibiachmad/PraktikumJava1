import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  
  String namaDepan = "Achmad";
  String namaBelakang = "Habibi";
  int usia = 17;
  int targetTahunKuliah = 3;
  double ipk = 3.142;
  char nilaiAbjad = 'B';
  boolean tampan = true;
  
  System.out.print("Input Nama Depan : ");
  namaDepan = scanner.nextLine();
  System.out.print("Input Nama Belakang : ");
  namaBelakang = scanner.nextLine();
  System.out.print("Input IPK : ");
  ipk = scanner.nextDouble();
  System.out.print("");
  System.out.print("Input Nilai Abjad : ");
  nilaiAbjad = scanner.next().charAt(0);
  System.out.println("Tampan? :");
  tampan = scanner.nextBoolean();

  System.out.println("======OUTPUT=======");
  System.out.println("Nama depan : " + namaDepan);
  System.out.println("Nama Belakang : " + namaBelakang);
  System.out.println("Usia : " + usia);
  System.out.println("Target Kuliah : " + targetTahunKuliah + " Tahun" );
  System.out.println("IPK : " + ipk);
  System.out.println("Nilai : " + nilaiAbjad);
  System.out.println("Tampan : " + tampan);

  JOptionPane.showMessageDialog(null,"Hai ," +namaDepan + namaBelakang );
}
}	