package sungjukchury;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //인터페이스=>actionPerformed(하고 싶은 동작 선언)
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
		JFrame window=new JFrame("파일 뷰어");//윈도우 생성 , 제목 표시
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우를 close할 경우: system exit
		window.setContentPane(new ViewFileGUI());
		//속성 초기화: 일반적으로 생성자메서드와 함께 사용
		window.pack();//자동으로 윈도우 사이즈 셋팅 혹은 가장 최근의 사이즈로
		window.setVisible(true);//화면에 보이기
	}
}//end of main

class ViewFileGUI extends JPanel{
	JTextArea ta=new JTextArea(25,80);//매개변수는 사이즈
	JFileChooser fc=new JFileChooser();//파일 추적 창 (클래스로 지원을 해줌)
	
	public ViewFileGUI(){
		JButton openButton=new JButton("열기");
		openButton.addActionListener((ActionListener)new OpenAction());
		//버튼에 이벤트 리스너 달기(매개는 무조건 클래스로)
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		//패널에 버튼과 텍스트 에어리어의 배치와 모양잡기 (세로로(y축))
		this.add(openButton);
		this.add(new JScrollPane(ta));
	}//end of ViewFileGUI constructor0
	class OpenAction implements ActionListener{
		public void actionPerformed(ActionEvent ae) {//open file 명령창 열기 
			int retval=fc.showOpenDialog(ViewFileGUI.this);
			if(retval==JFileChooser.APPROVE_OPTION){// 선택여부 boolean값 리턴
				File file=fc.getSelectedFile(); // 중복 선택을 허용하면서 선택값을 리턴
				try{
					Scanner scan=new Scanner(file); //파일도 스캔가능
					String line;
					ta.setText("");
					while(scan.hasNextLine()){
						line =scan.nextLine();
						ta.append(line); //텍스트 어리어에 보여주기
						ta.append("\n");
					}
				}catch(FileNotFoundException e){
					System.out.println("파일 없음");
				}
			}
		}
	}//end of OpenAction
}//end of ViewFileGUI

