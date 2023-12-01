package GUI;
import javax.swing.*;

public class TampilComboBox extends JFrame {
    final static String pilihan[] = {"Pilihan - 1", "Pilihan - 2", "Pilihan - 3"};
    private JPanel panelku = new JPanel();
    private static JComboBox<String> comboBox = new JComboBox<>(pilihan);

    TampilComboBox() {
        super("Membuat ComboBox");
        panelku.setLayout(null);
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        comboBox.setBounds(90, 70, 150, 25);
        panelku.add(comboBox);  // Use add instead of Add
        getContentPane().add(panelku);
        setVisible(true);
    }

    public static void main(String args[]) {
        TampilComboBox frameku = new TampilComboBox();
        comboBox.addItem("Pilihan Tambahan");  // Use addItem instead of AddItem
        comboBox.removeItem("Pilihan - 2");  // Use removeItem instead of RemoveItem
    }
}
