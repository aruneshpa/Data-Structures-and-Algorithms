/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */
class Solution {
   HashSet<String> set = new HashSet<>();

   public void cleanRoom(Robot robot) {
      helper(robot, 0, 0, 90);
   }

   public void helper(Robot robot, int i, int j, int d){
      String tmp = i + "->" + j;
      if (set.contains(tmp)) {
         return;
      }

      robot.clean();
      set.add(tmp);

      for (int r = 0; r < 4; r++) {
         int x = i, y = j;
         if (robot.move()) {
            if (d == 90) {
               x -= 1;
            } else if (d == 180) {
               y -= 1;
            } else if (d == 270) {
               x += 1;
            } else {
               y += 1;
            }
            helper(robot, x, y, d);
            robot.turnLeft();
            robot.turnLeft();
            robot.move();
            robot.turnRight();
            robot.turnRight();
         }
         robot.turnRight();
         d += 90;
         d %= 360;
      }
   }
}
