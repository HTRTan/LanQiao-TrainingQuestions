/**
 * 
 */
package 基础练习.查找整数;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/15
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		int Index_Int = cin.nextInt();
		ArrayList<Integer> Arr_Int =new ArrayList<Integer>();
		for(int TemIndex = 0 ; TemIndex < Index_Int ; TemIndex++){
			Arr_Int.add(cin.nextInt());
		}
		int Search_Int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //获取开始时间
		System.out.println(Arr_Int.indexOf(Search_Int) >= 0 ? Arr_Int.indexOf(Search_Int)+1:-1);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 * 
 * 输入格式
 * 第一行包含一个整数n。
 * 
 * 第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
 * 
 * 第三行包含一个整数a，为待查找的数。
 * 
 * 输出格式
 * 如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
 * 样例输入
 * 6
 * 1 9 4 8 3 9
 * 9
 * 样例输出
 * 2
 * 数据规模与约定
 * 1 <= n <= 1000。
 * 
 * 题解：用ArrayList中的indexof即可得出下标（从0开始）
 * 		若使用int[]一维数组着要使用for循环匹配，当数值过多会影响程序运行时间
 */