package Main;

public class Main {
    public static void main(String[] args) {
        QLCBModel model = new QLCBModel();
        QLCBView view = new QLCBView();
        QLCBController controller = new QLCBController(model, view);

        controller.processUserInput();
    }
}



