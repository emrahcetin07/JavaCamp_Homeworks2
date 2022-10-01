package methods2;

public class Main {

	public static void main(String[] args) 
	{
		int toplam = topla(0,1,1,1);
		
        System.out.println(toplam);
		
		
	}
	
	public static int topla(int...sayilar)
	{//birden çok sayıyı toplamak için kullanabiliriz
		int toplam=0;
		for(int sayi:sayilar)
		{
			toplam+=sayi;
		}
		return toplam;
	}
	
}
