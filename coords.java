import java.awt.*;
import java.io.*;

public class coords {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        double x = 0;
        double y = 0;
        while (true) {
            Point point = MouseInfo.getPointerInfo().getLocation();
            if (x != point.getX() || y != point.getY()) {
                x = point.getX();
                y = point.getY();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(x + " " + y);
            }
        }
    }
}