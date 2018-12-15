/**
 * 
 */
package 基础练习.十六进制转十进制;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/15
 */
public class Main {

	/**
	 * @param args
	 */
	private static String[] Hexadecimal = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		String Cin_Str = cin.next().toUpperCase();
		long startTime = System.currentTimeMillis();    //获取开始时间
		BigDecimal ans = new BigDecimal(0);
		ArrayList<String> Hexadecimal_Arr = new ArrayList<>(Arrays.asList(Hexadecimal)) ;
		for(int Count = 0 ; Count < Cin_Str.length() ; Count++){
			String Num = Character.toString(Cin_Str.charAt(Cin_Str.length() - 1 - Count)); 
			ans = ans.add((new BigDecimal(Hexadecimal_Arr.indexOf(Num))).multiply((new BigDecimal(16)).pow(Count)));
		}
		System.out.println(ans.toString());
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
}
/**
 * 问题描述
 * 　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 * 　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * 样例输入
 * FFFF
 * 样例输出
 * 65535
 * 
 * 题解：建议运算都使用BigDecimal类进行精度运算，防止数据过大丢失
 * 		使用CharAt将每位读取出来运算
 */