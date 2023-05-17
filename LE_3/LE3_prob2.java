interface testable
{
    void display();
}
class test  extends abstest implements testable
{
    public void display()
    {
    System.out.println("HEY");    
    }
    
}
abstract class abstest
{
    abstract void display();
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		test t=new test();
		t.display();
	}
}
