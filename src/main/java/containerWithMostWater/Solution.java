package containerWithMostWater;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int x = height.length;
        List<Line> lineList = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            lineList.add(new Line(height[i], i + 1));
        }

        int maxArea = 0;
        for (int i = 0; i < x / 2 + 1; i++) {
            for (int j = i; j < x; j++) {
                int area = getArea(lineList.get(i), lineList.get(j));
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    private int getArea(Line line1, Line line2) {
        return line1.getHeight() > line2.getHeight() ? line2.getHeight() * line2.getDistance(line1) :
                line1.getHeight() * line1.getDistance(line2);
    }

}
class Line {

    private int height;
    private int x;

    public Line(int height, int x) {
        this.height = height;
        this.x = x;
    }

    public int getDistance(Line line) {
        return Math.abs(x - line.x);
    }

    public int getHeight() {
        return height;
    }
}
