/*
 * Ad Soyad: [Yunus Emre Nakkaş]
 * Ogrenci No: [250542021]
 * Tarih: [08/11/2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

package hafta5odev2;
import java.util.Scanner;
public class odev2hafta5 {
	final static double gravity = 9.8;
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//FORMÜLLER İÇİN GİLGİ ALIMI
		System.out.println("Lütfen yer değiştirmeyi giriniz");
		double yer=scanner.nextDouble();
		System.out.println("Lütfen süreyi giriniz");
		double süre=scanner.nextDouble();
		System.out.println("Lütfen hız değişimini(∆v) giriniz");
		double hızdeğişimi=scanner.nextDouble();
		System.out.println("Lütfen kütleyi giriniz");
		int kütle=scanner.nextInt();
		System.out.println("Lütfen ivmeyi giriniz");
		double ivme=scanner.nextDouble();
		System.out.println("Lütfen kuvveti giriniz");
		double kuvvet=scanner.nextDouble();
		System.out.println("Lütfen uzunluğu giriniz");
		double uzunluk=scanner.nextDouble();
		System.out.println("Lütfen yüskekliği giriniz");
		double yukseklik=scanner.nextDouble();
		System.out.println();
		System.out.println("---------------------------------------");
		// FORMÜLLERİN SONUÇ ÇIKTILARI
		System.out.println("İvmeniz: "+ ivme(hızdeğişimi,süre));
		System.out.println("Hızınız: "+hız(yer,süre));
		System.out.println("Kuvvetiniz"+kuvvet(kütle,ivme));
		System.out.println("Yapılan İş: "+iş(kuvvet,uzunluk));
		System.out.println("Yapılan Güç: "+güç(iş(kuvvet,uzunluk),süre));
		System.out.println("Kinetik Enerjiniz: "+kinetikenerji(kütle,hız(yer,süre)));
		System.out.println("Potansiyel enerjiniz: "+potansiyelenerji(kütle,yukseklik));
		System.out.println("Toplam Momentumunuz: "+momentum(kütle,hız(yer,süre)));
		
	}
	public static double hız(double süre,double zaman) {
		double hız=süre/zaman;
		return hız;
	}
	public static double ivme(double hızdeğişimi,double   süre) {
		double ivme =hızdeğişimi/süre;
		return ivme;
	}
	public static double kuvvet(double kütle,double ivme) {
		double kuvvet=kütle*ivme;
		return kuvvet;
	}
	public static double iş(double kuvvet,double uzunluk) {
		double iş=kuvvet*uzunluk;
		return iş;
	}
	public static double güç(double iş,double süre) {
		double güç=iş/süre;
		return güç;
	}
	public static double  kinetikenerji(double kütle,double hız) {
		double ke=0.5*kütle*hız*hız;
		return ke;
	}
	public static double potansiyelenerji(double kütle,double yukseklık) {
		
		double pe=kütle*yukseklık*gravity;
		return pe;
	}
	public static double  momentum(double kütle,double hız) {
		double momentum=kütle*hız;
		return momentum;
	}
	
}
