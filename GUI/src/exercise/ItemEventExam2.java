package exercise;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;



public class ItemEventExam2 extends JFrame implements ItemListener,ActionListener{
	JPanel p1 = new JPanel();
	JTextArea ta = new JTextArea(7,15);
	JButton b1 = new JButton("닫기");
	JCheckBox[] fruit = new JCheckBox[3]; 
	//awt에서 getItme은 object형태로 날려줌 하지만 JCheckBox는 그렇지 않아 충돌되서 오류남
	
	String[] fr_s = {"키위","사과","딸기"};
	
	public ItemEventExam2(){
		super("액션이벤트");
		for(int i=0;i<fr_s.length;i++){
			fruit[i] = new JCheckBox(fr_s[i]);
			p1.add(fruit[i]);
			fruit[i].addItemListener(this);
		}
		b1.addActionListener(this);
		ta.setEditable(false);
		add(p1,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(b1,BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]){
		new ItemEventExam2();
	}
	public void itemStateChanged(ItemEvent ie){
		if(ie.getStateChange()==ItemEvent.SELECTED){
			if(ie.getItem()==fruit[0]){
			ta.append(fr_s[0]+"가 선택됨\n\n");
			}else if(ie.getItem()==fruit[1]){
				ta.append(fr_s[1]+"가 선택됨\n\n");
			}else if(ie.getItem()==fruit[2]){
				ta.append(fr_s[2]+"가 선택됨\n\n");
			}
		}
		else if(ie.getStateChange()==ItemEvent.DESELECTED){
			if(ie.getItem()==fruit[0]){
				ta.append(fr_s[0]+"가 취소됨\n\n");
				}else if(ie.getItem()==fruit[1]){
					ta.append(fr_s[1]+"가 취소됨\n\n");
				}else if(ie.getItem()==fruit[2]){
					ta.append(fr_s[2]+"가 취소됨\n\n");
				}
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			System.exit(0);
		}
	}
}