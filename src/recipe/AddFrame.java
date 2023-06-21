/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recipe;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author might
 */
public class AddFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddFrame
     */
    
//    ArrayList<Recipe> recipes = new ArrayList<>(); 
    HashMap<String, String> ingredients = new HashMap<>();
    LinkedList<String> steps = new LinkedList<>();
    
    public AddFrame() {
        initComponents();
    }
    
//    public AddFrame(ArrayList<Recipe> recipes) {
//        initComponents();
//        this.recipes = recipes;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Time = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        Ingredient = new javax.swing.JTextField();
        AddIngredientButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Step = new javax.swing.JTextField();
        AddStepButton = new javax.swing.JButton();
        Submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(185, 121, 72));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 225, 202));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        Name.setBackground(new java.awt.Color(236, 217, 195));
        Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.setText("Name");
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 225, 202));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Time");

        Time.setBackground(new java.awt.Color(236, 217, 195));
        Time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time.setText("60");
        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 225, 202));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingredients");

        Quantity.setBackground(new java.awt.Color(236, 217, 195));
        Quantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Quantity.setText("20g");
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        Ingredient.setBackground(new java.awt.Color(236, 217, 195));
        Ingredient.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ingredient.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ingredient.setText("olives");
        Ingredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngredientActionPerformed(evt);
            }
        });

        AddIngredientButton.setBackground(new java.awt.Color(220, 177, 129));
        AddIngredientButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddIngredientButton.setText("Add ingredient");
        AddIngredientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddIngredientButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 225, 202));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Steps");

        Step.setBackground(new java.awt.Color(236, 217, 195));
        Step.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Step.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Step.setText("heat the olives to 100 degrees for 10 minutes");
        Step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StepActionPerformed(evt);
            }
        });

        AddStepButton.setBackground(new java.awt.Color(220, 177, 129));
        AddStepButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddStepButton.setText("Add step");
        AddStepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStepButtonActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(220, 177, 129));
        Submit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Ingredient, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(AddIngredientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Step, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(AddStepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingredient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddIngredientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Step, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddStepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void IngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngredientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngredientActionPerformed

    private void StepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StepActionPerformed

    private void AddIngredientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddIngredientButtonActionPerformed
        // TODO add your handling code here:
        if(Ingredient.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Empty ingredient");
        }else if(Quantity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Empty quantity");
        }else{
            ingredients.put(Ingredient.getText(), Quantity.getText());
            Ingredient.setText("");
            Quantity.setText("");
        }
    }//GEN-LAST:event_AddIngredientButtonActionPerformed

    private void AddStepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStepButtonActionPerformed
        // TODO add your handling code here:
        if(Step.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Empty step");
        }else{
            steps.add(Step.getText());
            Step.setText("");
        }
        
    }//GEN-LAST:event_AddStepButtonActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        FileWriter recipeWriter;
        
        
        try{
            String step=Step.getText();
            String ing = Ingredient.getText();
            if(!step.equals("")) {
                steps.add(Step.getText());
            }
            if(!ing.equals("")) {
                ingredients.put(Ingredient.getText(), Quantity.getText());
            }
            if(steps.size()==0) {
                JOptionPane.showMessageDialog(null, "NO Steps");
            }
            else if(ingredients.size()==0) {
                JOptionPane.showMessageDialog(null, "NO ingredients");
            }
            else {
                String name = Name.getText();
                String time = Time.getText();
                String nameRegex="[a-zA-Z\\s]*$";
                String timeRegex="[0-9]+$";
               // System.out.println(name.matches(nameRegex));
                if(name.matches(nameRegex) && time.matches(timeRegex)) {
                  Recipe rsp = new Recipe(name, parseDouble(time), this.ingredients, this.steps);
                  try {
                    recipeWriter = new FileWriter("recipes.txt", true);
                    recipeWriter.write(rsp.toString());
                    recipeWriter.close();
                    } catch (IOException ex) {
                      //  Logger.getLogger(AddFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    main obj = new main();
                    obj.setVisible(true);

                    dispose();
                } else if(!name.matches(nameRegex)) {
                    JOptionPane.showMessageDialog(null, "Invalid name");
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid time");
                }
                
    //            this.recipes.add(rsp);
//                if()
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Time");
        }
    }//GEN-LAST:event_SubmitActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddIngredientButton;
    private javax.swing.JButton AddStepButton;
    private javax.swing.JTextField Ingredient;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Step;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
