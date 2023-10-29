package inheritence;

class Single {
	void single()
	{
		System.out.println("parent class show method");
	}
}
class Single1 extends Single
{
	void showsingle()
	{
		System.out.println("child class show method");
	}

	public static void main(String[] args) {
		
Single1 sin=new Single1();
sin.single();
sin.showsingle();
	}

}
