package emoji;

import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
		/*String c = "\u1F604\u1F61A";
		System.out.println(c.length());
		System.out.println(c.getBytes("utf-8").length);
		//System.out.println(c.codePointCount(0,c.length()));
		*//*int i = c.codePointAt(0);
		System.out.println(i);*//*
		for(char ch:c.toCharArray()){
			if(Character.isHighSurrogate(ch)){
				System.out.println("前导代理");
			}else if(Character.isLowSurrogate(ch)){
				System.out.println("后尾代理");
			}else{
				System.out.println("基本平面字符");
			}
		}*/


		/*char[] cs1 = Character.toChars(Integer.parseInt("1F604", 16));//1D306是一个辅助平面字符
		char[] cs2 = Character.toChars(Integer.parseInt("1F61A", 16));//1D306是一个辅助平面字符
		*//*for(char ch:cs1){
			if(Character.isHighSurrogate(ch)){
				System.out.println("前导代理");
			}else if(Character.isLowSurrogate(ch)){
				System.out.println("后尾代理");
			}else{
				System.out.println("基本平面字符");
			}
		}*//*
		System.out.println(new String(cs1));
		System.out.println(new String(cs2));*/
		StringBuilder sb = new StringBuilder("下面都是emoji表情：");
		sb.append(printEmoji("1F604"));
		sb.append(printEmoji("1F60A"));
		sb.append(printEmoji("1F618"));
		sb.append(printEmoji("1F46B"));
		sb.append(printEmoji("1F44D"));

		String result = sb.toString();
		for(char c:result.toCharArray()){
			System.out.println(c);
		}

	}

	private static String printEmoji(String unicodeStr){
		char[] cs1 = Character.toChars(Integer.parseInt(unicodeStr, 16));//1D306是一个辅助平面字符
		return new String(cs1);
	}
}