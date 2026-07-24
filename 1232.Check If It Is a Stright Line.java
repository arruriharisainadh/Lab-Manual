class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // Get the first two points
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        
        // Calculate the differences
        int dx = x1 - x0;
        int dy = y1 - y0;
        
        // Check collinearity for all other points
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0], y = coordinates[i][1];
            
            // Cross product should be zero if collinear
            if (dx * (y - y0) != dy * (x - x0)) {
                return false;
            }
        }
        return true;
    }
}
