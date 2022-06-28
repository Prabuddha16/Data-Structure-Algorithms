package Backtracking_Recursion.Backtracking.ReachDestination;

/*
	Time complexity: O(2 ^ max(x, y))
	Space complexity: O(max(x, y))

	Where (x, y) is the coordinates of the destination point

*/

public class Main {

    // Function to check if destination can be reached or not
    public static boolean reachDestination(int sx, int sy, int dx, int dy) {

        // Destination reached
        if (sx == dx && sy == dy) {
            return true;
        }

        // Base case
        if (sx > dx || sy > dy) {
            return false;
        }

        // Recursive call for two possibilities
        return reachDestination(sx + sy, sy, dx, dy) || reachDestination(sx, sy + sx, dx, dy);
    }
}
