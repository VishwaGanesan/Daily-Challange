import java.util.*;
class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i_center = 0,j_center = 0;
		int ri = n-1,rj = n-1;
		int adder = -1,x = 0,flag = 0;
		char[][] matrix = new char[n][n];
		
    i_center = n%2==0?(n/2):(n/2)+1;
		j_center = n;
		
		for(int i = 0;i < n;i += 1)
		{
		    for(int j = 0;j < n;j += 1)
		    {
		        matrix[i][j] = s.next().charAt(0);
		    }
		}
		
		for(int i = 0;i < i_center;i += 1)
		{
		    if(i == i_center-1)
		    {
		        j_center = n%2==0?n:i_center;
		    }
		    for(int j = 0;j < j_center;j += 1)
		    {
		        if(matrix[i][ (n-1) - rj] == matrix[ri][rj])
		        {
		            System.out.print(matrix[ri][rj]+" ");
		            flag = 1;
		        }
		        rj += adder;
		    }
		    ri -= 1;
		    rj = x*(n-1); // for set alternativly 0 and n-1;
		    x ^= 1;  // for toogle 0 to 1
		    adder = -adder;
		}
		if(flag == 0)
		{
		    System.out.println("-1");
		}

	}
}
