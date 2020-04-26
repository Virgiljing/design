package leetcode;

public class Test04FindMedianSortedArrays {
    public static void main(String[] args) {
        System.out.println();
    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] all = new int[nums1.length+nums2.length];
            int i=0,j=0,a=0;
            while (i < nums1.length || j < nums2.length || a<all.length) {

                if (i >= nums1.length) {
                    all[a++] = nums2[j++];
                    continue;
                }
                if (j >= nums2.length) {
                    all[a++] = nums1[i++];
                    continue;
                }

                if (nums1[i]<=nums2[j]){
                    all[a++] = nums1[i++];
                }
                else {
                    all[a++] = nums2[j++];
                }
            }

            if (all.length % 2 == 0){
                if (all.length < 2) {
                    return all[all.length-1];
                }
                int median = all.length / 2;
                double medianD = all[median] + all[median-1];
                return medianD/2;
            }else {
                return all[all.length/2];
            }
        }
    }
}
