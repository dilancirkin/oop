package oopIntro;

public class ProductManager {
	//i� yapan s�n�f
	//�r�n� ilgilendiren metotlar� buraya yaz�yoruz.
	//her�eyi bir classa da yazabiliriz ama d�zen olmal�
	
	public void addToCart(Product product)//constractoru �a��rd�k
	{
		//addToCart--Sepete ekleme
		System.out.println("Sepete eklendi :"+product.getName());
	}

}
