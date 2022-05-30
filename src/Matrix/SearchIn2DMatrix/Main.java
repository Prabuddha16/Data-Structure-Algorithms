package Matrix.SearchIn2DMatrix;

public class Main {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int i = 0;
            while (i < n && matrix[i].length > 0) {
                if (matrix[i][0] > target) {
                    break;
                } else {
                    int res = binarySearch(matrix[i], 0, matrix[i].length - 1, target);
                    if (res != -1) {
                        return true;
                    }
                }
                i++;
            }
            return false;
        }

        public int binarySearch(int[] arr, int l, int r, int x) {
            if (r >= l) {
                int mid = l + (r - l) / 2;

                if (arr[mid] == x)
                    return mid;

                if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1, x);

                return binarySearch(arr, mid + 1, r, x);
            }

            return -1;
        }
}
