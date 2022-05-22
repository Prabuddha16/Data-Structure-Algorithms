package Array.Array.ZigZagArray;

public class Main {
        void zigZag(int[] arr, int n) {
            boolean flag = true;

            int temp =0;

            for (int i=0; i<=arr.length-2; i++)
            {
                if (flag)
                {
                    if (arr[i] > arr[i+1])
                    {
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }

                }
                else
                {
                    if (arr[i] < arr[i+1])
                    {
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
                flag = !flag;
            }
        }
}
