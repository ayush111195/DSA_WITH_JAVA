package com.ayush;

public class BinarySearchMountainArraySecondMeth {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,6,5,4,3,2,1};
        int result=pealindexInMountainArray(arr);
        System.out.println(result);
    }

    static int pealindexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //now u r dec party of array
                //this may be the ans,but look at left

                //this is why end!mid-1
                end = mid;
            } else {
                //you r in asc part of element
                start = mid + 1;//because we know that mid+1 elememt >mid element hence we r ignoring the mid element
            }
        }
        //in the end ,start=end and pointing to the largest number because of 2 check finding above
        // start and end always trying to find max element in the above 2 check
        //hence,when they are pointing to justone element that is the max on because the checks say
        // more elaboration:at every point of thime for start and end ,they have the best possible answer till that time
        // if we r saying that only one item is remining ,hence cuz of above line that is the best possible answer

        return start; // or return end both same at this possition
    }

}