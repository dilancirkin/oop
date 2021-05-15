package oopIntro;
//s�ralama
//�nce fieldlar
//sonra constructerlar
//sonra metotlar
public class Category {
	private int id;
	private String name;//art�k d��ardna eri�ilemiyo bu fieldlara
	
	public Category()
	{
		//a�a��daki super de bunu �al��t�r�yor.
	}
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId()//int d�n�� tipi buray� okudu�unda sana say� vericem demek
	{
		return this.id;
	}
	
	public void setId(int id)//void demek buradan bir �ey d�nd�rmicem sadece bi�ey yap�cam diyor.
	{
		this.id=id;//classtaki idye burdaki d�e�eri at�yorum
	}
	
	public String getName()
	{
		return this.name+ "!";//her sayfa otomatik g�ncellenir.
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
