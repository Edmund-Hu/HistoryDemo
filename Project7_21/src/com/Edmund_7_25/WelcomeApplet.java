package com.Edmund_7_25;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeApplet extends Applet implements ActionListener {
	Label lblName;
	TextField txtName;
	TextField txtDisp;
	public void init(){
		lblName=new Label("��������������");
		txtName=new TextField(8);
		txtDisp=new TextField(20);
		add(lblName);
		add(txtName);
		add(txtDisp);
		txtName.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt) {
		txtDisp.setText(txtName.getText()+"��ӭ������Java����");
	}
	public static void main(String[] args) {
		Frame f =new Frame("��ӭ");
		f.addWindowListener (new WindowAdapter() {
		public void windowClosing(WindowEvent evt){
			System.exit(0);
			}
		})
		;
		WelcomeApplet a = new WelcomeApplet();
		a.init();
		f.add("Center",a);
		f.setSize(400,400);
		f.show();
		a.start();
		
	}
	
}
