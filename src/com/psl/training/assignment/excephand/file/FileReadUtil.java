package com.psl.training.assignment.excephand.file;

import java.io.FileReader;

public class FileReadUtil {

	public static void validID(String id) {
		try {
			int number = Integer.parseInt(id);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		String fileName = "src/com/psl/training/assignment/excephand/file/movies.txt";
		try {
			FileReader fileReader = new FileReader(fileName);
			int ch;
			String fileContent = "";
			while ((ch = fileReader.read()) != -1) {
				fileContent += (char) ch;
			}
			String films[] = fileContent.split("\n");
			if (films == null || films.length == 0) {
				throw new Exception("No values are provided");
			}
			System.out.println("Number of values provided: " + films.length);
			System.out.println("IMDB ID\t\tRATING\t\tFILM");
			for (String film : films) {
				film = film.trim();
				String desc[] = film.split(",");
				for (int i = 1; i < desc.length; i++) {
					desc[i] = desc[i].trim();
					if (i == 1) {
						validID(desc[i]);
					}
					System.out.print(desc[i] + "\t\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
