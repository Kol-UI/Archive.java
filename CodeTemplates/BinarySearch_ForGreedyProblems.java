package CodeTemplates;

public class BinarySearch_ForGreedyProblems {
    // Binary search: for greedy problems
    
    // If looking for a minimum
    public int fn(int[] arr) {
        int left = MINIMUM_POSSIBLE_ANSWER;
        int right = MAXIMUM_POSSIBLE_ANSWER;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    
        return left;
    }
    
    public boolean check(int x) {
        // this function is implemented depending on the problem
        return BOOLEAN;
    }


    
    // If looking for a maximum
    public int fn(int[] arr) {
        int left = MINIMUM_POSSIBLE_ANSWER;
        int right = MAXIMUM_POSSIBLE_ANSWER;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        return right;
    }
    
    public boolean check(int x) {
        // this function is implemented depending on the problem
        return BOOLEAN;
    }
}
