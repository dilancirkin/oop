package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		//ger?ek hayatta objelerle ?al???r?z
		Product product1=new Product(1,"Lenovo",15000,"16 GB RAM",10);
	
		Product product2=new Product();//referans olu?turma,intance
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2 .setDetail("16 gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("??ecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());

		//Product product3=new Product();//referans olu?turma,intance
	
		//yukardakiler normalde veritaban?ndan al?n?yor
		
		
		
	

	}

}
