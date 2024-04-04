package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QLCBModel {
    private List<CanBo> danhSachCanBo;
    private static final String FILE_PATH = "C:\\Users\\Dell\\eclipse-workspace\\QLCB_MVC\\canbo_data.txt";

    public QLCBModel() {
        danhSachCanBo = new ArrayList<>();
        loadFromFile();
    }

    public void addCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
        saveToFile();
    }

    public CanBo searchByHoTen(String hoTen) {
        return danhSachCanBo.stream()
                .filter(canBo -> canBo.getHoTen().equalsIgnoreCase(hoTen))
                .findFirst()
                .orElse(null);
    }

    public List<CanBo> getAllCanBo() {
        return danhSachCanBo;
    }

    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            danhSachCanBo = (List<CanBo>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Không thể tải dữ liệu từ file. Sẽ sử dụng danh sách mới.");
        }
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(danhSachCanBo);
        } catch (IOException e) {
            System.out.println("Không thể lưu dữ liệu vào file.");
        }
    }
}
