package p0912;

public class StuScore2 {

	
	StuScore2(){}
	StuScore2(int stuNo2, String name2, int kor2, int eng2, int math2){
		this.stuNo2 = stuNo2;
		this.name2 = name2;
		this.kor2 = kor2;
		this.eng2 = eng2;
		this.math2 = math2;
		this.total2 = kor2+eng2+math2;
		this.avg2 = this.total2 /3.0;
	}
	
	int stuNo2;
	String name2;
	int kor2;
	int eng2;
	int math2;
	int total2;
	double avg2;
}
