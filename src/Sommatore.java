
public class Sommatore 
{

	public static int somma4(int x)
	{
		for (int i = 0; i < 4; i++) 
			x++;
		return x;
	}
	
	public static int somma10(int x)
	{
		for (int i = 0; i < 10; i++) 
			x++;
		return x;
	}
	
	public static int somma100(int x)
	{
		for (int i = 0; i < 100; i++) 
			x++;
		return x;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int x=1;
		System.out.println(somma4(x));
		System.out.println(somma10(x));
		System.out.println(somma100(x));

	}

}
