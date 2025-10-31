import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SwingMenuBar {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        JMenu m1 = new JMenu("options");
        JMenuItem a1, a2;
        a1 = new JMenuItem(" BCA");
        a2 = new JMenuItem("MCA");
         m1.add(a1);
         m1.add(a2);
         JMenuBar jj = new JMenuBar();
         jj.add(m1);
         j.setJMenuBar(jj);

         j.setSize(300, 500);
         j.setLayout(null);
         j.setVisible(true);

    }
}
