import javax.swing.JOptionPane;

public class UI_Joption {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age "));
        JOptionPane.showMessageDialog(null, "Your are "+age+" years old.");
    }
}
