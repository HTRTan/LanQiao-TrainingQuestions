/**
 * 
 */
package 算法训练.结点选择;

import java.util.ArrayList;
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
		int Cin_Index = cin.nextInt();
		int[] Cin_Weight = new int[Cin_Index];
		for(int TemInd = 0 ; TemInd < Cin_Index ; TemInd++){
			Cin_Weight[TemInd] = cin.nextInt();
		}
		int[][] Cin_Path = new int[Cin_Index-1][2];
		for(int TemInd = 0 ; TemInd < Cin_Path.length ; TemInd++){
			Cin_Path[TemInd][0] = cin.nextInt();
			Cin_Path[TemInd][1] = cin.nextInt();
		}
		long startTime = System.currentTimeMillis();    //获取开始时间
		int[][] Cin_Weight_Count = new int[Cin_Index][Cin_Index];
		for(int Count = 0 ; Count < Cin_Index ; Count++){
			ArrayList<Integer> TemArr = new ArrayList<Integer>();
			TemArr.add(Count);
			Cin_Weight_Count[Count][Count] = 1;
			while (TemArr.size()<Cin_Index) {
				for(int Count_Ind = 0 ; Count_Ind < Cin_Path.length ; Count_Ind++){
					int TemCou = TemArr.size();
					for (int Arr_Int = 0; Arr_Int< TemCou ;Arr_Int++) {
						if(Cin_Path[Count_Ind][0] == TemArr.get(Arr_Int)+1){
							Cin_Weight_Count[Count][Cin_Path[Count_Ind][1]-1]=Cin_Weight_Count[Count][TemArr.get(Arr_Int)]==0?1:0;
							TemArr.add(Cin_Path[Count_Ind][1]-1);
						}else if(Cin_Path[Count_Ind][1] == TemArr.get(Arr_Int)+1){
							Cin_Weight_Count[Count][Cin_Path[Count_Ind][0]-1]=Cin_Weight_Count[Count][TemArr.get(Arr_Int)]==0?1:0;
							TemArr.add(Cin_Path[Count_Ind][0]-1);
						}
					}
				}
			}
			
		}
		int ans = 0;
		for (int[] Arr_Ind : Cin_Weight_Count) {
			int max = 0;
			for (int Arr_Cou : Arr_Ind) {
				if(Arr_Cou==1){
					max += Cin_Weight[Arr_Cou];
				}
			}
			ans = max > ans ? max : ans;
		}
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
