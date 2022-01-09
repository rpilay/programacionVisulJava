package ec.com.tecLemas;

public class pregunta8 {

	public static void main(String[] args) {
		Object obj= new int[] {1,2,3};
		int [] arr = (int []) obj;
		for(int i:arr)System.out.println(i + " ");
	}

}
