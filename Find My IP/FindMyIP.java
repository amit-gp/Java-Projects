import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindMyIP
{
    private JFrame frame;
    private JButton button;
    private JTextField field;
    private JLabel label;

    public static void main(String[] args)
    {
        FindMyIP firstSwingExample = new FindMyIP();
        firstSwingExample.Initialise();
    }

    public void Initialise()
    {
        frame = new JFrame("Find My IP");
        frame.setSize(500,300);
        frame.setLayout(null);

        field = new JTextField("Enter Adress here !");
        field.setBounds(50,50,300,30);

        label = new JLabel("Click on the find IP button !");
        label.setBounds(50,100,400,30);

        button = new JButton("Find IP");
        button.setBounds(50,170,100,40);

        frame.add(button);
        frame.add(field);
        frame.add(label);
        frame.setResizable(false);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    String address = field.getText();
                    String IP = java.net.InetAddress.getByName(address).getHostAddress();

                    label.setText("The IP of the address " + address + " is: " + IP);


                }catch (Exception e1)
                {
                    label.setText("Enter a valid address !");
                }
            }
        });


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
