/**
 * 
 */
package 基础练习.数列特征;

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
		int[] Arr_Int = new int[Index_Int];
		for(int TemIndex = 0 ; TemIndex < Index_Int ; TemIndex++){
			Arr_Int[TemIndex] = cin.nextInt();
		}
		long startTime = System.currentTimeMillis();    //获取开始时间
		int ans_max = -10000 , ans_min = 10000, ans_sum = 0;
		for(int Count = 0 ; Count < Arr_Int.length ; Count++){
			ans_sum += Arr_Int[Count];
			ans_max = Arr_Int[Count] > ans_max ? Arr_Int[Count] : ans_max ;
			ans_min = Arr_Int[Count] < ans_min ? Arr_Int[Count] : ans_min ;
		}
		System.out.println(ans_max + "\n" + ans_min + "\n" + ans_sum);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 给出n个数，找出这n个数的最大值，最小值，和。
 * 
 * 输入格式
 * 第一行为整数n，表示数的个数。
 * 
 * 第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
 * 
 * 输出格式
 * 输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
 * 样例输入
 * 5
 * 1 3 -2 4 5
 * 样例输出
 * 5
 * -2
 * 11
 * 数据规模与约定
 * 1 <= n <= 10000。
 * 
 * 题解：题目不难，关键在于如何优化代码
 */