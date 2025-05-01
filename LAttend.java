import java .io.*;
class LAttend extends Exception{
	LAttend(String str){
			super(str);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter the record submission status as (true/false)");
				String ans=br.readLine();
					boolean recordSubmitted=ans.equalsIgnoreCase("false");
		try{
				System.out.println("enter the held classes");
				double h=Double.parseDouble(br.readLine());
				System.out.println("enter the attended classes");
				double at=Double.parseDouble(br.readLine());
				double p=(at/h)*100;
				System.out.println("percentage is  "+p);
				if(p<75){
						LAttend lat=new LAttend("u are not allowed for java lab exam ");
						throw lat;
				}
		}catch(LAttend la){
				System.out.println(la);
		}
		catch(IOException ie){
				System.out.println(ie);
		}
		finally{
				if(recordSubmitted){
						System.out.println("u are not allowed for lab exam without record");
				}
				else{
					System.out.println("u are allowed for lab exam only if u have the record and attendance");
			}
		}
	}
}