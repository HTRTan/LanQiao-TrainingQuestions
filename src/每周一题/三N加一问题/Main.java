/**
 * 
 */
package 每周一题.三N加一问题;

import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/18
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int[] cin_Int = new int[2];
			cin_Int[0] = cin.nextInt();
			cin_Int[1] = cin.nextInt();
			int ans_max = 0 , ans_X = cin_Int[0], ans_Y = cin_Int[1];
			if(cin_Int[0] > cin_Int[1]){
				ans_X = cin_Int[1];
				ans_Y = cin_Int[0];
			}
			for(int Count = ans_X ; Count <= ans_Y ; Count++){
				int res = Count;
				int whi_Cou = 1;
				while(res!=1){
					whi_Cou += 1;
					if(res%2==0){
						res = res/2;
					}else{
						res = res * 3 + 1;
					}
				}
			ans_max = whi_Cou > ans_max ? whi_Cou : ans_max;
			}
		System.out.println(cin_Int[0] + " "+ cin_Int[1] + " " + ans_max);
		}
	}

}
/**
 * [问题描述]
 * 
 * 考虑如下的序列生成算法：从整数 n 开始，如果 n 是偶数，把它除以 2；如果 n 是奇数，把它乘 3 加1。用新得到的值重复上述步骤，直到 n = 1 时停止。例如，n = 22 时该算法生成的序列是：
 * 
 * 22，11，34，17，52，26，13，40，20，10，5，16，8，4，2，1
 * 
 * 人们猜想（没有得到证明）对于任意整数 n，该算法总能终止于 n = 1。这个猜想对于至少 1 000 000内的整数都是正确的。
 * 
 * 对于给定的 n，该序列的元素（包括 1）个数被称为 n 的循环节长度。在上述例子中，22 的循环节长度为 16。输入两个数 i 和 j，你的任务是计算 i 到 j（包含 i 和 j）之间的整数中，循环节长度的最大值。
 * 
 * [输入]
 * 
 * 输入每行包含两个整数 i 和 j。所有整数大于 0，小于 1 000 000。
 * 
 * [输出]
 * 
 * 对于每对整数 i 和 j，按原来的顺序输出 i 和 j，然后输出二者之间的整数中的最大循环节长度。这三个整数应该用单个空格隔开，且在同一行输出。对于读入的每一组数据，在输出中应位于单独的一行。
 * 
 * [样例输入]
 * 1 10
 * 100 200
 * 201 210
 * 900 1000
 * 
 * [样例输出]
 * 1 10 20
 * 100 200 125
 * 201 210 89
 * 900 1000 174
 */