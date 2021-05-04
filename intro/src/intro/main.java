package intro;

public class main {
public static void main(String[] args) {
	String internetSubeButonu = "internet şubesi";
	double dolarDun = 8.20;
	double dolarBugun = 8.20;
	int vade = 36;
	boolean dustuMu = true;
	
	System.out.println(internetSubeButonu);
	
	if(dolarBugun<dolarDun) {
		System.out.println("Dolar düştü resmi");
	}else if(dolarBugun>dolarDun) {
		System.out.println("Dolar yükseldi resmi");
	}
	else {
		System.out.println("Dolar eşittir resmi");
	}
	
	String kredi1 = "Hızlı Kredi";
	String kredi2 = "Mutlu emekli kredisi";
	String kredi3 = "Konut Kredi";
	String kredi4 = "Çiftçi Kredi";
	String kredi5 = "Msb Kredi";
	String kredi7 = "kültür bakanlığı kredisi";
	
	System.out.println(kredi1);
	System.out.println(kredi2);
	System.out.println(kredi3);
	System.out.println(kredi4);
	System.out.println(kredi5);
	System.out.println(kredi7);
	
	String[] krediler = 
		{
			"Hızlı Kredi", 
			"Mutlu emekli kredisi", 
			"Konut Kredi", 
			"Çiftçi Kredi", 
			"Msb Kredi",
			"kültür bakanlığı kredisi"
		};
	
	//foreach
	for(String kredi : krediler) {
		System.out.println(kredi);
	}
	
	for(int i = 0; i <krediler.length;i++) {
		System.out.println(krediler[i]);
	}
	
	int sayi1 = 10;
	int sayi2 = 20;
	sayi1 = sayi2;
	sayi2 = 100;
	System.out.println(sayi1);
	
	int[] sayilar1 = {1,2,3,4,5};
	int[] sayilar2 = {10,20,30,40,50};
	sayilar1 = sayilar2;
	sayilar2[0] = 100;
	System.out.println(sayilar1[0]);
	
	
	String sehir1 = "Ankara";
	String sehir2 = "istanbul";
	sehir1 = sehir2;
	sehir2 = "izmir";
	System.out.println(sehir1);
	
	
	
}
}
