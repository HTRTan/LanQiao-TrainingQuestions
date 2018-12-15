/**
 * 
 */
package 基础练习.十六进制转八进制;

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
	private static String[] Binary_Hex = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	private static String[] Binary_Oct = {"000","001","010","011","100","101","110","111"};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		int Index_Int = cin.nextInt();
		String[] Cin_Str = new String[Index_Int];
		for(int Ind = 0; Ind < Index_Int ; Ind++){
			Cin_Str[Ind] = cin.next().toUpperCase();
		}
		long startTime = System.currentTimeMillis();    //获取开始时间
		ArrayList<String> Hexadecimal_Arr = new ArrayList<>(Arrays.asList(Hexadecimal)) ;
		ArrayList<String> Binary_Hex_Arr = new ArrayList<>(Arrays.asList(Binary_Hex)) ;
		ArrayList<String> Binary_Oct_Arr = new ArrayList<>(Arrays.asList(Binary_Oct)) ;
		for(int Ind = 0; Ind < Index_Int ; Ind++){
			StringBuilder ans_Bin = new StringBuilder();
			for(int Count = 0 ; Count < Cin_Str[Ind].length() ;Count++){
				String TemNum = Character.toString(Cin_Str[Ind].charAt(Count)) ;
				ans_Bin.append(Binary_Hex_Arr.get(Hexadecimal_Arr.indexOf(TemNum)).toString());
			}
			while(ans_Bin.length()%3!=0){
				ans_Bin.insert(0, "0");
			}
			StringBuilder ans_Oct = new StringBuilder();
			for(int Count = 0 ; Count < ans_Bin.length()/3 ;Count++){
				String TemStr = null;
				if(Count+1 >= ans_Bin.length()/3){
					TemStr = ans_Bin.substring(Count*3);
				}else{
					TemStr = ans_Bin.substring(Count*3,Count*3+3);
				}
				ans_Oct.append(Binary_Oct_Arr.indexOf(TemStr));
			}
			while (ans_Oct.charAt(0)=='0') {
				ans_Oct.deleteCharAt(0);
			}
			System.out.println(ans_Oct);
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
}
/**
 * 问题描述
 * 　　给定n个十六进制正整数，输出它们对应的八进制数。
 * 
 * 输入格式
 * 　　输入的第一行为一个正整数n （1<=n<=10）。
 * 　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 * 
 * 输出格式
 * 　　输出n行，每行为输入对应的八进制正整数。
 * 
 * 　　【注意】
 * 　　输入的十六进制数不会有前导0，比如012A。
 * 　　输出的八进制数也不能有前导0。
 * 
 * 样例输入
 * 　　2
 * 　　39
 * 　　123ABC
 * 
 * 样例输出
 * 　　71
 * 　　4435274
 * 
 * 　　【提示】
 * 　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
 * 
 * 题解：(大坑)每个十六进制数长度不超过100000
 * 		 如果直接用long，int，BigInteger 会直接超出（例如先十六进制转换成十进制再转换成八进制）会有异常
 * 		建议先转换成二进制的字符串，再用字符串作八进制的匹配，效率会更高
 */