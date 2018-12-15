/**
 * 
 */
package 基础练习.数列排序;

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
		int[] Cin_Str = new int[Index_Int];
		for(int Ind = 0; Ind < Index_Int ; Ind++){
			Cin_Str[Ind] = cin.nextInt();
		}
		long startTime = System.currentTimeMillis();    //获取开始时间
		for(int Count = 1 ; Count < Cin_Str.length ; Count++){
			int TemInd = Count;
			while(Cin_Str[TemInd-1]>Cin_Str[TemInd]) {
					int TemInt = Cin_Str[TemInd-1];
					Cin_Str[TemInd-1] = Cin_Str[TemInd];
					Cin_Str[TemInd] = TemInt;
					TemInd -=1;
					if(TemInd<1){
						break;
					}
				}
		}
		for(int Count = 0 ; Count < Cin_Str.length ; Count++){
			if(Count== Cin_Str.length-1){
				System.out.println(Cin_Str[Count]);
			}else{
				System.out.print(Cin_Str[Count] + " ");
			}
			
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
}
/**
 * 问题描述
 * 　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 * 输入格式
 * 　　第一行为一个整数n。
 * 　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
 * 输出格式
 * 　　输出一行，按从小到大的顺序输出排序后的数列。
 * 样例输入
 * 5
 * 8 3 6 4 9
 * 样例输出
 * 3 4 6 8 9
 * 
 * 题解：这次使用的是沉底法（自创）--冒泡法 这样子比较顺手从0开始
 * 
 */