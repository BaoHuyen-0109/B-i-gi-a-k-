package Main;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngành đào tạo: " + nganhDaoTao;
    }
}
