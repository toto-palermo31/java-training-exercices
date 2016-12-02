package io.robusta.files;

import java.awt.image.ReplicateScaleFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadFileApplication {

	public static void main(String[] args) {

		if (args == null || args.length != 2) {
			System.out.println("il doit y avoir deux arguments!");
			return;
		}

		ReadFileApplication app = new ReadFileApplication();
		try {
			app.readFile(args[0], args[1]);
		} catch (FileNotFoundException e) {
			System.out.println("Oh Oh...il semble que le fichier " + args[0] + " n'existe pas!!");
		} catch (IOException e) {
			System.out.println("Oh Oh...il semble que le fichier " + args[1] + " n'existe pas!!");
		}
	}

	void readFile(String argumentFile, String output) throws IOException {

		// where am i?
		String executionPath = System.getProperty("user.dir");
		System.out.println(executionPath);
		String textPath = executionPath + "/" + argumentFile;
		String resultPath = executionPath + "/" + output;
		Path path = Paths.get(textPath);

		List<String> lines = Files.readAllLines(path);
		List<String> resultFile = new ArrayList<>();

		for (int index = 0; index < lines.size(); index++) {

			String current = lines.get(index);

			if (current.length() > 0 && current.charAt(0) == '*') {

				String result = current.replaceFirst("\\*", "<li>");
				resultFile.add(result);

			}

		}
		StringBuilder sb = new StringBuilder();
		for (String line : resultFile) {
			sb.append(line).append("\n");
		}

		Files.write(Paths.get(resultPath), sb.toString().getBytes("utf-8"), StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);

	}

}
