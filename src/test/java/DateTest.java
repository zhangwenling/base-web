import java.io.File;
import java.io.IOException;

public class DateTest {
	public static void main(String[] args) throws IOException {

		File file = new File("c:\\张文领.txt");
		if (file.createNewFile()) {
			System.out.println("创建成功");

		}

		System.getProperties().list(System.out);

	}
}
