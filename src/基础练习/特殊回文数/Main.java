/**
 * 
 */
package 基础练习.特殊回文数;

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
		int N_int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //获取开始时间
		for(int Row1 = 1 ; Row1<10 ; Row1++){
			for(int Row2 = 0 ; Row2<10 ; Row2++){
				for(int Row3 = 0 ; Row3<10 ; Row3++){
					if(N_int == Row1+Row2+Row3+Row2+Row1){
						System.out.print(Row1);
						System.out.print(Row2);
						System.out.print(Row3);
						System.out.print(Row2);
						System.out.println(Row1);
					}
				}
			}
		}
		for(int Row1 = 1 ; Row1<10 ; Row1++){
			for(int Row2 = 0 ; Row2<10 ; Row2++){
				for(int Row3 = 0 ; Row3<10 ; Row3++){
					if(N_int == Row1+Row2+Row3+Row3+Row2+Row1){
						System.out.print(Row1);
						System.out.print(Row2);
						System.out.print(Row3);
						System.out.print(Row3);
						System.out.print(Row2);
						System.out.println(Row1);
					}
				}
			}
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 * 输入格式
 * 　　输入一行，包含一个正整数n。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
 * 样例输入
 * 52
 * 样例输出
 * 899998
 * 989989
 * 998899
 * 数据规模和约定
 * 　　1<=n<=54。
 */