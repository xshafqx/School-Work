import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class studentHomePage extends javax.swing.JFrame {
    static String filepath = directory.file;    
    
    public studentHomePage() throws IOException {
        initComponents();      
         try {
           getSelectedInfo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(studentHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getSelectedInfo() throws FileNotFoundException, IOException{
        File folder = new File (filepath);
        File[] listOfFiles = folder.listFiles();
        String currentLine;
        
        for (File file : listOfFiles) {
            if (file.isFile()) {
                String id = String.valueOf(userID.getID());
                String path = file.getPath();
                Scanner scanner = new Scanner(path);
        
                while (scanner.hasNextLine()){
                    currentLine = scanner.nextLine();
                    System.out.println("directory: " + currentLine);
                    String location = currentLine;
                    String fileN = file.getPath();
                    BufferedReader br = new BufferedReader(new FileReader(fileN));
                    
                    while ((currentLine = br.readLine()) != null) {
                        if (currentLine.contains(id)) {
                            System.out.println("found id: " + currentLine);

                            BufferedReader curbr = new BufferedReader(new FileReader(location));
                            Object[] tableLines = curbr.lines().toArray();
                            DefaultTableModel model = (DefaultTableModel)table.getModel();

                            for (int i = 0; i < 1; i++) {
                                String line = tableLines[i].toString().trim();
                                String[] dataRow = line.split(",");
                                model.addRow(dataRow);
                                break;
                            }
                            curbr.close();
                        }
                    }
                    br.close(); 
                }
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
        jLabel1 = new javax.swing.JLabel();
        studentPage = new javax.swing.JLabel();
        myBookings = new javax.swing.JButton();
        viewEvents = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkBorderRadius(5);
        kGradientPanel3.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkGradientFocus(300);
        kGradientPanel3.setkStartColor(new java.awt.Color(113, 199, 172));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        kGradientPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        studentPage.setFont(new java.awt.Font("Palace Script MT", 0, 80)); // NOI18N
        studentPage.setForeground(new java.awt.Color(255, 255, 255));
        studentPage.setText("Student Page");
        kGradientPanel3.add(studentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 80));

        myBookings.setBackground(new java.awt.Color(75, 140, 113));
        myBookings.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        myBookings.setForeground(new java.awt.Color(255, 255, 255));
        myBookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Checked_64px.png"))); // NOI18N
        myBookings.setText("My Bookings");
        myBookings.setToolTipText("Delete booking");
        myBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBookingsActionPerformed(evt);
            }
        });
        kGradientPanel3.add(myBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 260, 130));

        viewEvents.setBackground(new java.awt.Color(75, 140, 113));
        viewEvents.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        viewEvents.setForeground(new java.awt.Color(255, 255, 255));
        viewEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Eye_64px.png"))); // NOI18N
        viewEvents.setText("View All Events");
        viewEvents.setToolTipText("Delete booking");
        viewEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEventsActionPerformed(evt);
            }
        });
        kGradientPanel3.add(viewEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 260, 130));
        kGradientPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        Logout.setBackground(new java.awt.Color(0, 0, 64));
        Logout.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Shutdown_28px.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        kGradientPanel3.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, 50));

        table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setAlignmentY(1.0F);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(10);
            table.getColumnModel().getColumn(1).setPreferredWidth(10);
            table.getColumnModel().getColumn(2).setPreferredWidth(130);
            table.getColumnModel().getColumn(3).setPreferredWidth(30);
            table.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        kGradientPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 800, 160));

        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        new loginPage().setVisible(true);
        studentHomePage.this.setVisible(false);
    }//GEN-LAST:event_LogoutActionPerformed

    private void viewEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEventsActionPerformed
        try {
            new studentEventsPage().setVisible(true);
        } 
        
        catch (IOException ex) {
            Logger.getLogger(studentHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        studentHomePage.this.setVisible(false);
    }//GEN-LAST:event_viewEventsActionPerformed

    private void myBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBookingsActionPerformed
        try {
            new studentBookings().setVisible(true);
        } 
        
        catch (IOException ex) {
            Logger.getLogger(studentHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        studentHomePage.this.setVisible(false);
    }//GEN-LAST:event_myBookingsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new studentHomePage().setVisible(true);
                } 
                
                catch (IOException ex) {
                    Logger.getLogger(studentHomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JButton myBookings;
    private javax.swing.JLabel studentPage;
    private javax.swing.JTable table;
    private javax.swing.JButton viewEvents;
    // End of variables declaration//GEN-END:variables
}