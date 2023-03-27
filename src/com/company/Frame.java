package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Frame extends JFrame {
    private Container contentPane;
    Frame(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("그림판");
        setSize(1000,500);
        contentPane = getContentPane();

        createMenu();
        createToolBar();
        setVisible(true);
    }
    void createMenu(){
        JMenuBar mb = new JMenuBar();
        mb.setBorder(BorderFactory.createLineBorder(Color.gray));

        JMenu File_Menu = new JMenu("Menu");
        JMenu Help_Menu = new JMenu("Help");

        mb.add(File_Menu);
        File_Menu.add(new JMenuItem("New"));
        File_Menu.addSeparator();
        File_Menu.add(new JMenuItem("Settings"));
        File_Menu.add(new JMenuItem("Exit"));

        mb.add(Help_Menu);
        Help_Menu.add(new JMenuItem("Help"));
        //서브메뉴
        JMenu qa = new JMenu("Q&A");
        Help_Menu.add(qa);
        qa.add(new JMenuItem("Homepage"));
        qa.add(new JMenuItem("about"));

        setJMenuBar(mb);
    }
    void createToolBar() {
        JToolBar toolBar = new JToolBar();
        toolBar.setBackground(Color.gray);

        /*
        toolBar.add(new JButton("Rectangle"));

        JButton a = new JButton("네모");
        ImageIcon i = new ImageIcon("images/Rec.jpg");
        a.setIcon(i);
        toolBar.add(a);
*/
        ImageIcon icon_L = new ImageIcon("images/Li.jpg");
        Image im_L = icon_L.getImage();
        Image im2_L = im_L.getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon icon2_L = new ImageIcon(im2_L);

        JButton btn_line = new JButton(icon2_L);
        btn_line.setToolTipText("라인");
        toolBar.add(btn_line);
        toolBar.addSeparator();

        ImageIcon icon_C = new ImageIcon("images/Cir.jpg");
        Image im_C = icon_C.getImage();
        Image im2_C = im_C.getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon icon2_C = new ImageIcon(im2_C);

        JButton btn_circle = new JButton(icon2_C);
        btn_circle.setToolTipText("원");
        toolBar.add(btn_circle);
        toolBar.addSeparator();

        ImageIcon icon_P = new ImageIcon("images/Pen.jpg");
        Image im_P = icon_P.getImage();
        Image im2_P = im_P.getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon icon2_P = new ImageIcon(im2_P);

        JButton btn_pencil = new JButton(icon2_P);
        btn_pencil.setToolTipText("연필");
        toolBar.add(btn_pencil);
        toolBar.addSeparator();

        ImageIcon icon_E = new ImageIcon("images/Era.jpg");
        Image im_E = icon_E.getImage();
        Image im2_E = im_E.getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon icon2_E = new ImageIcon(im2_E);

        JButton btn_eraser = new JButton(icon2_E);
        btn_eraser.setToolTipText("지우개");
        toolBar.add(btn_eraser);
        toolBar.addSeparator();

        ImageIcon icon = new ImageIcon("images/Rec.jpg");
        Image im = icon.getImage();
        Image im2 = im.getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(im2);

        JButton btn_rect = new JButton(icon2);
        btn_rect.setToolTipText("네모");
        toolBar.add(btn_rect);
        toolBar.addSeparator();

        JButton btn_r = new JButton("R");
        btn_r.setBackground(Color.RED);
        toolBar.add(btn_r);

        JButton btn_g = new JButton("G");
        btn_g.setBackground(Color.GREEN);
        toolBar.add(btn_g);

        JButton btn_b = new JButton("B");
        btn_b.setBackground(Color.BLUE);
        toolBar.add(btn_b);

        JLabel thick = new JLabel("두께");
        thick.setFont(new Font("DIALOG",Font.BOLD,20));
        toolBar.add(thick);

        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,30,5);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel pan_slider = new JPanel();
        pan_slider.add(slider);
        toolBar.add(pan_slider);

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addItem("크레용");
        comboBox.addItem("브러쉬");
        toolBar.add(comboBox);

        contentPane.add(toolBar,BorderLayout.NORTH);
    }
}
