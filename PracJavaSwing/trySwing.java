import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class trySwing implements ActionListener {

    int count = 0;
    int min = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton increaseButton;
    private JButton decreaseButton;

    public trySwing() {

        JFrame frame = new JFrame();

        increaseButton = new JButton("Touch me");
        decreaseButton = new JButton("Anti perv");
        
        increaseButton.addActionListener(this);
        decreaseButton.addActionListener(this);
        
        label = new JLabel("Pervert count: ");
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(increaseButton);
        panel.add(decreaseButton);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Trap");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main (String[] args){
        new trySwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == increaseButton){
        count++;
        } else if (e.getSource() == decreaseButton) {
        if (count > 0){
            count--; 
            } 
        }
        label.setText("Pervert Count: " + count);  
    }

}