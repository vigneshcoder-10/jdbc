package jdbc;

class Student extends StudentInfo implements StudentDetails
{
static String grade="";
	public void marks(int tamil, int english, int maths, int science, int social) {
		if((tamil>=35)&&(english>=35)&&(maths>=35)&&(science>=35)&&(social>=35)) {
		          System.out.println("Pass");
		          Grade("pass");
		          grade="pass";
	}
		else 
			{ 
			if((tamil<35&&tamil>=0&&tamil<=100)||(english<35&&english>=0&&english<=100)||(maths<35&&maths>=0&&maths<=100)||(science<35&&science>=0&&science<=100)||(social<35&&social>=0&&social<=100)) {
			
			System.out.println("Fail");
			Grade("Fail");
			grade="fail";
			}
			else {
				if(tamil<0) {
					tamil=0;
				}
				if(english<0) {
					english=0;			
					}
				if(maths<0) {
					maths=0;
				}
				if(science<0) {
					science=0;
				}
				if(social<0) {
					social=0;
				}
				Grade("Fail");
			}
			grade="fail";
			
			}	
	}
	@Override
	public void Grade(String Grade) {
	System.out.println("Grade is"+Grade);	
	
	}
}
