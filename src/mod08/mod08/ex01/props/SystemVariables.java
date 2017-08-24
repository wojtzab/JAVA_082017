package mod08.ex01.props;
import java.util.*;

public class SystemVariables {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.list(System.out);
	}
}

