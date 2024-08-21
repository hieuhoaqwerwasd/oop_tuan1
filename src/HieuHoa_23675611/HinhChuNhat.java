package HieuHoa_23675611;

public class HinhChuNhat {
	private double ChieuDai;
	private double ChieuRong;
	public double getChieuDai() {
		return ChieuDai;
	}
	public void setChieuDai(double d) {
		if(d>0) {
		this.ChieuDai = d;
	} else {
		System.out.println("Loi d");
	}
	}
	public double getChieuRong() {
		return ChieuRong;
	}
	public void setChieuRong(double r) {
		if(r<=0) {
			System.out.println("Loi r");
		} else {
		this.ChieuRong = r;
	}
}
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		if(d>0) {
			this.ChieuDai = d;
		} else {
			System.out.println("Loi d");
		}
		if(r<=0) {
			System.out.println("Loi r");
		} else {
		this.ChieuRong = r;
	}
	}
	public double getCV() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getdientich() {
		return getChieuDai()*getChieuRong();
	}
	public String toString() {
		String s="";
		s=s+s.format("|%10s|%10s|%10s|%10s|", getChieuDai(), getChieuRong(), getCV(), getdientich());
		return s;
	}
	
	
	
	
}