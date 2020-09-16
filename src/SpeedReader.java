public class SpeedReader {

    public static void main(String[] args) {
        for (;;) {
            for (In file = new In("speed.txt"); !file.isEmpty(); ) {
                String s = file.readLine();
                for  (int i = 0; i < s.length(); ++i) {
                    String w;
                    for (w = ""; i < s.length() && s.charAt(i) != ' '; ++i) {
                        w = w + s.charAt(i);
                    }
                    StdDraw.clear();
                    StdDraw.text(0.5, 0.5, w);
                    StdDraw.pause(300);
                }
            }
            StdDraw.pause(500);
        }
    }
}
