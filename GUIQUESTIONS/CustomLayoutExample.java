import java.awt.*;

public class CustomLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Custom Layout");

        // Set the frame layout to a 2x3 GridLayout
        frame.setLayout(new GridLayout(2, 3));
        frame.setSize(600, 400);

        // Row 1, Column 1: Buttons 1, 2 (vertically arranged)
        Panel panel1 = new Panel(new GridLayout(2, 1));
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        panel1.add(button1);
        panel1.add(button2);

        // Row 1, Column 2: Buttons 3, 4 (horizontally arranged)
        Panel panel2 = new Panel(new GridLayout(1, 2));
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        panel2.add(button3);
        panel2.add(button4);

        // Row 1, Column 3: Button 5 (placed in a GridLayout to match size)
        Panel panel3 = new Panel(new GridLayout(1, 1)); // Single cell layout
        Button button5 = new Button("5");
        panel3.add(button5);

        // Row 2, Column 1: Buttons 6, 7 (vertically) + 8, 9, 10 (vertically to the right)
        Panel panel4 = new Panel(new GridLayout(1, 2)); // Horizontal layout
        Panel subPanel4a = new Panel(new GridLayout(2, 1)); // For buttons 6, 7
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        subPanel4a.add(button6);
        subPanel4a.add(button7);
        Panel subPanel4b = new Panel(new GridLayout(3, 1)); // For buttons 8, 9, 10
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button10 = new Button("10");
        subPanel4b.add(button8);
        subPanel4b.add(button9);
        subPanel4b.add(button10);
        panel4.add(subPanel4a); // Add panel for 6, 7
        panel4.add(subPanel4b); // Add panel for 8, 9, 10

        // Row 2, Column 2: Button 11 (top) + Buttons 13, 14 (horizontally below)
        Panel panel5 = new Panel(new GridLayout(2, 1));
        Button button11 = new Button("11");
        Panel subPanel5 = new Panel(new GridLayout(1, 2)); // For buttons 13, 14
        Button button13 = new Button("13");
        Button button14 = new Button("14");
        subPanel5.add(button13);
        subPanel5.add(button14);
        panel5.add(button11);
        panel5.add(subPanel5);

        // Row 2, Column 3: Buttons 12, 15 (vertically arranged)
        Panel panel6 = new Panel(new GridLayout(2, 1));
        Button button12 = new Button("12");
        Button button15 = new Button("15");
        panel6.add(button12);
        panel6.add(button15);

        // Add all panels to the frame
        frame.add(panel1); // Row 1, Column 1
        frame.add(panel2); // Row 1, Column 2
        frame.add(panel3); // Row 1, Column 3
        frame.add(panel4); // Row 2, Column 1
        frame.add(panel5); // Row 2, Column 2
        frame.add(panel6); // Row 2, Column 3

        frame.setVisible(true);
    }
}