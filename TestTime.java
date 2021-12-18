public class TestTime {
    public static void main(String[] args) {
        Stopwatch myTime = new Stopwatch();

        myTime.startTime();
        runTask();
        myTime.endTime();
        System.out.println("Task took: " + myTime.getElapsedTime() + "ms");
    }

    // Initializes 100000 elements to random values then sorts them
    public static void runTask() {
        int[] arr = new int[100000];

        // Do something to test time
        for (int x = 0; x < arr.length - 1; x++) {
            arr[x] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;// searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
