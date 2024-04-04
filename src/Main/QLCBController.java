package Main;

import java.util.List;

public class QLCBController {
    private QLCBModel model;
    private QLCBView view;

    public QLCBController(QLCBModel model, QLCBView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        while (true) {
            view.showMenu();
            int choice = Integer.parseInt(view.promptSearchByHoTen());
            switch (choice) {
                case 1:
                    CanBo newCanBo = view.promptAddNewCanBo();
                    if (newCanBo != null) {
                        model.addCanBo(newCanBo);
                        view.displayMessage("Thêm mới cán bộ thành công.");
                    } else {
                        view.displayMessage("Không thêm mới được cán bộ.");
                    }
                    break;
                case 2:
                    String tenCanTim = view.promptSearchByHoTen();
                    CanBo foundCanBo = model.searchByHoTen(tenCanTim);
                    if (foundCanBo != null) {
                        view.displayMessage(foundCanBo.toString());
                    } else {
                        view.displayMessage("Không tìm thấy cán bộ có tên là " + tenCanTim);
                    }
                    break;
                case 3:
                    List<CanBo> danhSachCanBo = model.getAllCanBo();
                    view.displayAllCanBo(danhSachCanBo);
                    break;
                case 4:
                    view.displayMessage("Đã thoát chương trình.");
                    return;
                default:
                    view.displayMessage("Lựa chọn không hợp lệ.");
            }
        }
    }
}
