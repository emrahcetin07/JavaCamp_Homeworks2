package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product=new Product();
		//Yorum olarak tanımlananlar sadece public olarak değişkenleri tanımlarsak geçerli olur
		//product.name="Laptop";
		//product.id=12;
		//product.description="Asus Laptop";
		//product.price=5000;
		//product.stockAmount=3;
	
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(10000);
		product.setStockAmount(4);
			
		System.out.println(product.getKod());

	}

}
