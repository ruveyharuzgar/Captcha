
package odev1;
import java.util.Random;

public class Odev1 extends javax.swing.JFrame 
{

    int try_count;
  
    public Odev1() 
    {
        initComponents();
        Random rand = new Random();
        String str="";
        for (int i = 0; i < 5; i++) {
          str = str + rand.nextInt(9);   
        }
        lbl_cap.setText(str);
        try_count = 3;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cap = new javax.swing.JButton();
        lbl_cap = new javax.swing.JLabel();
        txt_cap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cap.setText("Giris Yap");
        btn_cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capActionPerformed(evt);
            }
        });

        lbl_cap.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_cap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cap.setText("Burada Numara Yazacak !");
        lbl_cap.setAlignmentX(0.5F);

        txt_cap.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        txt_cap.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_cap, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_cap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_cap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(lbl_cap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_cap, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cap)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_capActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capActionPerformed
        // TODO add yours handling code here:
        System.out.println(lbl_cap.getText());
        System.out.println(txt_cap.getText());
        if(lbl_cap.getText().equals(txt_cap.getText()))
        {
            javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,
                "Basariyla Giris Yaptınız.",
                "BASARILI",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }
        else
        {
            try_count --;
            if(try_count == 0)
            {
                System.exit(0);
                return;
            }
            javax.swing.JFrame frame = new javax.swing.JFrame("Message");
            javax.swing.JOptionPane.showMessageDialog(frame,
                "Hatalı Giris Yaptiniz. " + try_count + " Hakkınız kaldi.",
                "HATALI",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_capActionPerformed

    public static void main(String args[]) 
    {
      
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Odev1().setVisible(true);
            }
        });


       //random_value.append();// += rand.nextInt(9).St; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn_cap;
    protected javax.swing.JLabel lbl_cap;
    protected javax.swing.JTextField txt_cap;
    // End of variables declaration//GEN-END:variables
}

