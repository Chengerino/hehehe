package geo;


class Student {
	private String studentID;
	private String name;
	private int numOfQuiz=0;
	private int totalScore=0;
	private static double quizContribution;
	
	public Student(){
		this("","");
	}
	public Student(String studentID, String name){
		this.studentID=studentID;
		this.name=name;
		
	}
	
	//setter
	public void setStudentID(String studentID){
		this.studentID=studentID;
	}
	
	public void setName(String name){
		this.name=name;	
	}
	public void setNumOfQuiz(int numOfQuiz){
		this.numOfQuiz=numOfQuiz;
	}
	public void setTotalScore(int totalScore){
		this.totalScore=totalScore;
	}
	public static void setQuizContribution(double quizContribution){
		Student.quizContribution=quizContribution;
	}
	
	//getter
	public String getStudentID(){
		return studentID;
	}
	public String getName(){
		return name;
	}
	public int getNumOfQuiz(){
		return numOfQuiz;
	
	}
	public int getTotalScore(){
		return totalScore;
	}
	public static double getQuizContribution(){
		return quizContribution;
	}
	
	//calculation methods
	public void addQuiz(int score){
		totalScore+=score;//24
		numOfQuiz+=1;//3
	}
	
	public double getAverageScore(){
		return totalScore/numOfQuiz;//24/3=8
	}
	
}

