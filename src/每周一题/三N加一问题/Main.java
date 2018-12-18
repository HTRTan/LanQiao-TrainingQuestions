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
			int ans_max = 0;
			for(int Count = cin_Int[0] ; Count <= cin_Int[1] ; Count++){
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
