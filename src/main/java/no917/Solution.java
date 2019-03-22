package no917;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        LinkedList<Integer> evenNums = new LinkedList<Integer>();
        LinkedList<Integer> oddNums = new LinkedList<Integer>();
        for (int num: A)
            if (isEven(num))
                evenNums.add(num);
            else
                oddNums.add(num);
        int n = A.length / 2;
        for (int i = 0; i < n; i++) {
            A[i*2] = evenNums.getFirst();
            A[i*2+1] = oddNums.getFirst();
            evenNums.removeFirst();
            oddNums.removeFirst();
        }
        return A;
    }
    private boolean isEven(int num) {
        return num % 2 == 0;
    }
}