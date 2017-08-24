package mod08.ex01.props;
import java.util.*;

public class SystemVariables {

//	public static void main(String[] args) {
		//Properties p = System.getProperties();
		//p.list(System.out);
	//}
	public static void main(String[] args) {
		Properties p = System.getProperties();
		System.out.println(p.getProperty("user.dir"));
		System.out.println(p.getProperty("user.store"));
	//	p.list(System.out);
	}
}





