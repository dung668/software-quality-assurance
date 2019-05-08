package com.dungnd.model;

import java.util.Date;

public class UserTax {

	private String id, hoTen, chucVu, mst;

	private Integer luong, tienAn, giamTruBanThan, giamTruPhuThuoc, soNguoiPhuThuoc, thuePhaiNop;

	private Date thoiGianChiuThue;

	public UserTax() {
	}

	public UserTax(String id, String hoTen, String chucVu, String mst, Integer luong, Integer tienAn,
			Integer giamTruBanThan, Integer giamTruPhuThuoc, Integer soNguoiPhuThuoc, Integer thuePhaiNop,
			Date thoiGianChiuThue) {
		this.id = id;
		this.hoTen = hoTen;
		this.chucVu = chucVu;
		this.mst = mst;
		this.luong = luong;
		this.tienAn = tienAn;
		this.giamTruBanThan = giamTruBanThan;
		this.giamTruPhuThuoc = giamTruPhuThuoc;
		this.soNguoiPhuThuoc = soNguoiPhuThuoc;
		this.thuePhaiNop = thuePhaiNop;
		this.thoiGianChiuThue = thoiGianChiuThue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getMst() {
		return mst;
	}

	public void setMst(String mst) {
		this.mst = mst;
	}

	public Integer getLuong() {
		return luong;
	}

	public void setLuong(Integer luong) {
		this.luong = luong;
	}

	public Integer getTienAn() {
		return tienAn;
	}

	public void setTienAn(Integer tienAn) {
		this.tienAn = tienAn;
	}

	public Integer getGiamTruBanThan() {
		return giamTruBanThan;
	}

	public void setGiamTruBanThan(Integer giamTruBanThan) {
		this.giamTruBanThan = giamTruBanThan;
	}

	public Integer getGiamTruPhuThuoc() {
		return giamTruPhuThuoc;
	}

	public void setGiamTruPhuThuoc(Integer giamTruPhuThuoc) {
		this.giamTruPhuThuoc = giamTruPhuThuoc;
	}

	public Integer getSoNguoiPhuThuoc() {
		return soNguoiPhuThuoc;
	}

	public void setSoNguoiPhuThuoc(Integer soNguoiPhuThuoc) {
		this.soNguoiPhuThuoc = soNguoiPhuThuoc;
	}

	public Integer getThuePhaiNop() {
		return thuePhaiNop;
	}

	public void setThuePhaiNop(Integer thuePhaiNop) {
		this.thuePhaiNop = thuePhaiNop;
	}

	public Date getThoiGianChiuThue() {
		return thoiGianChiuThue;
	}

	public void setThoiGianChiuThue(Date thoiGianChiuThue) {
		this.thoiGianChiuThue = thoiGianChiuThue;
	}

	@Override
	public String toString() {
		return "f = formatter.parse("+'"'+ thoiGianChiuThue +'"'+");\n"
				+ "test.add(new UserTax(" + '"' + id + '"' + ',' + '"' + hoTen + '"' + ',' + '"' + chucVu + '"' + ',' + '"'
				+ mst + '"' + ',' + luong + ',' + tienAn + ',' + giamTruBanThan + ',' + giamTruPhuThuoc + ','
				+ soNguoiPhuThuoc + ',' + thuePhaiNop + ',' + 'f' + "));";
	}
}
