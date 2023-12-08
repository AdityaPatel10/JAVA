import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me!");
        Label label = new Label("This is a Label");
        TextField textField = new TextField("Text Field");
        TextArea textArea = new TextArea("Text Area");
        Checkbox checkbox = new Checkbox("Check Me");
        Choice choice = new Choice();
        List list = new List();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);
        frame.add(textField);
        frame.add(textArea);
        frame.add(checkbox);
        frame.add(choice);
        frame.add(list);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Clicked!");
            }
        });
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
