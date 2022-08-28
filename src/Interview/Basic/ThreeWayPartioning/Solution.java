package Interview.Basic.ThreeWayPartioning;


class Solution{
    //Function to partition the array around the range such
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int n = array.length;
        //Using two pointers which help in finding the index with which
        //the elements need to be swapped if they are not in correct position.
        int start = 0, end = n-1;

        for (int i=0; i<=end;)
        {
            //If current element is smaller than lower range, we swap
            //it with value on next available smallest position.
            if (array[i] < a){
                int temp = array[i];
                array[i] = array[start];
                array[start] = temp;
                i++;
                start++;
            }
            //If current element is greater than higher range, we swap
            //it with value on next available greatest position.
            else if (array[i] > b){
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;
                end--;
            }

            //Else we just move ahead in the array.
            else
                i++;
        }
    }
}