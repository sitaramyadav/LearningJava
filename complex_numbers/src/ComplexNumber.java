public class ComplexNumber{
	private int x,y;
	public ComplexNumber(int x, int y){
		this.x = x;
		this.y = y;
	}
	public ComplexNumber add(ComplexNumber other){
		return new ComplexNumber(x+other.x,y+other.y);
	}
	public ComplexNumber subtract(ComplexNumber other){
		return new ComplexNumber(x-other.x,y-other.y);
	}
	public boolean equals(Object other){
		if(this == other) return true;
		if(! (other instanceof ComplexNumber)) return false;
		return equals((ComplexNumber)other);
	}
	private boolean equals(ComplexNumber another){
		return (x == another.x && y == another.y);	
	}
	public String toString(){
		boolean hasReal = (x!=0);
		boolean hasImaginary = (y!=0);
		if(!hasReal && !hasImaginary) return "0";
		String real = "";
		if(hasReal) real += x;
		String sign = ( hasReal && (y>0) ? "+" : "" );
		String imaginary = sign+ y +"i";
		if(y==1) imaginary = sign+"i";
		if(y==-1) imaginary = "-i";
		return real + (hasImaginary?imaginary:"");
	}
}