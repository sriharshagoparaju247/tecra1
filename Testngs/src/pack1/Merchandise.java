package pack1;

public class Merchandise {

	public static void main(String[] args) {
		
		
		String name= "Sri"+","+"Harsha"+","+"Goparaju";
		
		
		String name1[]=name.split(",");
		String a1=name1[0];
		String a2=name1[1];
		String a3=name1[2];
		
		String name2= "Harsha"+","+"Goparaju"+","+"Sri";
		
		
		if(name2.contains(a1)){
			
			if(name2.contains(a2)){
				
				if(name2.contains(a3)){
			
			System.out.println("containsssss");}}
		}
		else{
			System.out.println("not");
		}
		
		System.out.println(name);
		System.out.println(name2);

	}

}
