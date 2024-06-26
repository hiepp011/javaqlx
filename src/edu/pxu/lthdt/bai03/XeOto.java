package edu.pxu.lthdt.bai03;

import java.time.LocalDate;

public class XeOto {
	private String hangXe;
	private int namSX;
	private float dongCo;

	public XeOto(String hangXe, int namSX, float dongCo) {
		super();
		this.setHangXe(hangXe);
		this.setNamSX(namSX);
		this.setDongCo(dongCo);
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
		LocalDate ngayHT = LocalDate.now();
		int namHt = ngayHT.getYear();
		if ((namSX < 1885) || (namSX > namHt)) {
			System.out.println("Nam san xuat khong phu hop");
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
