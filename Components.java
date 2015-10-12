public class Components {

	private String format;
	private int x;
	private int y;

	public Components(){

	}

	public Components(String format, int x, int y){
		this.format = format;
		this.x = x;
		this.y = y;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return this.format;
	}

	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return this.x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getY(){
		return this.y;
	}

}

