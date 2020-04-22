import java.awt.*;

public class MAIN {
        public static void main(String[] args) {
            String namaDepan = "Achmad";
            String namaBelakang = "Habibi";
            int usia = 17;
            int targettahunkuliah = 3;
            double ipk = 3.14285728;
            char nilaiAbjad = 'B';
            boolean tampan = true;
            System.out.println(namaDepan + namaBelakang);

        char [] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
            System.out.println(uniskaString);

        String namaLengkap = namaDepan + " " + namaBelakang;
            System.out.println(namaLengkap.length());
            System.out.println(namaLengkap.indexOf("NIS"));
            System.out.println(namaLengkap.substring(5));
            System.out.println(namaLengkap.substring(5,12));
            System.out.println(namaLengkap.replace("yog",   "Barr"));
            System.out.println(namaLengkap.toUpperCase());
            System.out.println(namaLengkap.toLowerCase());
            System.out.println(namaLengkap.charAt(6));
            String [] namaArray = namaLengkap.split(" ");
        for(String nama : namaArray){
            System.out.println(nama);
        }
        }

    }


