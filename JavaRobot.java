
/* 
    Program developed by Anurag R Simha.
    Description: This is a simple java robot program designed to send an automated message to a recipient over WhatsApp.
    NOTICE: Follow these steps to automate the process on your computer.
            1) Open any browser (Google Chrome for example) with WhatsApp Web ready.
            2) Pin the browser to your taskbar.
            2) Click on a contact you desire to send the message to.
            3) If you are a chrome user, download the extension called "coordinates" to track the points.
               (URL: https://chrome.google.com/webstore/detail/coordinates/bpflbjmbfccblbhlcmlgkajdpoiepmkd)
            4) In the program, make the following amendments:
                a) Change POINT A to the coordinates of your browser's location on the taskbar.
                b) Overwrite the coordinates in POINT B to the location of (WhatsApp web's) the message box (this can be noted 
                from the "coordinates" chrome extension).
                c) Similarly make the changes in POINT C to the coordinates of the "Send Message" arrow button in WhatsApp.
            5) Run the program and have a cuppa.
    Optional (Perilous choice): To spam your recipient, you might want to change the loop variable 'i' to send the same message 
    more than a tenfold. 
*/
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;
import java.util.*;

public class JavaRobot {
    public static void main(String[] args) throws AWTException, InterruptedException {
        // Provide recipient's name
        Scanner scanner = new Scanner(System.in);
        System.out.print("RECEIVER NAME: ");
        String name = scanner.nextLine();
        Robot r = new Robot();

        // POINT A
        r.mouseMove(463, 850);
        // END OF POINT A

        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        String message = "Java robot program KARNATABRIT001 sending a message to " + name
                + ". Current loop variable value = ";
        String msg_ctr = new String();
        String message2 = new String();

        // Message sending algorithm commences here.
        for (int i = 0; i < 10; i++) {
            // POINT B
            r.mouseMove(752, 782);
            // END OF POINT B

            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            msg_ctr = Integer.toString(i + 1);
            message2 = message + msg_ctr + ".";

            for (int k = 0; k < message2.length(); k++) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(message2.charAt(k));
                if (Character.isUpperCase(message2.charAt(k))) {
                    r.keyPress(KeyEvent.VK_SHIFT);
                }
                r.keyPress(keyCode);
                r.keyRelease(keyCode);
                if (Character.isUpperCase(message2.charAt(k))) {
                    r.keyRelease(KeyEvent.VK_SHIFT);
                }
            }

            // POINT C
            r.mouseMove(1476, 782);
            // END OF POINT C

            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(1000);
        }
    }
}
