public class Solution {
    public boolean isNumber(String s) {
        int start = 0, end = s.length() -1;
        boolean dot = false, exp = false, digit = false;
        while (start <= end && (s.charAt(start) == ' ')) ++start;
        while (start <= end && (s.charAt(end) == ' ')) --end;
        if (start <= end && (s.charAt(start) == '+' || s.charAt(start) == '-')) ++start;
        if (start > end) return false;
        for ( ; start <= end; ++start) {
            if (Character.isDigit(s.charAt(start))) digit = true;
            else if (s.charAt(start) == 'e' || s.charAt(start) == 'E') {
                if (exp == true || digit == false || start == end) return false;
                exp = true;
            } else if (s.charAt(start) == '.') {
                if (dot == true || exp == true) return false;
                if (digit == false && start == end) return false;
                dot = true;
            } else if (s.charAt(start) == '+' || s.charAt(start) == '-') {
                if (start == end) return false;
                if (s.charAt(start-1) != 'e' && s.charAt(start-1) != 'E') return false;
            } else return false;
        }
        return true;

    }
}
