/**
 * 
 */
package 基础练习.零一字串;

/**
 * @author HTRTan
 * @date 2018/12/14
 */
public class Main {

	/**
	 * @param args
	 * 解法一 ：十进制转换成二进制
	 */
	public static void main(String[] args) {
		// TODO 解法一 ：十进制转换成二进制
		long startTime = System.currentTimeMillis();    //获取开始时间
		for(int Count = 0 ;Count<32;Count++){
			String ans ="";
			int TemCount =Count;
			while (TemCount>1) {
				ans =Integer.toString(TemCount%2)+ans;
				TemCount /=2; 
			}
			ans=Integer.toString(TemCount)+ans;
			for(int Zero = ans.length();Zero<5;Zero++){
				ans = "0"+ans;
			}
			System.out.println(ans);
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
	
	/**
	 * @param args
	 * 解法二 ：暴力for循环
	 */
	public static void main2(String[] args) {
		// TODO 解法二 ：暴力for循环
		long startTime2 = System.currentTimeMillis();    //获取开始时间
		for(int a=0 ;a<2;a++){
			for(int b=0 ;b<2;b++){
				for(int c=0 ;c<2;c++){
					for(int d=0 ;d<2;d++){
						for(int e=0 ;e<2;e++){
							System.out.println(Integer.toString(a)+Integer.toString(b)+Integer.toString(c)+Integer.toString(d)+Integer.toString(e));
						}
					}
				}
			}
		}
		long endTime2 = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime2 - startTime2) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 * 
 * 00000
 * 
 * 00001
 * 
 * 00010
 * 
 * 00011
 * 
 * 00100
 * 
 * 请按从小到大的顺序输出这32种01串。
 * 
 * 输入格式
 * 本试题没有输入。
 * 输出格式
 * 输出32行，按从小到大的顺序每行一个长度为5的01串。
 * 样例输出
 * 00000
 * 00001
 * 00010
 * 00011
 * <以下部分省略>
 * 
 * 题解：可以看得出10字串就是二进制，从大到小就是十进制0-31，那么十进制转二级就可以了
 * 		同样也可以用暴力for循环，不过要注意时间
 */