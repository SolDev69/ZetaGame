package zeta.zetagame.game;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Main {
    public static void main(String... args) {
        try {
            Display.setDisplayMode(new DisplayMode(640, 480));
            Display.setTitle("A fresh display!");
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            Display.destroy();
            System.exit(1);
        }
        refresh(60);
        Display.destroy();
        System.exit(0);
    }
    public static void refresh(int fps) {
        while (!Display.isCloseRequested()) {
            // While no attempt to close the display is made..
            // Put render code here.
            // Put input handling code here.
            Display.update();
            // Refresh the display and poll input.
            Display.sync(fps);
        }
    }
}
