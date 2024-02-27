import javax.swing.*;

public class Menu extends JFrame{
    private JCheckBox cbs;
    private JTextField txt;
    private JPanel panel1;
    private JMenuBar menuBar= new JMenuBar();
    private JMenu akceMenu = new JMenu("Akce");
    private JMenuItem pozdrav = new JMenuItem("pozdrav");
    private JMenuItem zaskrtni = new JMenuItem("Zaškrtni");
    private JMenuItem opis = new JMenuItem("opiš");
    public Menu(){
        initMenu();
    }
    private void initMenu(){
        menuBar.add(akceMenu);
        menuBar.add(pozdrav);
        akceMenu.add(zaskrtni);
        akceMenu.add(opis);
        setJMenuBar(menuBar);
        pozdrav.addActionListener(e -> pozdravit());
        zaskrtni.addActionListener(e -> zaskrtnout());
        opis.addActionListener(e -> opisovat());
        txt.setEditable(true);
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

    }
    private void pozdravit(){
        JOptionPane.showMessageDialog(this,"Ahoj!");
    }
    private void zaskrtnout(){
        cbs.setSelected(true);
    }
    private void opisovat(){
        JOptionPane.showMessageDialog(this,txt.getText());
    }

}
