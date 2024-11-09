package csYa_ronny;

public class UniqueSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";  // Example input
        System.out.println("Longest unique substring: " + 
                longestUniqueSubstring(input));
    }

    public static int longestUniqueSubstring(String input) {
        int amount=0;
        int sum=0;
        for (int i=0;i<input.length();i++) {
            for (int j = i+1; j < input.length(); j++) {
                if (input.substring(i, j - 1).contains(String.valueOf(input.charAt(j))))
                    amount++;
            }
            if (amount > sum)
                sum = amount;
            amount = 0;
        }
        return sum;

    }
}