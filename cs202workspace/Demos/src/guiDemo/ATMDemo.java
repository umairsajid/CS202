package guiDemo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;

final class ATMDemo extends JFrame implements ActionListener{
    private static final long serialVersionUID = -8099290319139531183L;
    private final JFormattedTextField textField;
    private final JPanel layerOne;
    private final JPanel layerTwo;
    private final JPanel layerThree;
    private final JPanel layerFour;
    private final JPanel layerFive;
    private final JPanel layerSix;
    private final JButton one;
    private final JButton two;
    private final JButton three;
    private final JButton four;
    private final JButton five;
    private final JButton six;
    private final JButton seven;
    private final JButton eight;
    private final JButton nine;
    private final JButton zero;
    private final JButton okButton;
    private final JButton clearButton;

    private ATMDemo() throws ParseException{
        super("ATM Demo");
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        layerOne = new JPanel();
        layerTwo = new JPanel();
        layerThree = new JPanel();
        layerFour = new JPanel();
        layerFive = new JPanel();
        layerSix = new JPanel();
        //custom color making
        Color crimson = new Color(220, 20, 60); 

        // Add layer one
        textField = new JFormattedTextField(new MaskFormatter("*********"));
        textField.setEditable(false);
        textField.setColumns(7);
        layerOne.add(textField);

        // Add layer two
        one = new JButton(String.valueOf(1));
        two = new JButton(String.valueOf(2));
        three = new JButton(String.valueOf(3));
        layerTwo.add(one);
        layerTwo.add(two);
        layerTwo.add(three);
        layerTwo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 15));

        layerTwo.setBackground(Color.RED);
//      //one.setBackground(Color.GREEN);
        

        // Add layer three
        four = new JButton(String.valueOf(4));
        five = new JButton(String.valueOf(5));
        six = new JButton(String.valueOf(6));
        layerThree.add(four);
        layerThree.add(five);
        layerThree.add(six);

        // Add layer four
        seven = new JButton(String.valueOf(7));
        eight = new JButton(String.valueOf(8));
        nine = new JButton(String.valueOf(9));
        layerFour.add(seven);
        layerFour.add(eight);
        layerFour.add(nine);

        // Add layer five
        zero = new JButton(String.valueOf(0));
        layerFive.add(zero);

        // Add layer six
        okButton = new JButton("OK");
        clearButton = new JButton("Clear");
        layerSix.add(okButton);
        layerSix.add(clearButton);
        okButton.setBackground(Color.GREEN);
        clearButton.setBackground(crimson);
        clearButton.setForeground(Color.WHITE);
    }

    @Override
    public final void actionPerformed(final ActionEvent e) {
        final JButton source = (JButton)e.getSource();
        if(source.equals(okButton)){
            if(textField.getValue() != null && textField.getValue().toString().length() != 9){
                JOptionPane.showMessageDialog(this, "Invalid PIN length - must be 9 digits long.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Valid PIN length.", "Valid", JOptionPane.INFORMATION_MESSAGE);
            }
            clearButton.doClick();
        }
        else if(source.equals(clearButton)){
            textField.setValue(null);
            clearButton.setBackground(Color.BLACK);
        }
        else{
            final StringBuilder sb = new StringBuilder();
            if(textField.getValue() != null){
                for(char c: textField.getValue().toString().toCharArray()){
                    sb.append(c);
                }
            }

            if(sb.length() != 9){
                sb.append(source.getText());
                textField.setValue(sb);
            }
        }
    }

    static final ATMDemo newInstance() throws ParseException{
        final ATMDemo demo = new ATMDemo();
        demo.one.addActionListener(demo);
        demo.two.addActionListener(demo);
        demo.three.addActionListener(demo);
        demo.four.addActionListener(demo);
        demo.five.addActionListener(demo);
        demo.six.addActionListener(demo);
        demo.seven.addActionListener(demo);
        demo.eight.addActionListener(demo);
        demo.nine.addActionListener(demo);
        demo.zero.addActionListener(demo);
        demo.okButton.addActionListener(demo);
        demo.clearButton.addActionListener(demo);
        demo.add(demo.layerOne);
        demo.add(demo.layerTwo);
        demo.add(demo.layerThree);
        demo.add(demo.layerFour);
        demo.add(demo.layerFive);
        demo.add(demo.layerSix);
        demo.setSize(225, 300);
        demo.setLocationRelativeTo(null);
        return demo;
    }

    public static final void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                try {
                    ATMDemo.newInstance().setVisible(true);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
