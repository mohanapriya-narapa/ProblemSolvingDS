package Arrays;

public class BuySellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] prices=new int[] {7,1,5,3,6,4};
int min=prices[0];
int maxProfit=0;
for(int i=0;i<prices.length;i++)
{
	int profit=prices[i]-min;
	min=Math.min(min, prices[i]);
 maxProfit=Math.max(maxProfit, profit);
 
 
}System.out.println(maxProfit);
	}

}
