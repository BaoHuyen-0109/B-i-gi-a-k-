package Main;

import java.util.List;
import java.util.Scanner;

public class QLCBView {
    private Scanner scanner;

    public QLCBView() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\n===== Quản lý cán bộ =====");
        System.out.println("1. Thêm mới cán bộ");
        System.out.println("2. Tìm kiếm theo họ tên");
        System.out.println("3. Hiển thị danh sách cán bộ");
        System.out.println("4. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public CanBo promptAddNewCanBo() {
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập loại cán bộ (1. Công nhân, 2. Kỹ sư, 3. Nhân viên): ");
        int loaiCanBo = Integer.parseInt(scanner.nextLine());

        switch (loaiCanBo) {
            case 1:
                System.out.print("Nhập bậc công nhân (1-10): ");
                int bac = Integer.parseInt(scanner.nextLine());
                return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
            case 2:
                System.out.print("Nhập ngành đào tạo: ");
                String nganhDaoTao = scanner.nextLine();
                return new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
            case 3:
                System.out.print("Nhập công việc: ");
                String congViec = scanner.nextLine();
                return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
            default:
                System.out.println("Lựa chọn không hợp lệ");
                return null;
        }
    }

    public String promptSearchByHoTen() {
        System.out.print("Nhập họ tên cần tìm kiếm: ");
        return scanner.nextLine();
    }

    public void displayAllCanBo(List<CanBo> danhSachCanBo) {
        System.out.println("Danh sách cán bộ:");
        for (CanBo canBo : danhSachCanBo) {
            System.out.println(canBo.toString());
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
