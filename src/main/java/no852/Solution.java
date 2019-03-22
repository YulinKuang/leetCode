package no852;

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if (A[mid] < A[mid + 1])
                left = mid;
            else if (A[mid] < A[mid - 1])
                right = mid;
            else
                return mid;
        }
        return left;
    }
}

//class no852.Solution {
//    public int peakIndexInMountainArray(int[] A) {
//        int lo = 0, hi = A.length - 1;
//        while (lo < hi) {
//            int mi = lo + (hi - lo) / 2;
//            if (A[mi] < A[mi + 1])
//                lo = mi + 1;
//            else
//                hi = mi;
//        }
//        return lo;
//    }
//}