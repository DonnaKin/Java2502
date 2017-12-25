package textbook;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class RadioCheckboxExam extends Frame{
	public RadioCheckboxExam(){
		super("라디오버튼형");
		Panel p = new Panel();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("여자",g,false);
		Checkbox ra2 = new Checkbox("남자",g,true);
		p.add(ra1);
		p.add(ra2);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioCheckboxExam();
	}
}
