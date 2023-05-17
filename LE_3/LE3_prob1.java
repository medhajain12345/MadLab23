abstract class Bharatvanshi
{
    void fight()
    {
        System.out.println("Fights");
    }
    
}
class Pandava extends Bharatvanshi
{
    int kindness,obedience;
    public Pandava(int x,int y)
    {
        kindness=x;
        obedience=y;
    }
    public void kind()
    {
        System.out.println("kindness ="+kindness);
    }
    public void obey()
    {
        System.out.println("Obedience="+obedience);
    }
}
class Kauravs extends Bharatvanshi
{
    int kindness,obedience;
    public Kauravs(int x,int y)
    {
        kindness=x;
        obedience=y;
    }
    public void kind()
    {
        System.out.println("kindness ="+kindness);
    }
    public void obey()
    {
        System.out.println("Obedience="+obedience);
    }
   
}
public class Main
{
	public static void main(String[] args) 
	{
		Pandava Arjun=new Pandava(10,10);
		Pandava Bheem=new Pandava(8,10);
		Kauravs Duryodhan=new Kauravs(0,0);
		Kauravs Vikarn=new Kauravs(9,9);
		Arjun.fight();
	}
}
