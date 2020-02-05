import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menu extends JFrame {
    public Menu(){
        setTitle("JMenuBar");
        JMenuBar menuBar = new JMenuBar();
        ImageIcon icon = new ImageIcon("exit.png");
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem fileClose = new JMenuItem("Close", icon);
        fileClose.setMnemonic(KeyEvent.VK_C);
        fileClose.setToolTipText("Exit application");
        fileClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        file.add(fileClose);
        menuBar.add(file);
        setJMenuBar(menuBar);
        setSize(250,200);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
