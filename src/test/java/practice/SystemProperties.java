package practice;

public class SystemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String sys=	System.getProperty("java.version");
		System.out.println(sys);
		String sys1=System.getProperty("file.separator");
		System.out.println(sys1);
		String sys2=System.getProperty("java.class.path");
		System.out.println(sys2);
		String sys3=System.getProperty("java.home");
		System.out.println(sys3);
		String sys4=System.getProperty("java.vendor");
		System.out.println(sys4);
		String sys5=System.getProperty("java.vendor.url");
		System.out.println(sys5);
		String sys6=System.getProperty("line.separator");
		System.out.println(sys6);
		String sys7=System.getProperty("os.arch");
		System.out.println(sys7);
		String sys8=System.getProperty("os.name");
		System.out.println(sys8);
		String sys9=System.getProperty("os.version");
		System.out.println(sys9);
		String sys10=System.getProperty("path.separator");
		System.out.println(sys10);
		String sys11=System.getProperty("user.dir");
		System.out.println(sys11);
		String sys12=System.getProperty("user.home");
		System.out.println(sys12);
		String sys13=System.getProperty("user.name");
		System.out.println(sys13);
		
		
		
//		==================================================        //
		String sys14=System.getProperty("subliminal.message", "Buy StayPuft Marshmallows!");
		System.out.println(sys14);
		String a = "a";
		String b = "b";
		
		
}
}
