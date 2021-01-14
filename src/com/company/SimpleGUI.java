package com.company;
//подключаем все неодходимые классы
//* - все подклассы из библиотеки
import java.awt.*;
import java.awt.event.*;//события
import javax.swing.*;//для форм

//JFrame класс для форм
public class SimpleGUI extends JFrame {
    //ui - элементы
    private JButton button = new JButton("Press");//кнопки
    private JTextField input = new JTextField("", 5);//техтовое поле
    private JLabel label = new JLabel("Input");
    private JRadioButton radio1 = new JRadioButton("Select 1");
    private JRadioButton radio2 = new JRadioButton("Select 2");
    private JCheckBox check = new JCheckBox("Active");

    //создаем конструктор,
    //который будет вызаваться при создании объекта данного класса
    public SimpleGUI (){
        //обращаеемся к основному конструктору JFrame
        //передаем название формы
        super("Simple Example");
        //задаем положение и размер
        this.setBounds(100, 100, 250, 100);
        //операция при выполнении которой форма будет закрываться
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //контейнер - это наша форма
        Container container = this.getContentPane();
        //ширина, высота и отступы
        container.setLayout(new GridLayout(3,2, 2, 2));
        //собираем форму, последовательно добавляем элементы
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        //установили активное положение radio
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }

    //интерфейс из java.awt.event
    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            //сообщение, которое будет выдаваться пользователю
            String message = "";
            message += "Button was pressed\n";
            //добавляем значение из нашего инпута
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected" + "\n";
            message += "Checbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
