import java.util.*;

public class Solution {
    public int reverse(int x) {
	boolean flag = false;
	if (x < 0) {
		x = 0 - x;
		flag = true;
	}
	int res = 0;
	int p = x;
 
	while (p != 0) {
	    if (res != 0 && Integer.MAX_VALUE / res < 10 && Integer.MAX_VALUE / res > -10)
            return 0;
		int mod = p % 10;
		p = p / 10;
		res = res * 10 + mod;
	}
 
	if (flag) {
		res = 0 - res;
	}
 
	return res;
    }
}
