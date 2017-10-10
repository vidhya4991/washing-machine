package in.bits.bean;

public enum Mode {
	LOW("LOW-0% to 40%"), MEDIUM("MEDIUM-40% to 60%"), HIGH("HIGH-60% to 100%");
	
	private String mode;
	private Mode(String mode){
		this.mode = mode;
	}
}
