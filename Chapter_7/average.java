public class average {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(Count(responseTimes));
    }

    public static int Count(int[] arr) {
        int count = 0;
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            double avg = (double) sum / i; 
         if (arr[i] > avg) {
                count++;
            }

            sum += arr[i]; 
        }

        return count;
    }
}
