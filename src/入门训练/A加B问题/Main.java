/**
 * 
 */
package 入门训练.A加B问题;

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
		int Cin1_int = cin.nextInt();
		int Cin2_int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //获取开始时间
		System.out.println(Cin1_int + Cin2_int);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
