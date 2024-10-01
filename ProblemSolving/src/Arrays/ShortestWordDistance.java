package Arrays;

public class ShortestWordDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr=new String[] {"practice", "makes", "perfect", "coding", "makes"};
System.out.println(wordsDict(arr,"coding","practice" ));
	}

	private static int wordsDict(String[] words, String str1, String str2) {
		// TODO Auto-generated method stub
		int min=words.length;
		for(int i =0;i<words.length;i++)
		{
			if(words[i].equals(str1))
			{
				for(int j=0;j<words.length;j++)
				{
					if(words[j].equals(str2))
					{
						min=Math.min(min,Math.abs(i-j));
					}
				}
			}
		}
		return min;
	}

	
}
