import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    static JFrame frame = new JFrame("���˵�");
    public static boolean printable = true;
    public static void main(String[] args) {

        frame.setContentPane(new MainMenu());
        frame.pack();
        frame.setLocation(500,200);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
    public MainMenu() {
        this.setLayout(new GridLayout(4, 4));
        this.label = new JLabel("̹�˴�ս");
        this.label.setFont(new Font("����", Font.PLAIN, 32));
        this.button1=new JButton("��ʼ��Ϸ");
        this.button1.setHorizontalTextPosition(2);
        this.button1.setVerticalTextPosition(3);
        this.button1.setFont(new Font("����", Font.PLAIN, 32));
        this.button1.setForeground(Color.black);


        this.button2=new JButton("��Ϸ����");

        this.button2.setSize(10,10);
        this.button2.setFont(new Font("����", Font.PLAIN, 32));
        this.button2.setHorizontalTextPosition(2);
        this.button2.setVerticalTextPosition(3);
        this.button2.setForeground(Color.black);

        this.button3=new JButton("�˳���Ϸ");
        this.button3.setFont(new Font("����", Font.PLAIN, 32));
        this.button3.setSize(10,10);
        this.button3.setHorizontalTextPosition(2);
        this.button3.setVerticalTextPosition(3);
        this.button3.setForeground(Color.black);

        JPanel panel = new JPanel();

        panel.add(this.label);
        panel.setOpaque(false);
        this.add(panel);
        this.add(this.button1);
        this.add(this.button2);
        this.add(this.button3);
        this.button1.addActionListener(new MainMenu.Button1Listener());
        this.button2.addActionListener(new MainMenu.Button2Listener());
        this.button3.addActionListener(new MainMenu.Button3Listener());
    }

    class Button1Listener implements ActionListener {
        Button1Listener() {
        }

        public void actionPerformed(ActionEvent event) {
            new TankClient();
            frame.setVisible(false);

        }

    }

    class Button2Listener implements ActionListener {
        Button2Listener() {
        }

        public void actionPerformed(ActionEvent event) {
            printable = false;
            JOptionPane.showMessageDialog(null, "�á� �� �� �����Ʒ���F���̷��䣬R���¿�ʼ��",
                    "��Ϸ����", JOptionPane.INFORMATION_MESSAGE);
            printable = true;
        }

    }

    class Button3Listener implements ActionListener {
        Button3Listener() {
        }

        public void actionPerformed(ActionEvent event) {
            printable = false;
            Object[] options = {"ȷ��", "ȡ��"};
            int response = JOptionPane.showOptionDialog(MainMenu.this, "��ȷ��Ҫ�˳���", "",
                    JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);
            if (response == 0) {
                System.out.println("�˳�");
                System.exit(0);
            } else {
                printable = true;

            }
        }

    }

}