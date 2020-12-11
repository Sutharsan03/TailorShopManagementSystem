
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoveBar = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        UserNameTxt1 = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JPasswordField();
        ShowPassword = new javax.swing.JCheckBox();
        Selectcategory = new javax.swing.JLabel();
        CombSelect = new javax.swing.JComboBox<>();
        LogIn = new javax.swing.JLabel();
        LogIn0 = new javax.swing.JLabel();
        SignUp = new javax.swing.JLabel();
        SignUp0 = new javax.swing.JLabel();
        ForgotPassword = new javax.swing.JLabel();
        ForgotPassword0 = new javax.swing.JLabel();
        ResetPassword = new javax.swing.JLabel();
        ResetPassword0 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Exit0 = new javax.swing.JLabel();
        LoginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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
        MoveBar.setBounds(0, 0, 1160, 50);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(1260, 0, 70, 50);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(1190, 0, 70, 50);

        UserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Name :");
        getContentPane().add(UserName);
        UserName.setBounds(30, 240, 150, 40);

        UserNameTxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserNameTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserNameTxt1.setText("      ");
        UserNameTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTxt1ActionPerformed(evt);
            }
        });
        getContentPane().add(UserNameTxt1);
        UserNameTxt1.setBounds(190, 230, 300, 50);

        Password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password :");
        getContentPane().add(Password);
        Password.setBounds(570, 240, 140, 40);

        PasswordTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PasswordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PasswordTxt);
        PasswordTxt.setBounds(710, 230, 320, 50);

        ShowPassword.setBackground(new java.awt.Color(0, 0, 0));
        ShowPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("  Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassword);
        ShowPassword.setBounds(780, 300, 210, 40);

        Selectcategory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Selectcategory.setForeground(new java.awt.Color(255, 255, 255));
        Selectcategory.setText("Select Categary");
        getContentPane().add(Selectcategory);
        Selectcategory.setBounds(1000, 460, 200, 40);

        CombSelect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CombSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Admin", "Employee", "Customer" }));
        CombSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombSelectActionPerformed(evt);
            }
        });
        getContentPane().add(CombSelect);
        CombSelect.setBounds(1000, 510, 270, 40);

        LogIn.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        LogIn.setText(" Log In");
        LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LogIn);
        LogIn.setBounds(1090, 230, 180, 100);

        LogIn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        LogIn0.setText("jLabel2");
        getContentPane().add(LogIn0);
        LogIn0.setBounds(1090, 230, 180, 100);

        SignUp.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        SignUp.setText("  Sign Up");
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        getContentPane().add(SignUp);
        SignUp.setBounds(50, 370, 190, 50);

        SignUp0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        SignUp0.setText("jLabel2");
        getContentPane().add(SignUp0);
        SignUp0.setBounds(50, 370, 190, 50);

        ForgotPassword.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        ForgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForgotPassword.setText(" Forgot Password");
        ForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(ForgotPassword);
        ForgotPassword.setBounds(280, 370, 410, 50);

        ForgotPassword0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        ForgotPassword0.setText("jLabel2");
        getContentPane().add(ForgotPassword0);
        ForgotPassword0.setBounds(280, 370, 410, 50);

        ResetPassword.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        ResetPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResetPassword.setText(" Reset Password");
        ResetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(ResetPassword);
        ResetPassword.setBounds(740, 370, 370, 50);

        ResetPassword0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        ResetPassword0.setText("jLabel2");
        getContentPane().add(ResetPassword0);
        ResetPassword0.setBounds(740, 370, 370, 50);

        Exit.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("Exit");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(140, 500, 750, 50);

        Exit0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Exit0.setText("jLabel2");
        getContentPane().add(Exit0);
        Exit0.setBounds(140, 500, 750, 50);

        LoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        getContentPane().add(LoginBackground);
        LoginBackground.setBounds(0, 0, 1330, 650);

        setSize(new java.awt.Dimension(1327, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTxt1ActionPerformed
        
    }//GEN-LAST:event_UserNameTxt1ActionPerformed

    private void CombSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombSelectActionPerformed
        
    }//GEN-LAST:event_CombSelectActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if(ShowPassword.isSelected()){
            PasswordTxt.setEchoChar((char)0);
        }else{
            PasswordTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        String x = CombSelect.getSelectedItem().toString();
        switch (x) {
            case "Choose":
                JOptionPane.showMessageDialog(null,"Please Select Category");
                break;
            case "Admin":
                JOptionPane.showMessageDialog(null,"You Cannot sign up by select Admin\nPlease change the category to Employee");
                break;
            default:
                setVisible(false);
                Sign_up su = new Sign_up();
                su.setVisible(true);
                break;
        }
    }//GEN-LAST:event_SignUpMouseClicked

    private void ForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseClicked
        String x = CombSelect.getSelectedItem().toString();
        if(x.equals("Choose")){
        JOptionPane.showMessageDialog(null,"Please Select Category");
        }else{
        setVisible(false);
        Forgot_Password fp = new Forgot_Password();
        fp.setVisible(true);
        }
    }//GEN-LAST:event_ForgotPasswordMouseClicked

    private void ResetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetPasswordMouseClicked
        String x = CombSelect.getSelectedItem().toString();
        if(x.equals("Choose")){
        JOptionPane.showMessageDialog(null,"Please Select Category");
        }else{
        setVisible(false);
        Reset_Password rp = new Reset_Password();
        rp.setVisible(true);
        }
    }//GEN-LAST:event_ResetPasswordMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Login.ICONIFIED);
  
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
        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JComboBox<String> CombSelect;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Exit0;
    private javax.swing.JLabel ForgotPassword;
    private javax.swing.JLabel ForgotPassword0;
    private javax.swing.JLabel LogIn;
    private javax.swing.JLabel LogIn0;
    private javax.swing.JLabel LoginBackground;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JLabel ResetPassword;
    private javax.swing.JLabel ResetPassword0;
    private javax.swing.JLabel Selectcategory;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel SignUp;
    private javax.swing.JLabel SignUp0;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNameTxt1;
    // End of variables declaration//GEN-END:variables
}
