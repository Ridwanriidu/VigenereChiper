

public class Vigenere extends javax.swing.JFrame {

private String table = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    
 public Vigenere() {
     
        initComponents();
        
        setLocationRelativeTo(this);
    }

       private String Cleaning_text(String text)
     {
         text = text.replaceAll("\n", "");  
         
        for(int x = 0; x < text.length(); x++)
        {
            int position = table.indexOf(text.charAt(x));
            
            if (position == -1)
            {
                text= text.replace(text.charAt(x), ' ');
            }
        }        
        return text;
    } 
       
public  String Encrypt(String text,String key)
{
  String cleaned_text = Cleaning_text(text);
        
  String encrypted = "";
 
  for(int t = 0,k= 0; t < cleaned_text.length(); t++,k= (k+1) % key.length())
  {
    int position = (table.indexOf(cleaned_text.charAt(t)) + table.indexOf(key.charAt(k))) % table.length();

   encrypted += table.charAt(position );

  }
   return encrypted;
}

public String Decrypt(String text,String key  )
{
  String cleaned_text = Cleaning_text(text);  
    
  String decrypted = "";

  for(int t = 0, k = 0; t < cleaned_text.length(); t++,k= (k+1) % key .length())
  {
   int position = (table.indexOf(cleaned_text.charAt(t)) - table.indexOf(key.charAt(k)));

   position = (position < 0)?(position + table.length()): position;

   decrypted += table.charAt(position);
   }
  return decrypted;
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        encrypt_button = new javax.swing.JButton();
        decrypt_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        key_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        input.setColumns(20);
        input.setRows(5);
        jScrollPane2.setViewportView(input);

        encrypt_button.setText("Encrypt");
        encrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encrypt_buttonActionPerformed(evt);
            }
        });

        decrypt_button.setText("Decrypt");
        decrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrypt_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Insert  key");

        key_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key_fieldActionPerformed(evt);
            }
        });

        jLabel2.setText("#Ridwan");

        jLabel3.setText("PLAINTEXT");

        jLabel4.setText("CHIPERTEXT");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setText("VIGENERE CHIPER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(key_field, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encrypt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decrypt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encrypt_button)
                    .addComponent(decrypt_button))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encrypt_buttonActionPerformed
       
        String text = input.getText();
        
        String key = key_field.getText();
        
        output.setText(Encrypt(text,key ));
    }//GEN-LAST:event_encrypt_buttonActionPerformed

    private void decrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrypt_buttonActionPerformed
       
        String text = output.getText();
        
        String key = key_field.getText();
        
        input.setText(Decrypt(text,key ));
    }//GEN-LAST:event_decrypt_buttonActionPerformed

    private void key_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key_fieldActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new Vigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decrypt_button;
    private javax.swing.JButton encrypt_button;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField key_field;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables
}
