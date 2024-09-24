package Strings;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strs=new String[] {"eat","tea","tan","ate","nat","bat"};
HashMap<String, ArrayList<String>> hs= new HashMap<String, ArrayList<String>>();
for(String str:strs)
{
	char[] ch=str.toCharArray();
	Arrays.sort(ch);
	String s= new String(ch);
	if(!hs.containsKey(s))
	{
		hs.put(s, new ArrayList<String>() );
	}
	hs.get(s).add(str);
}System.out.println(hs);
	}

}
