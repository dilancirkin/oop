package oopIntro;
//sýralama
//önce fieldlar
//sonra constructerlar
//sonra metotlar
public class Category {
	private int id;
	private String name;//artýk dýþardna eriþilemiyo bu fieldlara
	
	public Category()
	{
		//aþaðýdaki super de bunu çalýþtýrýyor.
	}
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId()//int dönüþ tipi burayý okuduðunda sana sayý vericem demek
	{
		return this.id;
	}
	
	public void setId(int id)//void demek buradan bir þey döndürmicem sadece biþey yapýcam diyor.
	{
		this.id=id;//classtaki idye burdaki dðeðeri atýyorum
	}
	
	public String getName()
	{
		return this.name+ "!";//her sayfa otomatik güncellenir.
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
