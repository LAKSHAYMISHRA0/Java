import java.awt.*;
import java.awt.event.*;
public class Line extends Frame implements MouseMotionListener {
    private int x,y;
    public Line(){
        setSize(400,300);
        setVisible(true);
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                Window w=e.getWindow();
                w.dispose();
                System.exit(0);
            }
        });
    }
    public void mouseMoved(MouseEvent e){
        Graphics g=getGraphics();
        x=e.getX();
        y=e.getY();
        g.setColor(Color.red);
        g.drawLine(x, y, x, y);
    }
    public void mouseDragged(MouseEvent e1){}
    public static void main(String[] args) {
        Line l=new Line();
        System.out.println("DONE !!");
    }
}
