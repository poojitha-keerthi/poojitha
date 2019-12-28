class Student
{
  private int StudentId;
  private String StudentName;
  public Student() {}
  public Student(int StudentId, String StudentName)
{
   this.StudentId=StudentId;
  this.StudentName=StudentName;
 }
  public void setStudentId(int StudentId)
  {
  this.StudentId=StudentId;
 }
  public void setStudentName(String StudentName)
 {
   this.StudentName=StudentName;
 }
public int getStudentId()
{
return StudentId;
}
public String getStudentName()
{
return StudentName;
}
 } 
class Training
{
  int TrainingNo;
    String TrainingName;
	Training t;
	public Training(int TrainingNo, String TrainingName)
	{
	this.TrainingNo=TrainingNo;
	this.TrainingName=TrainingName;
	this.t=t;
	}
	public void setTrainingNo(int TrainingNo)
{
  this.TrainingNo=Trainingno;
 }
   public void setTrainingName(String TrainingName)
 {
   this.TrainingName=TrainingName;
}
 public void setTraining(Training t)
{
 this.t=t;
}
  public int getTrainingNo()
{
  return TrainingNo;
 }
 public String getTrainingName()
 {
   return TrainingName;
}
public Training getTraining()
{
return t;
}
}
class TrainingStudent
{
public static void main(String[] args)
{
Student s=new Student(10,"Suresh",new Student(11,"Kumar"));
System.out.println("TrainingId is" +t.TrainingId());
system.out.println("TrainingName is" +t.TrainingName());
System.out.println("Training Details");
System.out.println("ChildNumberis "+t.get().getChildNumber());
System.out.println("Childname is "+t.getChildName().getChildame());
}
}






 
