/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;
import java.util.Set;
import java.util.HashSet;

public class CheckDuplicate
{
	public static void main(String args[])
	{
		String [] sValue = new String[]{"a","b","c","d","","","e","a"};
		
		if(checkDuplicated_withNormal(sValue))
			System.out.println("Check Normal : Value duplicated! \n");
		if(checkDuplicated_withSet(sValue))
			System.out.println("Check Set : Value duplicated! \n");
		
	}
	
	//check duplicated value
	private static boolean checkDuplicated_withNormal(String[] sValueTemp)
	{
		for (int i = 0; i < sValueTemp.length; i++) {
			String sValueToCheck = sValueTemp[i];
			if(sValueToCheck==null || sValueToCheck.equals(""))continue; //empty ignore
			for (int j = 0; j < sValueTemp.length; j++) {
					if(i==j)continue; //same line ignore
					String sValueToCompare = sValueTemp[j];
					if (sValueToCheck.equals(sValueToCompare)){
							return true;
					}
			}

		}
		return false;
		
	}
	
	//check duplicated value
	private static boolean checkDuplicated_withSet(String[] sValueTemp)
	{
		Set sValueSet = new HashSet();
		for(String tempValueSet : sValueTemp)
		{
			if (sValueSet.contains(tempValueSet))
				return true;
			else
				if(!tempValueSet.equals(""))
					sValueSet.add(tempValueSet);
		}
		return false;
	}
	
	
}

