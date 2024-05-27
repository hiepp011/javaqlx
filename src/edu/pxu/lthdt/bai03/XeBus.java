package edu.pxu.lthdt.bai03;

public class XeBus {
	private String hangXe;
	private int namSX;
	private float dongCo;
	private int soGhe;

	public XeBus(String hangXe, int namSX, float dongCo, int soGhe) {

		this.hangXe = hangXe;
		this.namSX = namSX;
		this.dongCo = dongCo;
		this.soGhe = soGhe;
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

	public int getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(int soGhe) {
		if (soGhe <= 10 || soGhe >= 200) {
			System.out.println("Nhập sai dữ liệu");
		} else {
			this.soGhe = soGhe;
		}

	}

	@Override
	public String toString() {
		return "XeBus [hangXe=" + hangXe + ", namSX=" + namSX + ", dongCo=" + dongCo + ", soGhe=" + soGhe + "]";
	}

}
