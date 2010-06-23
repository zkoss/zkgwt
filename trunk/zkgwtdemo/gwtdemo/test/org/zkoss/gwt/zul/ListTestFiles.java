package org.zkoss.gwt.zul;

import java.io.File;

public class ListTestFiles {

	public static void main(String[] args) {

		listFilesRecursively("I:/svn/zkgwt/zkgwtdemo/gwtdemo/src/org/zkoss/gwt/client/testzk");
	}

	private static void listFilesRecursively(String dirName) {
		File dir = new File(dirName);
		String[] children = dir.list();
		printFiles(children, dirName);

	}

	private static void printFiles(String[] children, String dirName) {

		if (children != null) {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				if ((new File(dirName + "/" + filename)).isDirectory()) {
					listFilesRecursively(dirName + "/" + filename);
				}
				if (filename.endsWith(".java") && filename.startsWith("Test")
						&& !filename.contains("Template") && !filename.contains("Wrapper")) {
					String name = filename.replace(".java", "");
					//map.put("TestcaseCaptcha", new TestcaseCaptcha());
					System.out.println("map.put(\""+name+"\", new "+name+"());");
				}
			}
		}
	}
}
