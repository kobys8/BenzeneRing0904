/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benzenering0904;
import gpdraw.*;
/**
 *
 * @author kms080
 */
public class BenzeneRing0904 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrawL myL = new DrawL();
        myL.draw();
    }
}

class DrawL {
    private SketchPad myPaper;
    private DrawingTool myPencil;
    public DrawL() {
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
    }
    public void draw() {
        myPencil.drawCircle(75);
        myPencil.up();
        myPencil.forward(115);
        myPencil.down();
        myPencil.turnRight(120);
        myPencil.forward(110);
        myPencil.turnRight(60);
        myPencil.forward(120);
        myPencil.turnRight(55);
        myPencil.forward(115);
        myPencil.turnRight(69);
        myPencil.forward(112);
        myPencil.turnRight(56);
        myPencil.forward(120);
        myPencil.turnRight(57);
        myPencil.forward(110);
    }
}
