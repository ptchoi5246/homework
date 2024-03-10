package hw0308;

public abstract class Bonsa {

	public abstract void menuPrice(); //추상 메소드
	private String store;
	private String kimchi;
	private String boodae;
	private String bibimbap;
	private String soondaegook;
	private String rice;
	
	//Getter, Setter
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getKimchi() {
		return kimchi;
	}
	public void setKimchi(String kimchi) {
		this.kimchi = kimchi;
	}
	public String getBoodae() {
		return boodae;
	}
	public void setBoodae(String boodae) {
		this.boodae = boodae;
	}
	public String getBibimbap() {
		return bibimbap;
	}
	public void setBibimbap(String bibimbap) {
		this.bibimbap = bibimbap;
	}
	public String getSoondaegook() {
		return soondaegook;
	}
	public void setSoondaegook(String soondaegook) {
		this.soondaegook = soondaegook;
	}
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	
	
	
}
