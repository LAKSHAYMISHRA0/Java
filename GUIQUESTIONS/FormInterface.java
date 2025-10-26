import java.awt.*;
public class FormInterface {
    public static void main(String[] args) {
        Frame f=new Frame("Form");
        f.setSize(400,300);
        f.setLayout(new BorderLayout());
        f.setBackground(Color.RED);
        // Panel p1=new Panel();
        Label l1=new Label("Q. CAPITAL OF RAJASTHAN ?");
        // p1.add(l1);
        f.add(l1,BorderLayout.NORTH);
        Panel p2=new Panel(new GridLayout(4,1));
        String[] str={"AJMER","JAIPUR","DELHI","JODHPUR"};
        String st[]={"A","B","C","D"};
        CheckboxGroup check=new CheckboxGroup();
        for (int i = 0; i < str.length; i++) {
        Panel p4=new Panel();
        p4.setLayout(new FlowLayout(FlowLayout.LEFT));
        p4.add(new Label(st[i]));
        p4.add(new Checkbox(str[i],check,true));
        p2.add(p4);
        
        }
        
        Panel p3=new Panel();
        Button b1=new Button("Prev");
        Button b2=new Button("Next");
        p3.add(b1);
        p3.add(b2);
        
        f.add(p2,BorderLayout.WEST);
        f.add(p3,BorderLayout.SOUTH);
        f.setVisible(true);
        
    }
}
