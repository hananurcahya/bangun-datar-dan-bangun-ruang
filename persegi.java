package bangundatar;

import java.util.Scanner;
        public class persegi {

            public static void main(String[] args) {
                Scanner nilai = new Scanner (System.in);
                int sisi ;
                int Luas , Keliling ;

                System.out.println("Masukan sisi = ");
                sisi = nilai.nextInt();

                Keliling = 4*sisi ;
                System.out.println("Keliling persegi = "+Keliling);
                Luas = sisi * sisi;
                System.out.println("Luas persegi = "+Luas);
            }

        }

