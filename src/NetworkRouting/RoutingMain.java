package NetworkRouting;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RoutingMain 
{
	public static void main(String[] args) 
	{
		Comparator<Network> comparator = Comparator.comparing(Network :: getNetworktype);
		PriorityQueue<Network> pq = new PriorityQueue<>(comparator);
		
		pq.add(new Network(1,"vi","2G"));
		pq.add(new Network(2,"jio","5G"));
		pq.add(new Network(3,"Airtel","4G"));
		pq.add(new Network(4,"Vi","3G"));
		pq.add(new Network(7,"Airtel","5G"));
		pq.add(new Network(6,"jio","4G"));
		pq.add(new Network(5,"vi","4G"));
		
		while(!pq.isEmpty())
		{
			Network network = pq.poll(); 
			System.out.println("network Priority based on Network Type :: "+ network);
		}
	}
}
