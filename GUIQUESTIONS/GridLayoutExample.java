import java.awt.*;
public class GridLayoutExample {
    public static void main(String[] args) {
        Frame f=new Frame("GridLayout");
        f.setSize(400,300);
        f.setLayout(new GridLayout(2,3));
        Panel p1=new Panel(new GridLayout(2,1));
        Button b1=new Button("1");
        Button b2=new Button("2");
        Panel p2=new Panel(new GridLayout(1, 2));
        Button b3=new Button("3");
        Button b4=new Button("4");
        Panel p3=new Panel(new GridLayout(1,1));
        Button b5=new Button("5");
        Panel p4=new Panel(new GridLayout(1,2));
        Panel subp_4=new Panel(new GridLayout(2,1));
        Button b6=new Button("6");
        Button b7=new Button("7");
        Panel subPanelP4=new Panel(new GridLayout(3,1));
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button b10=new Button("10");
        Panel p5=new Panel(new GridLayout(2,1));
        Button b11=new Button("11");
        Panel subPanelp5=new Panel(new GridLayout(1,2));
        Button b13=new Button("13");
        Button b14=new Button("14"); 
        Panel p6=new Panel(new GridLayout(2,1));
        Button b12=new Button("12");
        Button b15=new Button("15");
        p1.add(b1);
        p1.add(b2);

        p2.add(b3);
        p2.add(b4);
        p3.add(b5);
        subp_4.add(b6);
        subp_4.add(b7);
        subPanelP4.add(b8);
        subPanelP4.add(b9);
        subPanelP4.add(b10);
        p4.add(subp_4);
        p4.add(subPanelP4);
        p5.add(b11);
        subPanelp5.add(b13);
        subPanelp5.add(b14);
        p5.add(subPanelp5);
        p6.add(b12);
        p6.add(b15);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        f.setVisible(true);
    }
}
