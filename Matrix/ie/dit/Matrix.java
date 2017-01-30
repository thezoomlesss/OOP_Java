package ie.dit;

public class Matrix
{
	private float[][] elements;
	private final int rows, cols;
	
	public int getRows()
	{
		return(rows);
	}
	public int getCols()
	{
		return(cols);
	}
	
	public String toString(float[][] a, int rows, int cols)
	{
		String s="";
		for(int index=0; index<rows; index++)
		{
			for(int index2=0; index2<cols; index2++)
			{
				s+=a[index][index2]+ "\t";
			}
			s+="\n";
		}
		return(s);
	}
	
	public void identity()
	{
		
		float[][] identity= new float[getRows()][getCols()];
		
		for(int i=0; i< rows; i++)
		{
			identity[i][i]=1;
		}
		System.out.println(toString(identity, rows, cols));
	}
	
	public static Matrix add(Matrix b, Matrix c)
	{
		Matrix a= new Matrix(b.rows, b.cols);
		
		for(int row=0; row<b.rows; row++)
		{
			for(int col=0; col<b.cols; col++)
			{
				a.elements[row][col]= b.elements[row][col] + c.elements[row][col];
			}
		}
		return a;
	}
	
	
	public Matrix(int rows, int cols)
	{
		this.rows=rows;
		this.cols=cols;
		
		elements= new float[rows][cols];
	}
}