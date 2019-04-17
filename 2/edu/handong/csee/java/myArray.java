import java.util.* ;

public class myArray{



	public static void main(String[] args){

	
		int [] array ;
		String [][] names = { {"MR","MRS","MSS"},{"google","firefox","safari"}};

		array = new int[10] ;

		for(int i =0 ; i<10 ; i++){

			array[i] = (int)(Math.random() * Integer.parseInt(args[0])) ;
			System.out.println(array[i]);
		}

		System.out.println(names[0][1]+" "+names[1][2]);
		System.out.println(names.length+""+names[0].length);
//		System.out.println(Arrays.binarySearch(array,5));
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array,5));

		for( int ele : array){
			System.out.println(ele);
		}
	}


}
