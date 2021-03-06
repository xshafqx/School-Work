import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class staffCreateEvent extends javax.swing.JFrame {
    int check = this.check;
    public staffCreateEvent() {
        initComponents();
    }
    static String filepath = directory.file;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        home1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        slots = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();
        Create = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        eventName = new javax.swing.JTextField();
        venue = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        studentPage = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(5);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkGradientFocus(300);
        kGradientPanel2.setkStartColor(new java.awt.Color(113, 199, 172));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home1.setBackground(new java.awt.Color(242, 247, 242));
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Home_64px_2.png"))); // NOI18N
        home1.setToolTipText("Creates a booking");
        home1.setBorderPainted(false);
        home1.setContentAreaFilled(false);
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 70, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Description:");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Event Name:");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, 30));

        slots.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        slots.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                slotsKeyTyped(evt);
            }
        });
        kGradientPanel2.add(slots, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 240, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Venue:");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 50, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Date Of Event:");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 110, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Number of Spaces:");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 30));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "0800 - 1200", "1300 - 1700", "1800 - 2200" }));
        kGradientPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 240, 30));

        Create.setBackground(new java.awt.Color(75, 140, 113));
        Create.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Add_32px.png"))); // NOI18N
        Create.setText("Create");
        Create.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        kGradientPanel2.add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 140, 60));

        desc.setColumns(20);
        desc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 350, 190));

        eventName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kGradientPanel2.add(eventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 240, 30));

        venue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Hall 1", "Hall 2", "Hall 3" }));
        kGradientPanel2.add(venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 240, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        studentPage.setFont(new java.awt.Font("Palace Script MT", 0, 80)); // NOI18N
        studentPage.setForeground(new java.awt.Color(255, 255, 255));
        studentPage.setText("Create Events");
        kGradientPanel2.add(studentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 70));

        date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setText("YYYYMMDD format");
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });
        date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateKeyTyped(evt);
            }
        });
        kGradientPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 240, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Time:");
        kGradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 50, 30));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        try {
            new staffPage().setVisible(true);
        } 
        
        catch (IOException ex) {
            Logger.getLogger(staffCreateEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        staffCreateEvent.this.setVisible(false);
    }//GEN-LAST:event_home1ActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        int checked = 0;
        String id = userID.getID();
        String name = filepath + "/" + eventName.getText() + id + ".txt";
        String nameInfo = eventName.getText();
        String venueInfo = venue.getSelectedItem().toString();
        String dateInfo = date.getText();
        String timeInfo = time.getSelectedItem().toString();
        String slotInfo = slots.getText();
        checkSlots cs = new checkSlots();

        if ((eventName.getText().equals("")) || (eventName.getText().equals(" "))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid event name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (venue.getSelectedItem().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Please select a venue", "Error", JOptionPane.ERROR_MESSAGE);
        }   
        
        //49 = 1.... and so on
        else if ((date.getText().length() != 8) || (date.getText().startsWith("200")) || !(date.getText().startsWith("20")) ||  //check for length and 1990s
                (Integer.valueOf(date.getText().charAt(4)) > 50) || (Integer.valueOf(date.getText().charAt(6)) > 51) ||         //no month starts with '2' and no day starts with '4'
                ((Integer.valueOf(date.getText().charAt(6)) == 51) && (Integer.valueOf(date.getText().charAt(7)) > 50)) ||      //day cannot be higher than 33
                ((Integer.valueOf(date.getText().charAt(4)) == 49) && (Integer.valueOf(date.getText().charAt(5)) > 50)) ||      //month cannot be higher than 12
                ((Integer.valueOf(date.getText().charAt(2)) == 49) && (Integer.valueOf(date.getText().charAt(3)) < 56))) {      //nothing before 2018
            JOptionPane.showMessageDialog(null, "Please enter the date in the correct format\neg. 20181027", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (time.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a time slot", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (slots.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter how many people you are expecting for the event", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else {
            try {
                checked = cs.check(venueInfo, dateInfo, timeInfo);
            } 
             
            catch (IOException ex) {
                     Logger.getLogger(staffCreateEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            if (checked == 1) {
                CreateNewFile c = new CreateNewFile();
                   
                try {
                    check = c.createFileUsingFileClass(name, nameInfo, dateInfo, timeInfo, venueInfo, slotInfo);
                } 
                
                catch (IOException ex) {
                        Logger.getLogger(staffCreateEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Event created!", "Create", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        new staffEvents().setVisible(true);
                    } 
                    
                    catch (IOException ex) {
                        Logger.getLogger(staffCreateEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    staffCreateEvent.this.setVisible(false);
                }
            }

            else if (checked == 2) {
                JOptionPane.showMessageDialog(null, "Venue, date or time conflict", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_CreateActionPerformed

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        date.setForeground(Color.black);
    }//GEN-LAST:event_dateMouseClicked

    private void dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_dateKeyTyped

    private void slotsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slotsKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_slotsKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(staffCreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffCreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffCreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffCreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffCreateEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JTextField date;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField eventName;
    private javax.swing.JButton home1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField slots;
    private javax.swing.JLabel studentPage;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JComboBox<String> venue;
    // End of variables declaration//GEN-END:variables
}

class CreateNewFile extends staffCreateEvent {
    
    public int createFileUsingFileClass(String name,String nameInfo,String dateInfo, String timeInfo,String venueInfo,String slotInfo) throws IOException {
        File file = new File(name);
  
        //Create the file
        if (file.createNewFile()){
            //Write Content
            FileWriter writer = new FileWriter(file);
            String info = dateInfo + "," + timeInfo + "," + nameInfo + "," + venueInfo + "," + slotInfo;
            writer.write(info);
              
            writer.close();
            return 1;
        }
        
        else {
            System.out.println("File already exists.");
            JOptionPane.showMessageDialog(null, "Event already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return 2;
        }   
    }
 
    public static void createFileUsingFileOutputStreamClass(String name) throws IOException {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream(name);
        out.write(data.getBytes());
        out.close();
    }
 
    public static void createFileIn_NIO(String name)  throws IOException {
        String data = "Test data";
        Files.write(Paths.get(name), data.getBytes());
        
    }
}

class checkSlots extends staffCreateEvent {
    String ps,un;
    String [] line;
    static String filename = directory.slotpath;
    
    public int check(String venueInfo, String dateInfo, String timeInfo)throws IOException {
        Scanner input = new Scanner (new File(filename));
        String slotChoose = venueInfo + dateInfo + timeInfo;
        String str;

        while (input.hasNextLine()) {
            str = input.nextLine();
            
            if(slotChoose.equals(str) ) {
                return 2;
            }
        }
        
        storeSlot s = new storeSlot();
        s.store(slotChoose);
        return 1;
    }
}

class storeSlot {
    static StringBuffer stringBufferOfData = new StringBuffer();
    static String filename = directory.slotpath;

    public static void store(String nw) throws IOException {
        boolean fileRead = readFile();//call the method to read the file with the files name
        
        if (fileRead) {//if the read file was successfull
            replacement(nw);//call method to get text to replace, replacement text and output replaced String buffer
            writeToFile();
        } 
    }
    
    private static boolean readFile() {
        Scanner fileToRead;
        
        try {
            fileToRead = new Scanner(new File(filename)); //point the scanner method to a file
            //check if there is a next line and it is not null and then read it in
            
            for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null; ) {
                System.out.println(line);//print each line as its read
                stringBufferOfData.append(line).append("\r\n");//this small line here is to appened all text read in from the file to a string buffer which will be used to edit the contents of the file
            }
            fileToRead.close();//this is used to release the scanner from file
            return true;
        } 
        
        catch (FileNotFoundException ex) {//if the file cannot be found an exception will be thrown
            System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            return false;
        } 
    }
    
    private static void writeToFile() {
        try {
            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
            bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
            stringBufferOfData.delete(0, stringBufferOfData.length());
            bufwriter.close();//closes the file
        } 
        
        catch (Exception e) {//if an exception occurs
            System.out.println("Error occured while attempting to write to file: " + e.getMessage());
        }
    }
    
    private static void replacement(String nw) throws FileNotFoundException, IOException {
        String replacementText = nw;//read the line to replace
        stringBufferOfData.append(replacementText);//this is where the actual replacement of the text happens
        System.out.println("Here is the new edited text:\n" + stringBufferOfData); //used to debug and check the string was replaced  
    } 
}