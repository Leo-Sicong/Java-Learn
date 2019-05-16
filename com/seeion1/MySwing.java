package com.seeion1;

import javax.swing.*;

public class MySwing {
public static void main(String[] args) {
	JFrame jFrame = new JFrame("简单记事本");
	JButton jb =new JButton("press java");
	jFrame.add(jb);
	jFrame.setSize(1000,400);
	jFrame.setTitle("I love java!");
	//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//jFrame.getContentPane().add(new JScrollPane(new JTextArea()));
	jFrame.setVisible(true);
}
}
