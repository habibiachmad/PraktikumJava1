import javax.swing.JOptionPane;
public class DataTypes{
 public static void main(String[] args){

  String namaDepan = "Achmad";
  String namaBelakang = "Habibi";
  int usia = 17;
  int targetTahunKuliah = 3;
  double ipk = 3.142;
  char nilaiAbjad = 'B';
  boolean tampan = true;
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