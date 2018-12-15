/**
 * 
 */
package 基础练习.特殊的数字;

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
		long startTime = System.currentTimeMillis();    //获取开始时间
		for(int Count = 100 ; Count < 1000 ; Count++){
			int bit = Integer.valueOf(Integer.toString(Count).substring(2));//个位
			int dec = Integer.valueOf(Integer.toString(Count).substring(1,2));//十位
			int hun = Integer.valueOf(Integer.toString(Count).substring(0,1));//百位
			if(Count == Math.pow(bit, 3)+Math.pow(dec, 3)+Math.pow(hun, 3)){
				System.out.println(Count);
			}
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */