package zeta.zetagame.game;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

import static org.lwjgl.opengl.GL11.*;


import org.lwjgl.opengl.DisplayMode;

public class Main {
    public static void main(String[] args) {
        try {
            Display.setDisplayMode(new DisplayMode(640, 480));
            Display.setTitle("A fresh display!");
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            Display.destroy();
            System.exit(1);
        }
        while(!Display.isCloseRequested()) {
            Display.update();
            Display.sync(60);
        }
        Display.destroy();
        System.exit(0);
    }
}
