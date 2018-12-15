/**
 * 
 */
package 基础练习.闰年判断;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/14
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		int Cin_Int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //获取开始时间
		String ans = ((Cin_Int%4==0 && Cin_Int%100!=0) || Cin_Int%400==0)?"yes":"no";
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 给定一个年份，判断这一年是不是闰年。
 * 
 * 当以下情况之一满足时，这一年是闰年：
 * 
 * 1. 年份是4的倍数而不是100的倍数；
 * 
 * 2. 年份是400的倍数。
 * 
 * 其他的年份都不是闰年。
 * 
 * 输入格式
 * 输入包含一个整数y，表示当前的年份。
 * 输出格式
 * 输出一行，如果给定的年份是闰年，则输出yes，否则输出no。
 * 说明：当试题指定你输出一个字符串作为结果（比如本题的yes或者no，你需要严格按照试题中给定的大小写，写错大小写将不得分。
 * 
 * 样例输入
 * 2013
 * 样例输出
 * no
 * 样例输入
 * 2016
 * 样例输出
 * yes
 * 数据规模与约定
 * 1990 <= y <= 2050。
 */

