public class Student 
{
	String name; //����
	int age; //����
	String sex;//�Ա�
	String zy;//רҵ
	String ah;//����

	public Student(String name,int age,String sex,String zy,String ah){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.zy=zy;
		this.ah=ah;
	}
	public void say(){
		System.out.println("������"+name+"\t����:"+age+"\t�Ա�:"+sex+"\tרҵ:"+zy+"\t����:"+ah);
	}
}