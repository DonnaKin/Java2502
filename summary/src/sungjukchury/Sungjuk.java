package sungjukchury;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
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

import sungjukchury.ViewFileGUI.OpenAction;

interface Methode{
	public void mangement(FileReader fr, FileWriter br)throws Exception;	
	public void input_data(FileReader fr) throws Exception;
	public void sort();
	public void process();
	public void output_data(FileWriter fw)throws Exception;
}

class School implements Methode{
	int length;
	ArrayList<String> major;
	ArrayList<String> number;
	ArrayList<String> name;
	ArrayList<Integer> kor;
	ArrayList<Integer> math;
	ArrayList<Integer> java;
	ArrayList<Integer> c;
	int suchar[] = {1,1,1,1,1};
	double sum[];
	double avg[];
	
	public void mangement(FileReader fr, FileWriter fw) throws Exception{
		input_data(fr);
		sort();
		process();
		output_data(fw);
	}// end of management()
	
	public void input_data(FileReader fr) throws Exception{
		BufferedReader br = new BufferedReader(fr);
		String csvStr = "";
		String tmpStr = "";
		do{
			tmpStr = br.readLine();
			if(tmpStr !=null){
				csvStr += tmpStr+"\t";
			}
		}while(tmpStr != null);
		StringTokenizer parse = new StringTokenizer(csvStr,"\t");
		length = parse.countTokens()/7;
		major = new ArrayList<String>();
		number = new ArrayList<String>();
		name = new ArrayList<String>();
		kor = new ArrayList<Integer>();
		math = new ArrayList<Integer>();
		java = new ArrayList<Integer>();
		c = new ArrayList<Integer>();
		sum = new double[length];
		avg = new double [length];
			for(int i=0; i<length;i++){
				major.add(parse.nextToken());
				number.add(parse.nextToken());
				name.add(parse.nextToken());
				kor.add(Integer.valueOf(parse.nextToken()).intValue());
				math.add(Integer.valueOf(parse.nextToken()).intValue());
				java.add(Integer.valueOf(parse.nextToken()).intValue());
				c.add(Integer.valueOf(parse.nextToken()).intValue());
				sum[i] = (kor.get(i)+math.get(i)+java.get(i)+c.get(i));
				avg[i] = sum[i]/4.0;
			}//end of for
	}//end of input_data()
	
	public void sort(){
		Arrays.sort(sum);
	    double temp;
		for (int i = 0; i < sum.length / 2; i++) {
		    if(major.get(i).equals("솔")){
		      temp = sum[i];
		      sum[i] = sum[(sum.length - 1) - i];
		      sum[(sum.length - 1) - i] = temp;
		    }//end of if
	    }//end of for
		for (int i = 0; i < sum.length / 2; i++) {
		    if(major.get(i).equals("인")){
		      temp = sum[i];
		      sum[i] = sum[(sum.length - 1) - i];
		      sum[(sum.length - 1) - i] = temp;
		    }//end of if
	    }//end of for
	}//end of sort()
	
	public void process(){
		for(int i=0;i<(sum).length;i++){
			for(int j=i+1;j<(sum).length;j++){				
				if(major.get(i).equals("솔") && major.get(j).equals("솔")){
					if(sum[i] < sum[j]) suchar[i]++;
					else if(sum[i] == sum[j])suchar[i] = suchar[j];
					else suchar[j]++;
				}else if(major.get(i).equals("인") && major.get(j).equals("인")){
					if(sum[i] < sum[j]) suchar[i]++;
					else if(sum[i] == sum[j])suchar[i] = suchar[j];
					else suchar[j]++;
				}
			}// end of little for
		}//end of big for
	}// end of process()
	
	public void output_data(FileWriter fw)throws Exception{
		for(int j=0;j<length;j++){
			if(major.get(j).equals("솔")) fw.write(major.get(j)+"\t"+number.get(j)+"\t"+name.get(j)+"\t"+(kor.get(j)).toString()+"\t"+(math.get(j)).toString()+"\t"+(java.get(j)).toString()+"\t"+(c.get(j)).toString()+"\t"+sum[j]+"\t"+avg[j]+"\t"+suchar[j]+"\r\n");
		}//end of for
		for(int j=0;j<length;j++){
			if(major.get(j).equals("인")) fw.write(major.get(j)+"\t"+number.get(j)+"\t"+name.get(j)+"\t"+(kor.get(j)).toString()+"\t"+(math.get(j)).toString()+"\t"+(java.get(j)).toString()+"\t"+(c.get(j)).toString()+"\t"+sum[j]+"\t"+avg[j]+"\t"+suchar[j]+"\r\n");
		}//end of for
		fw.flush();
	} // end of output_data()

}// end of class

class ViewFileGUI extends JPanel{
	JTextArea ta=new JTextArea(25,80);//매개변수는 사이즈
	//JFileChooser fc=new JFileChooser();//파일 추적 창 (클래스로 지원을 해줌)
	
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
			//int retval=fc.showOpenDialog(ViewFileGUI.this);
			//if(retval==JFileChooser.APPROVE_OPTION){// 선택여부 boolean값 리턴
			try{
				File file=new File("sunjukResult.txt"); // 중복 선택을 허용하면서 선택값을 리턴
				Scanner scan=new Scanner(file); //파일도 스캔가능
				String line;
				ta.setText("");
				while((line = scan.nextLine()) != null){
					line =scan.nextLine();
					ta.append(line); //텍스트 어리어에 보여주기
					ta.append("\n");
				}
			}//end of if
		}//end of actionPerformed
	}//end of OpenAction
}//end of ViewFileGUI
public class Sungjuk {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("sungjuk.txt");
		FileWriter fw = new FileWriter("sungjukResult.txt");
		School s1 = new School();
		s1.mangement(fr,fw);
		JFrame window=new JFrame("파일 뷰어");//윈도우 생성 , 제목 표시
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우를 close할 경우: system exit
		window.setContentPane(new ViewFileGUI());
		//속성 초기화: 일반적으로 생성자메서드와 함께 사용
		window.pack();//자동으로 윈도우 사이즈 셋팅 혹은 가장 최근의 사이즈로
		window.setVisible(true);//화면에 보이기
	}
}