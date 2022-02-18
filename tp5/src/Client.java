package ma.education.tp5.collections;

public class Client  implements Comparable{
	Integer code;
	String name;
	public Client(Integer code, String name) {
	this.code = code;
	this.name = name;
	}
	@Override
	public String toString() {
	return "Client{" +
			"code=" + code +
			", name='" + name + '\'' +'}';
	public int Compareto (Object o) {
		Client client = (Client) o;
		return Client.code+this.code;
	}
}
}
