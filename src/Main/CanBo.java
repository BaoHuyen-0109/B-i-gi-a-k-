package Main;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + ", Tuổi: " + tuoi + ", Giới tính: " + gioiTinh + ", Địa chỉ: " + diaChi;
    }
}
