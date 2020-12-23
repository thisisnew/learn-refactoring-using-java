package RemoveControlFlag.SimpleDatabaseAfter1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		SimpleDatabase db;
		try {
			db = new SimpleDatabase(new FileReader("C:/Users/thisi/Documents/dbfile.txt"));
			Iterator<String> it = db.iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: " + key);
				System.out.println("VALUE: " + db.getValue(key));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
