package GUI;
import javax.swing.*;
public class TampilPanel extends JFrame{
    private JPanel panelku = new JPanel();

    public TampilPanel(){
        super ("membuat panel");
        panelku.setLayout(null);
        panelku.setSize(150,200);
        setSize(230,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(panelku);
        setVisible(true);
    }
    public static void main(String[] args) {
      TampilPanel frameku = new TampilPanel();
    }
}
