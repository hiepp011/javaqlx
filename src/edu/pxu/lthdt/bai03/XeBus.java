package edu.pxu.lthdt.bai03;

import java.time.LocalDate;

public class XeBus {
	private String hangXe;
	private int namSX;
	private float dongCo;
	private int soGhe;

	public XeBus(String hangXe, int namSX, float dongCo, int soGhe) {
		super();
		this.setHangXe(hangXe);
		this.setNamSX(namSX);
		this.setDongCo(dongCo);
		this.setSoGhe(soGhe);
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
        if (namSX == 0 || dongCo == 0 || soGhe == 0){
            return "XeBus{" + "hang xe=" + hangXe + '}';
        } else if (namSX == 0) {
            return "XeBus{" + "hang xe = " + hangXe + ", dongco = " + dongCo + ", so ghe =" + soGhe + '}';
        } else if (dongCo == 0) {
            return "XeBus{" + "hang xe = " + hangXe + ", nam san xuat = " + namSX + ", so ghe = " + soGhe + '}';
        } else if (soGhe == 0) {
            return "XeBus{" + "hang xe = " + hangXe + ", nam san xuat = " + namSX + ", dong co = " + dongCo + '}';
        } else {
            return "XeBus{" + "hang xe = " + hangXe + ", nam san xuat = " + namSX + ", dong co = " + dongCo + ", so ghe = " + soGhe + '}';
        }
    }
}
