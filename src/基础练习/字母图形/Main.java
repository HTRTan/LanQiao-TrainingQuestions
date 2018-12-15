/**
 * 
 */
package 基础练习.字母图形;

import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/14
 */
public class Main {

	/**
	 * @param args
	 */
	private static String[] Letter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		int Rows = cin.nextInt();
		int Cols = cin.nextInt();
		long startTime = System.currentTimeMillis();    //获取开始时间
		for(int NewRow = 0 ; NewRow < Rows ; NewRow++){
			String ans = "";
			for(int NewCol = 0 ; NewCol < Cols ; NewCol++){
				ans += Letter[Math.abs(NewCol-NewRow)];
			}
			System.out.println(ans);
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}

/**
 * 问题描述
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 * 
 * ABCDEFG
 * 
 * BABCDEF
 * 
 * CBABCDE
 * 
 * DCBABCD
 * 
 * EDCBABC
 * 
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 * 
 * 输入格式
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * 输出格式
 * 输出n行，每个m个字符，为你的图形。
 * 样例输入
 * 5 7
 * 样例输出
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 数据规模与约定
 * 1 <= n, m <= 26。
 * 
 * 题解：
 * ABCDEFG->1234567
 * BABCDEF->2123456
 * CBABCDE->3212345
 * DCBABCD->4321234
 * EDCBABC->5432123
 * Math.abs(NewCol-NewRow) //最主要：行数和列数相减的绝对值，符合先减少后增加的趋势
 */