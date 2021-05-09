package com.paultofunmi.hackerrank;

import java.util.Arrays;

/**
 * Copyright © 2021, Jumia.
 */
public class ActivityNotification {

	static int activityNotifications(int[] expenditure, int d) {

		return method1(expenditure, d);
	}

	private static int method1(int[] expenditure, int d) {

		int count = 0;
		double median = 0.0;
		int middleIndex = d / 2;

		if(expenditure == null || d >= expenditure.length) return 0;

		for(int j = d, startIdx = 0; j < expenditure.length; j++, startIdx++){

			int[] sortedArray = Arrays.copyOfRange(expenditure, startIdx, d + startIdx);
			Arrays.sort(sortedArray);


			if(sortedArray.length % 2 == 0) {

				median = (sortedArray[middleIndex] + sortedArray[middleIndex - 1] ) / 2.0;

			}else {

				median = sortedArray[middleIndex];

			}

			if(expenditure[j] >= (median * 2)) ++count;
		}


		return count;
	}
	public static void main(String[] args) {

//		System.out.println(ActivityNotification.activityNotifications(new int[]{10, 20, 30, 40, 50}, 3));
//		System.out.println(ActivityNotification.activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
		System.out.println(ActivityNotification.activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));


	}
}
