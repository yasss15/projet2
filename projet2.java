import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class projet2 extends JFrame {
    
            static String[] colonne = new String[] {
            "Nom", 
            "Prenom", 
            "Telephone",
            "Déclaration"
        };

        static Object[][] data = new Object[][] {
            {"nom", "prenom", "numero", "declaration" }
        };
                    
            
                
        static JTable table = new JTable (data, colonne);
                        // Créer le modèle de tableau
        static String[] columnNames = {"Nom", "Prénom", "Téléphone", "Réclamation"};
        static DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
    /**
     * @param agrs
     */
    public static void main(String[] agrs) {
                JFrame fenetre = new JFrame("Nouveau projet");

                
                ;


                table.setBounds(30, 240, 500, 100);

                JLabel text1 = new JLabel("Nom");
                text1.setBounds(30,40,200,30);

                JTextField a = new JTextField("");
                a.setBounds(130,40,200,25);

                JLabel text2 = new JLabel("Prénom");
                text2.setBounds(30,80,200,30);

                JTextField b = new JTextField("");
                b.setBounds(130,80,200,25);

                JLabel text3 = new JLabel("Téléphone");
                text3.setBounds(30,120,200,30);

                JTextField c = new JTextField("");
                c.setBounds(130,120,200,25);

                JLabel deroulant = new JLabel("Déclaration : ");
                deroulant.setBounds(30,160,200,30);
                deroulant.setVisible(true);

                String[] choices = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

                final JComboBox<String> cb = new JComboBox<String>(choices);
                cb.setVisible(true);
                cb.setBounds(130,160,200,25);

                JButton btn = new JButton("Cliquez ici");
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ajouterClient();
                    }
                });
        



                btn.setBounds(30, 200,200,30);
                btn.setForeground(Color.BLACK);
                btn.setBackground(Color.WHITE);
                Border line = new LineBorder(Color.BLACK);
                Border margin = new EmptyBorder(5, 15, 5, 15);
                Border compound = new CompoundBorder(line, margin);
                btn.setBorder(compound);
                
                JScrollPane scroll = new JScrollPane(table);
                table.setFillsViewportHeight(true);
                

                fenetre.add(text1);
                fenetre.add(text2);
                fenetre.add(text3);
                fenetre.add(btn);
                fenetre.add(a);
                fenetre.add(b);
                fenetre.add(c);
                fenetre.getContentPane().add(scroll);
                fenetre.add(table);
                fenetre.add(deroulant);
                fenetre.add(cb);



                fenetre.setSize(500, 500);
                fenetre.setLayout(null);
                fenetre.setVisible(true);
                scroll.setVisible(true);
                

    }

    private static void ajouterClient() {
        System.out.println("bien");

        String[] rowData = {"nom", "prenom", "telephone", "reclamation"};

        tableModel.addRow(rowData);

        

    }

    
    
}
