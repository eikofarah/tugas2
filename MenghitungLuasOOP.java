
package menghitungluasoop;
import java.io.*;
import java.util.*;
import java.util.Scanner;

class Persegi{
    void luasPersegi(int sisi){
        int luasPersegi = sisi * sisi;
        System.out.println(luasPersegi);
            }
    }
class Segitiga{
    void luasSegitiga(double alas, double tinggi){
        double luassegitiga = alas * tinggi / 2;
        int luas = (int) luassegitiga;
        System.out.println(luas);
    }
}
class Lingkaran{
    void luasLingkaran(double jari2){
        double luasLingkaran = 22 / 7 * jari2 * jari2;
        System.out.println(luasLingkaran);
    }
}
class Lingkaran2{
    void luasLingkaran2(double jari2){
        double luas = 3.14* jari2 * jari2;
        int luasLingkaran = (int) luas;
        Double luasLingkaran2 = Double.valueOf(luasLingkaran);
        System.out.println(luasLingkaran2);
    }
}
public class MenghitungLuasOOP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        switch(angka) {
            case 1:
                int sisi = input.nextInt();
                Persegi luasPersegi = new Persegi();
                luasPersegi.luasPersegi(sisi);
                break;
            case 2:
                double alas = input.nextDouble();
                double tinggi = input.nextDouble();
                Segitiga luasSegitiga = new Segitiga();
                luasSegitiga.luasSegitiga(alas, tinggi);
                break;
            case 3:
                double jari2 = input.nextDouble();
                if (jari2 % 7 == 0) {
                    Lingkaran luasLingkaran = new Lingkaran();
                    luasLingkaran.luasLingkaran(jari2);
                } else {
                    Lingkaran2 luasLingkaran2 = new Lingkaran2();
                    luasLingkaran2.luasLingkaran2(jari2);
                }
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

