public class School
{
	String sname;//ѧУ����
	String dz;//ѧУ��ַ
	String zd;//ռ�����
	int rs;//��У����
	public School(String sname,String dz,String zd,int rs){
		this.sname=sname;
		this.dz=dz;
		this.zd=zd;
		this.rs=rs;
	}
	public void dc(){
		System.out.println("ѧУ����:"+sname+"\tѧУ��ַ:"+dz+"\tռ�����:"+zd+"\t��У����:"+rs);
	}
}