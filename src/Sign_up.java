
public class Sign_up extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public Sign_up() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoveBar = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        LastNameTxt = new javax.swing.JTextField();
        NICno = new javax.swing.JLabel();
        NICnoTxt = new javax.swing.JTextField();
        DOB = new javax.swing.JLabel();
        DOBTxt = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        Addresstxt = new javax.swing.JTextField();
        PhoneNo = new javax.swing.JLabel();
        phoneNoTxt = new javax.swing.JTextField();
        Mail = new javax.swing.JLabel();
        MailTxt = new javax.swing.JTextField();
        Save = new javax.swing.JLabel();
        Save0 = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        Clear0 = new javax.swing.JLabel();
        Cancel = new javax.swing.JLabel();
        Cancel0 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Exit0 = new javax.swing.JLabel();
        SignupBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        MoveBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MoveBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveBarMouseDragged(evt);
            }
        });
        MoveBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveBarMousePressed(evt);
            }
        });
        getContentPane().add(MoveBar);
        MoveBar.setBounds(0, 0, 810, 40);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(880, 0, 50, 40);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(830, 0, 50, 40);

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name :");
        getContentPane().add(FirstName);
        FirstName.setBounds(30, 220, 120, 40);

        FirstNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(FirstNameTxt);
        FirstNameTxt.setBounds(150, 220, 300, 40);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name :");
        getContentPane().add(LastName);
        LastName.setBounds(30, 270, 120, 40);

        LastNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(LastNameTxt);
        LastNameTxt.setBounds(150, 270, 300, 40);

        NICno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NICno.setForeground(new java.awt.Color(255, 255, 255));
        NICno.setText("NIC No       :  ");
        getContentPane().add(NICno);
        NICno.setBounds(30, 320, 120, 40);

        NICnoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(NICnoTxt);
        NICnoTxt.setBounds(150, 320, 300, 40);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DOB.setForeground(new java.awt.Color(255, 255, 255));
        DOB.setText("DOB            :");
        getContentPane().add(DOB);
        DOB.setBounds(30, 370, 120, 40);

        DOBTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(DOBTxt);
        DOBTxt.setBounds(150, 370, 300, 40);

        UserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Name :");
        getContentPane().add(UserName);
        UserName.setBounds(30, 420, 120, 40);

        UserNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(UserNameTxt);
        UserNameTxt.setBounds(150, 420, 300, 40);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password  :");
        getContentPane().add(Password);
        Password.setBounds(30, 470, 120, 40);

        PasswordTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PasswordTxt);
        PasswordTxt.setBounds(150, 470, 300, 40);

        Address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address     :");
        getContentPane().add(Address);
        Address.setBounds(490, 210, 120, 40);

        Addresstxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Addresstxt);
        Addresstxt.setBounds(610, 210, 300, 100);

        PhoneNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNo.setText("Phone No :");
        getContentPane().add(PhoneNo);
        PhoneNo.setBounds(490, 320, 120, 40);

        phoneNoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(phoneNoTxt);
        phoneNoTxt.setBounds(610, 320, 300, 40);

        Mail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Mail.setForeground(new java.awt.Color(255, 255, 255));
        Mail.setText("E-Mail       :");
        getContentPane().add(Mail);
        Mail.setBounds(490, 370, 120, 40);

        MailTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(MailTxt);
        MailTxt.setBounds(610, 370, 300, 40);

        Save.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Save);
        Save.setBounds(510, 510, 170, 50);

        Save0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Save0.setText("jLabel11");
        getContentPane().add(Save0);
        Save0.setBounds(510, 510, 170, 50);

        Clear.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Clear);
        Clear.setBounds(720, 510, 170, 50);

        Clear0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Clear0.setText("jLabel11");
        getContentPane().add(Clear0);
        Clear0.setBounds(720, 510, 170, 50);

        Cancel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel.setText("Cancel");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Cancel);
        Cancel.setBounds(510, 580, 170, 50);

        Cancel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Cancel0.setText("jLabel11");
        getContentPane().add(Cancel0);
        Cancel0.setBounds(510, 580, 170, 50);

        Exit.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("Exit");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(720, 580, 170, 50);

        Exit0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Exit0.setText("jLabel11");
        getContentPane().add(Exit0);
        Exit0.setBounds(720, 580, 170, 50);

        SignupBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup.png"))); // NOI18N
        getContentPane().add(SignupBackground);
        SignupBackground.setBounds(0, 0, 930, 647);

        setSize(new java.awt.Dimension(925, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Sign_up.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MoveBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MoveBarMouseDragged

    private void MoveBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveBarMousePressed
    
     
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField Addresstxt;
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel Cancel0;
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Clear0;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel DOB;
    private javax.swing.JTextField DOBTxt;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Exit0;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JLabel Mail;
    private javax.swing.JTextField MailTxt;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel NICno;
    private javax.swing.JTextField NICnoTxt;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JLabel PhoneNo;
    private javax.swing.JLabel Save;
    private javax.swing.JLabel Save0;
    private javax.swing.JLabel SignupBackground;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JTextField phoneNoTxt;
    // End of variables declaration//GEN-END:variables
}
