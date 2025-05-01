class MTable{
	public static void main(String[] args){
		MulTable t1=new MulTable(5);
		MulTable t2=new MulTable(3);

		t1.start();
		t2.start();

	}
}
class MulTable extends Thread{
	int num;
	MulTable(int n){
		this.num=n;
}
public void run(){
	for(int i=1;i<=10;i++){
		System.out.println(num+"*"+i+"="+(num*i));
		try{
			Thread.sleep(400);
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
   }
}