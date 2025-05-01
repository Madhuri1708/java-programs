class Employee{
		String name;
		double salary;
		void showDetails(){
				System.out.println("name:"+name);
				System.out.println("salary:"+salary);
		}
}
class  Developer extends Employee{
		String prglang;
		void showDeveloperInfo(){
				System.out.println(prglang+"developer");
		}
}
class simpleInheritance{
		public static void main(String[] args){
				Developer dev=new Developer();
				dev.name="amy";
				dev.salary=8000;
				dev.prglang="python";
				dev.showDetails();
				dev.showDeveloperInfo();
		}
}