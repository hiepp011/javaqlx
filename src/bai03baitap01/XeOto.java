package bai03baitap01;

public class XeOto {
	private String hangXe;
	private int namSX;
	private float dongCo;
	
	
	public XeOto(String hangXe, int namSX, float dongCo) {
		
		this.hangXe = hangXe;
		this.namSX = namSX;
		this.dongCo = dongCo;
	}


	public String getHangXe() {
		return hangXe;
	}


	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}


	public int getNamSX() {
		return namSX;
	}


	public void setNamSX(int namSX) {
		if (namSX <= 1885 || namSX >= 2025) {
			System.out.println("Nhập sai dữ liệu");
		} else {
			this.namSX = namSX;
		}

	}


	public float getDongCo() {
		return dongCo;
	}


	public void setDongCo(float dongCo) {
		this.dongCo = dongCo;
	}


	@Override
	public String toString() {
		return "XeOto [hangXe=" + hangXe + ", namSX=" + namSX + ", dongCo=" + dongCo + "]";
	}
	
	
	
	
}
