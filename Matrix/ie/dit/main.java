package ie.dit;

public class main
{
	public static void main(String[] args)
	{
		Matrix m = new Matrix(10,10);
		m.identity();
		System.out.println(m);
		
		Matrix mm= new Matrix(10,10);
		mm.identity();
		System.out.println(Matrix.add(m,mm));
	}
}