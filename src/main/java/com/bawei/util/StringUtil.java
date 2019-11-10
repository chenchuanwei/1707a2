/**
 * 
 */
package com.bawei.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年3月14日 上午10:12:31
 */
public class StringUtil {
	
	
	/**
	 * 限定StringUtil不可以new出对象，只能调用静态方法
	 */
	protected StringUtil(){}
	
	
	/**
	 * 
	 * 功能说明：判断字符串是否有值，空白字符串也不算<br>
	 * @param src
	 * @return
	 * boolean
	 */
	public static boolean isEmpty(String src){
		return src != null && src.length() > 0;
	}
	
	
	/**
	 * 功能说明：判断字符串是否有值，空白字符串和空格也不算<br>
	 * @param src
	 * @return
	 * boolean
	 */
	public static boolean hasText(String src){
		return src != null && src.trim().length() > 0;
	}
	
	
	/**
	 * 功能说明：隐藏字符串中某些字符，例如手机号码、用户名、用户姓名等敏感信息，13800138000→1380013****，王麻子→王** <br>
	 * @param src
	 * @param start
	 * @param end
	 * @return
	 * String
	 */
	public static String hidden(String src, int start, int end){
		if(src == null){
			return null;
		}
		char[] chs = src.toCharArray();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < chs.length; i++) {
			result.append(i >= start && i <= end ? '*' : chs[i]);
		}
		return result.toString();
	}
	
	/**
	 * 功能说明：判断字符串的值是不是数字<br>
	 * @param validString
	 * @return
	 * boolean
	 */
	public static boolean isNumber(String validString){
		if(!hasText(validString)){
			return false;
		}
		
		boolean flag=true;
		byte[] tempbyte = validString.getBytes();
		for(int i = 0; i < validString.length(); i++){
			if( tempbyte[0] == 46 ){
				return false;
			}
			
			if( tempbyte[validString.length()-1] == 46 ){
				return false;
			}
			
			if(flag){
				if((tempbyte[i] == 46) && ( i != 0 )){
					flag=false;		
				}
				continue;
			}
			
			if((tempbyte[i] < 48) || (tempbyte[i] > 57)){
				return false;
			}
		
		}
		return true;
	}
	
	public static <E> boolean isEmptyCollection(Collection<E> list){
		
		int size = list.size();
		
		if(size>0){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean isNumber1(String str){
		
		String reg="^\\d+\\.?\\d+$";
		
		boolean matches = str.matches(reg);
		
		return matches;
	}
}
