package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DortIslem dortIslem=new DortIslem();
int toplam=dortIslem.Topla(3, 41);
int cikar=dortIslem.Cikar(20,45);
int carp=dortIslem.Carp(20,45);
double bol=dortIslem.Bol(20,45);
System.out.println(toplam);
System.out.println(cikar);
System.out.println(carp);
System.out.println(bol);
	}

}
