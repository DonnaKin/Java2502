package homework;

public class Homework {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		int sub=0;
		//sub = a[0]-a[1]-a[2];
		for(int i=0;i<3;i++){
		sub -= a[i];
		System.out.println(sub);
		}
		//System.out.println(sub);
	}

}
