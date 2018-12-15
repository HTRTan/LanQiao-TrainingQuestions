/**
 * 
 */
package 算法训练.区间k大数查询;

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
		int[] Cin_Int = new int[Index_Int];
		for(int TemInd = 0 ; TemInd < Index_Int ; TemInd++){
			Cin_Int[TemInd] = cin.nextInt();
		}
		int Index2_Int = cin.nextInt();
		int[][] Cin2_Int = new int[Index2_Int][3];
		for(int TemInd = 0 ; TemInd < Index2_Int ; TemInd++){
			Cin2_Int[TemInd][0] = cin.nextInt();
			Cin2_Int[TemInd][1] = cin.nextInt();
			Cin2_Int[TemInd][2] = cin.nextInt();
		}
		long startTime = System.currentTimeMillis();    //获取开始时间
		
		
		for(int TemInd = 0 ; TemInd < Cin2_Int.length ; TemInd++){
			int[] ans = getIntArray(Cin_Int,Cin2_Int[TemInd][0],Cin2_Int[TemInd][1]);
			System.out.println(ans[Cin2_Int[TemInd][2]-1]);
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
	
	private static int[] getIntArray(int[] TemCin_Int , int startInd , int endInd) {
		int[] Cin_Int = new int[endInd - startInd +1];
		for(int TemInd = 0 ; TemInd < Cin_Int.length ; TemInd++){
			Cin_Int[TemInd] = TemCin_Int[startInd-1+TemInd];
		}
		for(int Count = 1 ; Count < Cin_Int.length ; Count++){
			int TemCount = Count;
			while (Cin_Int[TemCount-1]<Cin_Int[TemCount]) {
				int TemNum = Cin_Int[TemCount-1];
				Cin_Int[TemCount-1] = Cin_Int[TemCount];
				Cin_Int[TemCount] = TemNum;
				TemCount -=1;
				if(TemCount<1){
					break;
				}
			}
		}
		return Cin_Int;
	}

}
/**
 * 问题描述
 * 给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
 * 
 * 输入格式
 * 第一行包含一个数n，表示序列长度。
 * 
 * 第二行包含n个正整数，表示给定的序列。
 * 
 * 第三个包含一个正整数m，表示询问个数。
 * 
 * 接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。
 * 
 * 输出格式
 * 总共输出m行，每行一个数，表示询问的答案。
 * 样例输入
 * 5
 * 1 2 3 4 5
 * 2
 * 1 5 2
 * 2 3 2
 * 样例输出
 * 4
 * 2
 * 数据规模与约定
 * 对于30%的数据，n,m<=100；
 * 
 * 对于100%的数据，n,m<=1000；
 * 
 * 保证k<=(r-l+1)，序列中的数<=106。
 */