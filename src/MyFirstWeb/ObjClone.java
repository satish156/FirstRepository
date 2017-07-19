package MyFirstWeb;

public class ObjClone implements Cloneable {
	int id;
	String name;
	public ObjClone(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	};
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	

	@Override
	public String toString() {
		return "ObjClone [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjClone obj = new ObjClone(1, "satish");
		ObjClone onj1 = (ObjClone)obj.clone();
		System.out.println(obj);
		System.out.println(onj1);
	}

}
