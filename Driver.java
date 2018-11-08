import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File babyNames = new File("babynames.txt");
			PrintWriter outBoys = new PrintWriter("boynames.txt");
			PrintWriter outGirls = new PrintWriter("girlnames.txt");
			Scanner in = new Scanner(babyNames);
			ArrayList<String> boy = new ArrayList<>();
			ArrayList<String> girl = new ArrayList<>();

			int rank, i = 0;
			
			System.out.println("Boy and Girl 99999 names: ");
			
			while(in.hasNext()) {
				rank = in.nextInt();
				outBoys.print(rank + " ");
				boy.add(i, in.next());
				outBoys.print(boy.get(i) + " ");
				outBoys.print(in.nextInt() + " ");
				outBoys.println(in.nextDouble());
				
				outGirls.print(rank + " ");
				girl.add(i,  in.next());
				outGirls.print(girl.get(i) + " ");
				outGirls.print(in.nextInt() + " ");
				outGirls.println(in.nextDouble());
								
				i++;
			}
			
			in.close();
			outBoys.close();
			outGirls.close();
			
			for(int j = 0; j < boy.size(); j++) {
				if(girl.contains(boy.get(j))) {
					System.out.println(boy.get(j));
				}
				
			}
		}
		catch(FileNotFoundException ex1) {
			ex1.printStackTrace(System.out);
		}
		catch(NoSuchElementException ex2) {
			ex2.printStackTrace(System.out);
		}
	}

}
