package com.paultofunmi.mui;

/**
 * Copyright © 2021.
 */
public class CharArraySubString {

	public static char[] findSubString(char[] input, int start, int length){


		if(start < 0 || length < 0 || length > input.length || length > (input.length - start)) return new char[]{'e', 'm', 'p', 't', 'y'};

		char[] subChar = new char[length];

		for (int i = start, j = 0; i < input.length; i++, j++) {

			if(j == length) break;
			subChar[j] = input[i];
		}

		return subChar;

//		if (length < 0 || start < 0 || start+length-1>=input.length)
//		{
//			return null;
//		}
//
//		char[] sub = new char[length];
//		for (int i=start, j=0; j<length; i++, j++)
//		{
//			sub[j] = input[i];
//		}
//
//		return sub;
	}

	public static void main(String[] args) {

//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 0, 4));
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 0, 3));
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 0, 2));
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 0, 1));
//
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 1, 3));
//
		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 1, 2));
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 1, 1));
//
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 2, 2));
//
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 2, 1));
//
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 3, 1));
//
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 1, 0));
//
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, -1, 2));
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, -1, -2));
//		System.out.println(CharArraySubString.findSubString(new char[]{'a', 'b', 'c'}, 0, 1));

	}
}
