package pl.mkluzniak;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage() {

        myButton.setBounds(100, 160, 200, 40);//options for buttons and frame
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == myButton) {

            frame.dispose(); //protect from open many windows when clicked on button
            NewWindow myWindow = new NewWindow(); //create new instance (new window)
        }

    }
}
