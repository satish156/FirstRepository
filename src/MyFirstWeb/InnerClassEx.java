package MyFirstWeb;

public class InnerClassEx {
	static class Outer{
		static void display(){
			System.out.println("this is outer most parent class");
		}
		static class inner{
			static void display(){
				System.out.println("this is inner class child of outer");
			}
			static class inner1{
				static void display(){
					System.out.println("this is inner1  class child of inner class");
				}
				static class inner2{
					static void display(){
						System.out.println("this is inner2 class child of inner1 class");
					}
					static class inner3{
						static void display(){
							System.out.println("this is inner3 class child of inner2 class");
						}
						static class inner4 {
							static void display(){
								System.out.println("this is inner4 class child of inner3 class");
							}
							static class inner5{
								static void display(){
									System.out.println("this is inner5 class child of inner4 class");
								}
								static class inner6{
									static void display(){
										System.out.println("this is inner class6 child of inner5 class");
									}
									static class inner7{
										static void display(){
											System.out.println("this is inner7 class is child of inner6 class");
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InnerClassEx obj = new InnerClassEx();
		InnerClassEx.Outer.display();
		InnerClassEx.Outer.inner.display();
		InnerClassEx.Outer.inner.inner1.display();
		InnerClassEx.Outer.inner.inner1.inner2.display();
		InnerClassEx.Outer.inner.inner1.inner2.inner3.display();
		InnerClassEx.Outer.inner.inner1.inner2.inner3.inner4.display();
		InnerClassEx.Outer.inner.inner1.inner2.inner3.inner4.inner5.display();
		InnerClassEx.Outer.inner.inner1.inner2.inner3.inner4.inner5.inner6.display();
		InnerClassEx.Outer.inner.inner1.inner2.inner3.inner4.inner5.inner6.inner7.display();

	}

}
