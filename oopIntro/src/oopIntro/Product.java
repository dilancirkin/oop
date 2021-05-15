package oopIntro;

public class Product {
	//encapsulation:
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;//indirim
	//private double unitPriceAfterDiscount;//indirimden sonraki oran,buna art�k gerek yok sadece okuyoruz ��nk� silinebilir
	
	public Product()
	{
		//constract�r blogu
		//bu blogu olu�turmak istedi�imizde olmas�n� istrdi�imiz
		//�eyleri bunun i�ine yazar�z
		//buras� biz yazmasakta var
		System.out.println("ben �al��t�m");
	}
	
	public Product(int id,String name,double unitPrice,String detail,
			double discount) 
	{
		//neleri bana yoll�can� parametrelere yazd�k
		//e�itlemek i�in
		//this();//yukardaki parametresiz constract�r� �al��t�r demek
		super();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		this.discount =discount;
		//this bu classtaki demek yani a�a��da tan�mlananlar� buraya e�itliyor
		//pythondaki self ile ayn�
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}

	
	
	
	


}
