import java.util.ArrayList;
import java.util.List;

class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++)
            if (isSelfDevisibel(i)) result.add(i);
        return result;
    }

    private boolean isSelfDevisibel(int n) {
        int num = n;
        while (n > 0) {
            int mod = n%10;
            if (mod == 0 || num % mod !=0) return false;
            n /= 10;
        }
        return true;
    }
}