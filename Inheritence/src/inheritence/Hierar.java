package inheritence;

class Hierar {

	void grand()
	{
		System.out.println("Grand class show method");
		
	}
}
class Paren extends Hierar
{
	void parent()
	{
		System.out.println("parent class show method");
	}
}

class Charr extends Hierar
{
	void child1() {
		System.out.println("child2 class show method");
	}


	public static void main(String[] args) {
		Charr ch=new Charr();
		ch.child1();
		ch.grand();
		
		
		
		
		
		
	}

}
