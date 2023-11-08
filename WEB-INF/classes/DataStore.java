import java.util.HashMap;
import java.util.Map;

/**
 * Example DataStore class that provides access to user data.
 * Pretend this class accesses a database.
 */
public class DataStore {

	//Map of names to Person instances.
	private Map<String, Customer> personMap = new CaseInsensitiveMap();//HashMap<>();
	
	//this class is a singleton and should not be instantiated directly!
	private static DataStore instance = new DataStore();
	public static DataStore getInstance(){
		return instance;
	}

	//private constructor so people know to use the getInstance() function instead
	private DataStore(){
		//dummy data
		/*
		personMap.put("Ada", new Person("Ada", "Ada Lovelace was the first programmer.", 1815));
		personMap.put("Kevin", new Person("Kevin", "Kevin is the author of HappyCoding.io.", 1986));
		personMap.put("Stanley", new Person("Stanley", "Stanley is Kevin's cat.", 2007));
		personMap.put("Eugene", new Person("Eugene", "Eugeen is me.", 1964));
		personMap.put("anita", new Person("anita", "anita here.", 1964));
		*/

		personMap.put("TMA/20001/D", new Customer("TMA/20001/D", "","","","VENKITARAMAN M","TC 7/963/6, MANIPUZHA","CHERUVALLY LANE","MARUTHUMKUZHY, U-250 (1)","kerala,India","9847132462","21","06217268","","K","W","Y"));
		personMap.put("TMA/20004/D", new Customer("TMA/20004/D", "","","","GOPAKUMARANNAIR","TC6/2106/6, PULIYANAMPURAM VALIYAVILLA","NRNO TMA/4221/S, PRA 22B,PTP NAGAR","Thiruvananthapuram","kerala,India","9765432180","311","05822574","","K","W","Y"));
		personMap.put("TMA/20005/D", new Customer("TMA/20005/D", "","","","KUMARADAS","TC6/2106/7, PULIYANAMPURAM VALIYAVILLA","NRNO TMA/4221/S, PRA 22C,PTP NAGAR","Thiruvananthapuram","kerala,India","9999999999","311","05822575","","K","W","Y"));
		personMap.put("TMA/20006/D", new Customer("TMA/20006/D", "","","","SUDHAKARAN","TC 6/664/4, VINAYAKA NAGAR",", ARAPPURA, NRNO,TMA/4106/S, NEAR 41","Thiruvananthapuram","kerala,India","9747964964","366","05821625","","K","W","Y"));

	}
	public Customer getCustomer(String customer) {
		return personMap.get(customer);
	}
	public void putCustomer(Customer customer) {
		personMap.put(customer.getCONS_NO(),customer);
	}

	/*
	public Person getPerson(String name) {
		return personMap.get(name);
	}

	public void putPerson(Person person) {
		personMap.put(person.getName(), person);
	}*/
}