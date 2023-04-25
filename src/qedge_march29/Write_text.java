package qedge_march29;
import java.io.*;
public class Write_text {

	public static void main(String[] args) throws Throwable {
		File f = new File ("E://Sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am very positive thinking person");
		bw.newLine();
		bw.write("But I got somtime negative thinking");
		bw.newLine();
		bw.write("Sometimes i have in Confusion and Overthinking");
		bw.flush();
		bw.close();

	}

}
