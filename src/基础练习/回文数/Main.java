/**
 * 
 */
package 基础练习.回文数;

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
		for(int Row1 = 1 ; Row1<10 ; Row1++){
			for(int Row2 = 0 ; Row2<10 ; Row2++){
				System.out.print(Row1);
				System.out.print(Row2);
				System.out.print(Row2);
				System.out.println(Row1);
			}
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 * 问题描述
 * 　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的四位十进制数
 */