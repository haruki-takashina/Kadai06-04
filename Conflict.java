import java.util.Random;
public class Conflict{
	public static void main(String[] args){
		for(int i=30;i>0;i--){
		System.out.println(i);
		}
			for(int i = 0; i<10 ; i++){
			int ra = new Random().nextInt(101);
			System.out.println(ra);
	}
}

