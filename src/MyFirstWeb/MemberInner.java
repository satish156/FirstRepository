package MyFirstWeb;

public class MemberInner {
	int data =10;
		class inner{
			void msg(){
				System.out.println(data);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MemberInner obj = new MemberInner();
	MemberInner.inner obj1 = obj.new inner();
	obj1.msg();
	}

}
