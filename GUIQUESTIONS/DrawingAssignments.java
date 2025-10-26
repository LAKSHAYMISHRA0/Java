import java.awt.*;
import java.awt.event.*;
public class DrawingAssignments extends Frame implements MouseMotionListener {
    private int x_axis,y_axis;
    public DrawingAssignments(){
        setSize(400,400);
        setVisible(true);
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e){
                Window w=e.getWindow();
                w.dispose();
                System.exit(0);
            }
        });
    }
    public void mouseMoved(MouseEvent e1){
        Graphics g = getGraphics();
        x_axis=e1.getX();
        y_axis=e1.getY();

        Insets insets=getInsets();
        int left=insets.left;
        int top=insets.top;
        int right=getWidth()-insets.right;
        int bottom=getHeight()-insets.bottom;

        g.setColor(Color.red);
        g.drawLine(left,top, x_axis, y_axis);
        g.setColor(Color.blue);
        g.drawLine(right-1,top, x_axis, y_axis);
        g.setColor(Color.green);
        g.drawLine(left,bottom, x_axis, y_axis);
        g.setColor(Color.yellow);
        g.drawLine(right-1,bottom-1,x_axis, y_axis);
    }
    /*public void paint(Graphics g){
        Insets insets=getInsets();
        int left=insets.left;
        int top=insets.top;
        int right=getWidth()-insets.right;
        int bottom=getHeight()-insets.bottom;

        g.setColor(Color.red);
        g.drawLine(left,top, x_axis, y_axis);
        g.setColor(Color.blue);
        g.drawLine(right,top, x_axis, y_axis);
        g.setColor(Color.green);
        g.drawLine(left,bottom, x_axis, y_axis);
        g.setColor(Color.yellow);
        g.drawLine(right,bottom,x_axis, y_axis);
    }*/
    public void mouseDragged(MouseEvent e){
    }
    public static void main(String[] args){
        DrawingAssignments d=new DrawingAssignments();
        System.out.println("hello!!");
    }
    
}
