package NetworkRouting;

public class Network 
{
	private int networkId;
	private String networkName;
	private String networktype;
	public Network(int networkId, String networkName, String networktype) {
		super();
		this.networkId = networkId;
		this.networkName = networkName;
		this.networktype = networktype;
	}
	public int getNetworkId() {
		return networkId;
	}
	public void setNetworkId(int networkId) {
		this.networkId = networkId;
	}
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public String getNetworktype() {
		return networktype;
	}
	public void setNetworktype(String networktype) {
		this.networktype = networktype;
	}
	@Override
	public String toString() {
		return "Network [networkId=" + networkId + ", networkName=" + networkName + ", networktype=" + networktype
				+ "]";
	}
	
	
}
