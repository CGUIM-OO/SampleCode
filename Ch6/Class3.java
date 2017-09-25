
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String.valueOf(true) -> Class method
		System.out.println(String.valueOf(true));
		
		String s =new String("instance");
		//s.toUpperCase() -> instance method
		System.out.println(s.toUpperCase());
		
		//Class field: ClassName
		System.out.println(Class4.ClassName);
		Class4 c4=new Class4();
		//Instance field: InstanceName
		System.out.println(c4.InstanceName);
	}
	
}
class Class4{
	public static String ClassName="Class4";
	public String InstanceName="Instance4";
	
}
