class Mother
{
    public static void show()
    {
        System.out.println("This is mother class");
    }
}
 class Child extends Mother
{
    public static void show()
    {
        System.out.println("This is child class");
    }
}
public class Main
{
	public static void main(String[] args) {
		Mother m=new Mother();
		Child c=new Child();
		m.show();
		c.show();
	}
}
