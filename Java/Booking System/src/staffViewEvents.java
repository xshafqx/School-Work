import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
 
public class staffViewEvents extends javax.swing.JFrame {
    static String filename = directory.file;
    
    public staffViewEvents() throws IOException {
       initComponents();
       
        try {
           getInfo1();
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(staffPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void getInfo1() throws FileNotFoundException, IOException{
        File folder = new File (filename);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                String fileN = file.getPath();
                BufferedReader br = new BufferedReader(new FileReader(fileN));
                Object[]tableLines = br.lines().toArray();
                DefaultTableModel model = (DefaultTableModel)allEvents.getModel();
                
                for (int i = 0; i < 1; i++) {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
                }
            br.close();    
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        searchEventLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allEvents = new javax.swing.JTable();
        eventPage = new javax.swing.JLabel();
        searchEvent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkBorderRadius(5);
        kGradientPanel3.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkGradientFocus(300);
        kGradientPanel3.setkStartColor(new java.awt.Color(113, 199, 172));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(910, 490));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(910, 490));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        kGradientPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        home.setBackground(new java.awt.Color(242, 247, 242));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Home_64px_2.png"))); // NOI18N
        home.setToolTipText("Creates a booking");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        kGradientPanel3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 70, 50));

        searchEventLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        searchEventLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchEventLabel.setText("Search Events: ");
        kGradientPanel3.add(searchEventLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 120, 20));

        allEvents.setAutoCreateRowSorter(true);
        allEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Event", "Venue", "Slots"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allEvents.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(allEvents);
        if (allEvents.getColumnModel().getColumnCount() > 0) {
            allEvents.getColumnModel().getColumn(0).setPreferredWidth(10);
            allEvents.getColumnModel().getColumn(1).setPreferredWidth(10);
            allEvents.getColumnModel().getColumn(2).setPreferredWidth(130);
            allEvents.getColumnModel().getColumn(3).setPreferredWidth(50);
            allEvents.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        kGradientPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 790, 260));

        eventPage.setFont(new java.awt.Font("Palace Script MT", 0, 80)); // NOI18N
        eventPage.setForeground(new java.awt.Color(255, 255, 255));
        eventPage.setText("Events Page");
        kGradientPanel3.add(eventPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 80));

        searchEvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchEventKeyReleased(evt);
            }
        });
        kGradientPanel3.add(searchEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 156, 670, -1));

        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        try {
            new staffPage().setVisible(true);
        } 
        
        catch (IOException ex) {
            Logger.getLogger(staffViewEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
        staffViewEvents.this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void searchEventKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchEventKeyReleased
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) allEvents.getModel())); 
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchEvent.getText()));
        
        allEvents.setRowSorter(sorter);
    }//GEN-LAST:event_searchEventKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new staffViewEvents().setVisible(true);
                } 
                
                catch (IOException ex) {
                    Logger.getLogger(staffViewEvents.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allEvents;
    private javax.swing.JLabel eventPage;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JTextField searchEvent;
    private javax.swing.JLabel searchEventLabel;
    // End of variables declaration//GEN-END:variables
}