//: io/DirList2.java
// use anonymous inner classes.
// {Args: "D.*.java"}

package com.io18;

import java.util.Arrays;
import java.util.regex.*;
import java.io.*;

public class DirList1 {
	public static FilenameFilter filter (final String regex) {
		// Creation of anonymous inner class:
		return new FilenameFilter () {
			private Pattern pattern = Pattern.compile(regex);			
			public boolean accept (File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File(".");
		String[] list;
		if(args.length == 0) {
			list = path.list();
		} else {
			list = path.list(filter(args[0]));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String listItem: list) {
			System.out.println(listItem);
		}
	}
}
