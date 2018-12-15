/**
 * 
 */
package 基础练习.杨辉三角形;

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
		int Index_Int = cin.nextInt()+1;
		int[][] Pascal = new int[Index_Int][];
		long startTime = System.currentTimeMillis();    //获取开始时间
		for(int Count = 1 ; Count < Index_Int ; Count++){
			Pascal[Count] = new int[Count];
			for(int CountRow = 0 ; CountRow < Count ; CountRow++){
				if(CountRow-1<0){
					Pascal[Count][CountRow] = 1;
					System.out.print(Pascal[Count][CountRow]+" ");
				}else if(CountRow+1 >=Count){
					Pascal[Count][CountRow] = 1;
					System.out.print(Pascal[Count][CountRow]);
				}else{
					Pascal[Count][CountRow] = Pascal[Count-1][CountRow-1]+Pascal[Count-1][CountRow];
					System.out.print(Pascal[Count][CountRow]+" ");
				}
			}
			System.out.print("\n");
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
   * 　
 * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
   * 　　
 * 下面给出了杨辉三角形的前4行：
   * 　　
 *    1
 *   1 1
 *  1 2 1
 * 1 3 3 1
 * 给出n，输出它的前n行。
 * 
 * 输入格式
 * 输入包含一个数n。
 * 
  * * 输出格式
 * 输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。
 * 样例输入
 * 4
 * 样例输出
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 数据规模与约定
 * 1 <= n <= 34。
 * 
 * 题解：靠边的都为1，中间的值等于上面的index[x-1]+index[x]之和
 */