package test.main;

import java.util.Arrays;

public class MainClass02 {
	public static void main(String[] args) {
		// 0 으로 초기화된 방 3개짜리 int[] 객체를 만들어서 참조값을 지역 변수 nums에 담기
		int[] nums= {0,0,0};
		// 0번방에 10, 1번방에 20, 2번방에 30 을 저장해보세요.
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 0 으로 초기화된 방 500개짜리 int[] 객체를 만들어서 참조값을 지역 변수 nums2에 담기
		int[] nums2 = new int[500];
		/*
		 *  0 번방에 1
		 *  1 번방에 2
		 *  2 번방에 3
		 *  .
		 *  .
		 *  .
		 *  .
		 *  .
		 *  499 번방에 500을 저장해 보세요.
		 */
		
		for(int i = 0; i < nums2.length; i++) {
			nums2[i] = i + 1;
			System.out.println(i+"번방에 는" + nums2[i] + "입니다.");
			System.out.println(Arrays.toString(nums2));
		}
		System.out.println(nums2[]);
	}
}
