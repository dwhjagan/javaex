package Edu2.Module_10_Assignments.src.module10.patterns.adapter;

import java.util.ArrayList;

public class Adapter implements Target 
{
	@Override
	public void sort(int[] list) 
	{
		int i;
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for (i = 0; i < list.length; i++)
			newList.add(new Integer(list[i]));
		
		Adaptee.sort(newList);
		
		for (i = 0; i < newList.size(); i++)
			list[i] = newList.get(i).intValue();
	}
}
