package oopIntro;

public class ProductManager {
	//iþ yapan sýnýf
	//ürünü ilgilendiren metotlarý buraya yazýyoruz.
	//herþeyi bir classa da yazabiliriz ama düzen olmalý
	
	public void addToCart(Product product)//constractoru çaðýrdýk
	{
		//addToCart--Sepete ekleme
		System.out.println("Sepete eklendi :"+product.getName());
	}

}
