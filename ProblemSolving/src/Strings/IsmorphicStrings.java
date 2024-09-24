package Strings;
import java.util.*;
public class IsmorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isomorphicStrings("egg","add"));
	}

	private static boolean isomorphicStrings(String str1, String str2) {
		HashMap<Character,Character> hs=new HashMap<Character,Character>();
		// TODO Auto-generated method stub
		if(str1.length()!=str2.length())
		{
			return false;
		}
		for(int i=0;i<str1.length();i++)
		{
			char c1=str1.charAt(i);
			char c2=str2.charAt(i);
			if(hs.containsKey(c1))
			{
				if(hs.get(c1)!=c2)
				{
					return false;
				}
			}
			else
			{
				if(hs.containsValue(c2))
				{
					return false;
				}
				hs.put(c1, c2);
			}
		}
		return true;
	}

}
