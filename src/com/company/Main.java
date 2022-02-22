import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double celcius;
        int pil;
        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Program Konversi Suhu        ");
        System.out.println("==================================");
        System.out.print("Masukan Suhu dalam Celcius = ");
        celcius = input.nextInt();

        do {
            System.out.println();
            System.out.println("Opsi ");
            System.out.println("----------");
            System.out.println("1. Lihat Data Konversi ");
            System.out.println("2. Edit Data Konversi ");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    konversi convert = new konversi(celcius);
                    System.out.println("  ");
                    System.out.println("Celsius    = " + celcius + "°C");
                    System.out.println("Reamur     = " + convert.toReamur() + "°R");
                    System.out.println("Fahrenheit = " + convert.toFahrenhait() + "°F");
                    System.out.println("Kelvin     = " + convert.toKelvin() + "°K");
                    System.out.println("Kondisi Air " + convert.kondisiAir());
                    break;

                case 2:
                    System.out.print("Masukan Suhu dalam Celcius = ");
                    celcius = input.nextInt();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Program Selesai, Terimakasih");
                    break;

                default:
                    System.out.println("Input yang anda masukan salah");
            }
        } while (pil != 3);
    }


}
