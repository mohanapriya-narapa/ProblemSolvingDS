package Matrix;

public class ReshapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat=new int[][] {{1,2},{3,4}};
		int r=1;int c=4;
		int[][] res=new int[r][c];
		int row=0;int col=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				res[row][col]=mat[i][j];
col++;
				if(col==c)
				{
					col=0;
					row++;
				}
			}
		}
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{System.out.println(res[i][j]);
			}
			System.out.println(" ");
		}
	}

}
