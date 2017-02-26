import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator
{
    private JFrame frame;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton resultButton;

    private JTextField firstArgumentField;
    private JTextField secondArgumentField;
    private JTextField resultField;

    private JLabel firstArgumentLabel;
    private JLabel secondArgumentLabel;
    private JLabel resultLabel;

    private int firstArgument = 0;
    private int secondArgument = 0;
    private int result = 0;

    public static void main(String[] args)
    {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.Initialise();
    }

    public void Initialise()
    {
        frame = new JFrame("Simple Calculator");
        frame.setSize(400,700);
        frame.setLayout(null);

        addButton = new JButton("+");
        addButton.setBounds(50,300,50,40);
        subtractButton = new JButton("-");
        subtractButton.setBounds(110,300,50,40);
        multiplyButton = new JButton("*");
        multiplyButton.setBounds(50,350,50,40);
        divideButton = new JButton("/");
        divideButton.setBounds(110,350,50,40);

        firstArgumentField = new JTextField();
        firstArgumentField.setBounds(50,50,300,30);
        secondArgumentField = new JTextField();
        secondArgumentField.setBounds(50,100,300,30);
        resultField = new JTextField();
        resultField.setBounds(50,150,100,30);

        firstArgumentLabel = new JLabel("1st Number:");
        firstArgumentLabel.setBounds(50,25,400,30);
        secondArgumentLabel = new JLabel("2nd Number:");
        secondArgumentLabel.setBounds(50,75,400,30);
        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50,125,400,30);

        frame.add(addButton);
        frame.add(multiplyButton);
        frame.add(subtractButton);
        frame.add(divideButton);
        frame.add(firstArgumentField);
        frame.add(secondArgumentField);
        frame.add(resultField);
        frame.add(firstArgumentLabel);
        frame.add(secondArgumentLabel);
        frame.add(resultLabel);
        frame.setResizable(false);

        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                resultField.setText(Integer.toString(Integer.parseInt(firstArgumentField.getText()) + Integer.parseInt(secondArgumentField.getText())));
            }
        });

        subtractButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                resultField.setText(Integer.toString(Integer.parseInt(firstArgumentField.getText()) - Integer.parseInt(secondArgumentField.getText())));
            }
        });

        multiplyButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                resultField.setText(Integer.toString(Integer.parseInt(firstArgumentField.getText()) * Integer.parseInt(secondArgumentField.getText())));
            }
        });

        divideButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                resultField.setText(Integer.toString(Integer.parseInt(firstArgumentField.getText()) / Integer.parseInt(secondArgumentField.getText())));
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
