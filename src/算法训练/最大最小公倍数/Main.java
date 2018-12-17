/**
 * 
 */
package 算法训练.最大最小公倍数;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/17
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
		String ans ;
		if(Cin_Int%2==0){
			if(Cin_Int%3==0 && (Cin_Int-3)%3==0){
				ans = (new BigInteger(Integer.toString(Cin_Int-1)).multiply(new BigInteger(Integer.toString(Cin_Int-2)))).multiply(new BigInteger(Integer.toString(Cin_Int-3))).toString();
			}else{
				ans = (new BigInteger(Integer.toString(Cin_Int)).multiply(new BigInteger(Integer.toString(Cin_Int-1)))).multiply(new BigInteger(Integer.toString(Cin_Int-3))).toString();
			}
		}else{
			ans = (new BigInteger(Integer.toString(Cin_Int)).multiply(new BigInteger(Integer.toString(Cin_Int-1)))).multiply(new BigInteger(Integer.toString(Cin_Int-2))).toString();
		}
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
 * 
 * 输入格式
 * 输入一个正整数N。
 * 
 * 输出格式
 * 输出一个整数，表示你找到的最小公倍数。
 * 样例输入
 * 9
 * 样例输出
 * 504
 * 数据规模与约定
 * 1 <= N <= 106。
 * 
 * 题解：最大最小公倍数，联想到两个数的求最大最小公倍数，即两个数的乘积（重点：连续的两个自然数是互斥的）。
 *		同样，我们可以拿最后三个数来做考虑。
 *		1.当n为奇数时，n，n-1，n-2为奇偶奇，里面只有一个偶数，所以不会有2这个因子。这三个数相差不到3，所以也不会有因子3，故符合题意。
 *		2.当n为偶数时，n，n-1，n-2为偶奇偶，此时n，n-2肯定含有因子2，所以除于2不值得。所以考虑将n-2 换成n-3，变成奇偶奇，此时也有一个问题，
 *      n和n-3，如果n%3==0，则除于3更不值得。仍根据奇偶奇的原则，变动偶数n为n-2，此时换成n-1，n-2，n-3和1情况一样。故此时符合题意。
 */