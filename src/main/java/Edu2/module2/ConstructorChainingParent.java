package Edu2.module2;

public class ConstructorChainingParent
{
	protected int test_val = 0;

	// Default parent class constructor
	public ConstructorChainingParent()
	{ System.out.println("I am at Test with test_val = " + test_val); }

	// One parameter parent class constructor
	public ConstructorChainingParent(int test_val)
	{ 
		this.test_val = test_val;
		System.out.println("I am at Test with test_val = " + this.test_val); 
	}

	@ SuppressWarnings(value = "unused")
	public static void main(String[] args)
	{
		ConstructorChainingParent t1 = new ConstructorChainingParent(), 
								  t2 = new ConstructorChainingParent(1);
		
		ConstructorChainingChild tc1 = new ConstructorChainingChild(), 
								 tc2 = new ConstructorChainingChild(2);
	}
}

class ConstructorChainingChild extends ConstructorChainingParent
{
	// Default child class constructor
	public ConstructorChainingChild()
	{
		super(); // calling the default parent class constructor first
		System.out.println("I am at TestChild with test_val = " + test_val); 
	}
	
	// One parameter child class constructor
	public ConstructorChainingChild(int test_val)
	{ 
		super(test_val); // calling the one parameter child base class constructor first
		System.out.println("I am at TestChild with test_val = " + this.test_val); 
	}
}