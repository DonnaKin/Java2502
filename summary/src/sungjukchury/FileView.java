package sungjukchury;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //�������̽�=>actionPerformed(�ϰ� ���� ���� ����)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileView {
	public static void main(String[] args){
		JFrame window=new JFrame("���� ���");//������ ���� , ���� ǥ��
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�����츦 close�� ���: system exit
		window.setContentPane(new ViewFileGUI());
		//�Ӽ� �ʱ�ȭ: �Ϲ������� �����ڸ޼���� �Բ� ���
		window.pack();//�ڵ����� ������ ������ ���� Ȥ�� ���� �ֱ��� �������
		window.setVisible(true);//ȭ�鿡 ���̱�
	}
}//end of main

class ViewFileGUI extends JPanel{
	JTextArea ta=new JTextArea(25,80);//�Ű������� ������
	JFileChooser fc=new JFileChooser();//���� ���� â (Ŭ������ ������ ����)
	
	public ViewFileGUI(){
		JButton openButton=new JButton("����");
		openButton.addActionListener((ActionListener)new OpenAction());
		//��ư�� �̺�Ʈ ������ �ޱ�(�Ű��� ������ Ŭ������)
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		//�гο� ��ư�� �ؽ�Ʈ ������� ��ġ�� ������ (���η�(y��))
		this.add(openButton);
		this.add(new JScrollPane(ta));
	}//end of ViewFileGUI constructor0
	class OpenAction implements ActionListener{
		public void actionPerformed(ActionEvent ae) {//open file ����â ���� 
			int retval=fc.showOpenDialog(ViewFileGUI.this);
			if(retval==JFileChooser.APPROVE_OPTION){// ���ÿ��� boolean�� ����
				File file=fc.getSelectedFile(); // �ߺ� ������ ����ϸ鼭 ���ð��� ����
				try{
					Scanner scan=new Scanner(file); //���ϵ� ��ĵ����
					String line;
					ta.setText("");
					while(scan.hasNextLine()){
						line =scan.nextLine();
						ta.append(line); //�ؽ�Ʈ �� �����ֱ�
						ta.append("\n");
					}
				}catch(FileNotFoundException e){
					System.out.println("���� ����");
				}
			}
		}
	}//end of OpenAction
}//end of ViewFileGUI
