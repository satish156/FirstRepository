
public class MultiAry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[][] = new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=5;
		a[2][0]=2;
		a[2][1]=3;
		a[2][2]=5;
		Class c = a.getClass();
		String s = c.getName();
		
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
		for(int p[]:a){
			for(int q:p){
				System.out.print(q +" ");
			}
			System.out.println();
		}
System.out.println(s);
	}

}
