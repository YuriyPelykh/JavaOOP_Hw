package com.gmail.yuriypelykh;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File srcDir = new File("src_dir");
		String dstDir = "dst_dir\\";

		ExtFileFilter eFF = new ExtFileFilter(new String[] { "docx" });

		File[] targetFiles = srcDir.listFiles(eFF);

		for (File file : targetFiles) {
			File dstFile = new File(dstDir + file.getName());
			try {
				FileService.fileCopy(file, dstFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}