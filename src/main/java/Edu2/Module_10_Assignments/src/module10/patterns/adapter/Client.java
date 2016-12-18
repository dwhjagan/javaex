package Edu2.Module_10_Assignments.src.module10.patterns.adapter;

public final class Client 
{
	public static void main(String[] args) 
	{
		int [] list = new int [] {7, 9, 4, 8, 1, 6};
		
		Adapter adapter = new Adapter();
		adapter.sort(list);
		
		System.out.println("Sorted list.");
		for (int i : list)
		{
			System.out.println(i);
		}
	}
}
