import java.util.Date;

public class main {

	public static void main(String[] args) {
		Order order = new Order (1080, new Date(), Enum.peding_payment);
		
		System.out.println(order);
		
		
		Enum s1 = Enum.delivered;
		Enum s2 = Enum.valueOf("delivered");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
