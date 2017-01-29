//: io/DirList.java
// Display a directory listing using regular expressions.
// {ARGS: "D.*\.java"}

package com.io18;

import java.util.Arrays;
import java.util.regex.*;
import java.io.*;

public class DirList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File(".");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem: list) {
			System.out.println(dirItem);
		}
	}	
}

class DirFilter implements FilenameFilter {
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(name).matches();
	}	
}