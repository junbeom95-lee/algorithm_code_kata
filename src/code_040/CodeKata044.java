package code_040;

public class CodeKata044 {  //최소직사각형
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];
            int longSize = Math.min(width, height);
            int smallSize = Math.max(width, height);
            if (w < longSize) w = longSize;
            if (h < smallSize) h = smallSize;
        }
        answer = w * h;
        return answer;
    }
}
