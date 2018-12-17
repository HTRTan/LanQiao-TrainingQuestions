/**
 * 
 */
package 算法训练.K好数;

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
		int Cin_K = cin.nextInt();
		int Cin_L = cin.nextInt();
		long startTime = System.currentTimeMillis();    //获取开始时间
		BigInteger[] Opp_Int =new BigInteger[Cin_K];
		for(int Count_K = 0 ; Count_K < Cin_K ; Count_K++){
			Opp_Int[Count_K] = new BigInteger("1");
		}
		for(int Count_L = 1 ; Count_L < Cin_L ; Count_L++){
			BigInteger[] TemOpp_Int = new BigInteger[Cin_K];
			for(int Count_K = 0 ; Count_K < Cin_K ; Count_K++){
				TemOpp_Int[Count_K] = new BigInteger("0");
			}
			for(int Count_K = 0 ; Count_K < Cin_K ; Count_K++){
				for(int Tem_K = 0 ; Tem_K < Cin_K ; Tem_K++){
					if(Count_K-1 == Tem_K || Count_K+1 == Tem_K){
						continue;
					}else{
						TemOpp_Int[Count_K] = TemOpp_Int[Count_K].add(Opp_Int[Tem_K]);
					}
				}
			}
			Opp_Int = TemOpp_Int;
		}
		BigInteger ans  = new BigInteger("0");;
		for(int Count_K = 1 ; Count_K < Cin_K ; Count_K++){
			ans = ans.add(Opp_Int[Count_K]);
		}
		ans = ans.mod(new BigInteger("1000000007"));
		System.out.println(ans.toString());
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 如果一个自然数N的K进制表示中任意的相邻的两位都不是相邻的数字，那么我们就说这个数是K好数。求L位K进制数中K好数的数目。例如K = 4，L = 2的时候，所有K好数为11、13、20、22、30、31、33 共7个。由于这个数目很大，请你输出它对1000000007取模后的值。
 * 
 * 输入格式
 * 输入包含两个正整数，K和L。
 * 
 * 输出格式
 * 输出一个整数，表示答案对1000000007取模后的值。
 * 样例输入
 * 4 2
 * 样例输出
 * 7
 * 数据规模与约定
 * 对于30%的数据，KL <= 106；
 * 
 * 对于50%的数据，K <= 16， L <= 10；
 * 
 * 对于100%的数据，1 <= K,L <= 100。
 * 
 * 题解： 动态规划--多阶段决策问题（每做一次决策（即一个阶段）就可以得到解的一部分，那么当所有的决策做完后，完整的解就出现了。）
 * 		
 */