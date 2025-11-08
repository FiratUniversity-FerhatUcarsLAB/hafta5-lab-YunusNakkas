/*
 * Ad Soyad: [YUNUS EMRE NAKKAŞ]
 * Ogrenci No: [250542021]
 * Tarih: [08/11/2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

package hafta5odev;
import java.util.Scanner;
public class odevler {
	public static Scanner scanner=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		// PROGRAM İÇİN KARENİN BİLGİLERİ
		System.out.println("Lütfen karenin bir köşesini giriniz");
		double kareside=scanner.nextDouble();
		// PROGRAM İÇİN DİKDÖRTGENİN BİLGİLERİ
		System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");
		double dkuzunside=scanner.nextDouble();
		System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz");
		double dkkısaside=scanner.nextDouble();
		// PROGRAM İÇİN DAİRENİN  BİLGİLERİ
		System.out.println("Lütfen çemberin çapını giriniz");
		double çemberr=scanner.nextDouble();
		// PROGRAM İÇİN ÜÇGENİN BİLGİLERİNİ 
		System.out.println("Lütfen üçgenin tabanını(1.kenar) giriniz");
		double ucgentaban=scanner.nextDouble();
		System.out.println("Lütfen üçgenin 2. kenarını  giriniz");
		double ucgen2kenar=scanner.nextDouble();
		System.out.println("Lütfen üçgenin 3.kenarını giriniz");
		double ucgen3kenar=scanner.nextDouble();
		System.out.println("Lütfen üçgenin yüksekliğini giriniz");
		double ucgenyukseklik=scanner.nextDouble();
		System.out.println();
		System.out.println("---------------------------------------");
		//KARE HAKKINDA BİLGİLERİN YAZDIRILMASI  
		System.out.println("Karenin Alanı: "+calculateSquareArea(kareside));
		System.out.println("Karenin Çevresi: "+ calculateSquarePerimeter(kareside));
		//DİKDÖRTGEN HAKKINDA BİLGİLERİN YAZDIRILMASI
		System.out.println("Dikdörtgenin Alanı: "+calculateRectangleArea(dkuzunside,dkkısaside));
		System.out.println("Dikdörtgenin Çevresi: "+calculateRectanglePerimeter(dkuzunside,dkkısaside));
		//DAİRE HAKKINDA BİLGİLERİN YAZDIRILMASI 
		System.out.println("Dairenin alanı: "+calculateCircleArea(çemberr));
		System.out.println("Dairenin çevresi: "+calculateCircleCircumference(çemberr));
		//ÜÇGEN HAKKINDA BİLGİLERİN YAZDIRILMASI 
		System.out.println("Üçgenin Alanı: "+calcudılateTriangleArea(ucgentaban,ucgenyukseklik));
		System.out.println("Üçgenin Çevresi: "+calculateTrianglePerimeter(ucgentaban,ucgen2kenar,ucgen3kenar));

	}
	public static double calculateSquareArea(double side) {
		double karealan=side*side;
		return karealan;
	}
	public static double  calculateSquarePerimeter(double side) {
		return side*4;
	}
	public static double  calculateRectangleArea(double uk,double kk) {
		return uk*kk;
	}
	public static double calculateRectanglePerimeter(double uk, double kk) {
		return (uk+kk)*2;
	}
	public static double calculateCircleArea(double r) {
		double pi=3.14;
		double alan=r*r*pi;
		return alan;
	}
	public static double calculateCircleCircumference(double r) {
		double pi=3.14;
		double cevre=2*pi*r;
		return cevre;
	}
	public static double calcudılateTriangleArea(double taban , double yukseklık) {
		double alan=(taban*yukseklık)/2;
		return alan ;
	}
	public static double calculateTrianglePerimeter(double a, double b,double c ) {
		double cevre=a+b+c;
		return cevre;
	}
}
