package src;

public class main2 {
	public static void main(String[] args) {
		double[] myList = {1.0,6.3,4.3,100.6};
		double total=0;
		double max = myList[0];
		double min = myList[0];
		for (double number:myList) {
			if(max<number){
				max = number;
			}
			total = total + number;
			System.out.println(number);
	}
		
		System.out.println("Toplam =" + total);
		System.out.println("En Büyük =" + max);
		System.out.println("En Küçük =" + min);
  }
}
