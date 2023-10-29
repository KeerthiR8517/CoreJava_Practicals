package inheritence;

class Chaining {
	Chaining()
	{
		super();
		System.out.println("Grand constructor");
	}

}
class Super extends Chaining

{
	Super()
{
		super();
		System.out.println("parent constructor");
}
}
class Childd extends Super
{
	Childd()
	{
		super();
		System.out.println("child constructor");
	}
	public static void main(String a[])
	
	{
		Childd cd =new Childd();
	}
}

