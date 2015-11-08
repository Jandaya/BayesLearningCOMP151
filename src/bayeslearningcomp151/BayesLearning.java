/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayeslearningcomp151;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/* Joseph Andaya
    COMP 151
    11/2/2015
    Project 3
*/

public class BayesLearning extends javax.swing.JFrame {

   
    private List<ReviewWord> RottenWordsList = new ArrayList<ReviewWord>();
    private List<ReviewWord> FreshWordsList = new ArrayList<ReviewWord>();
    private TreeMap<String, Integer> RottenWordsMap = new TreeMap<String, Integer>();
    private TreeMap<String, Integer> FreshWordsMap = new TreeMap<String, Integer>();
    
    private File selectedFile;
    private String sFile;
    private JFileChooser fc = new JFileChooser();
    
    public BayesLearning() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        freshReviewLabel = new javax.swing.JLabel();
        rottenReviewLabel = new javax.swing.JLabel();
        openFreshButton = new javax.swing.JButton();
        openRottenButton = new javax.swing.JButton();
        printFreshWordsButton = new javax.swing.JButton();
        printRottenWordsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        freshReviewLabel.setText("Fresh Review file:");

        rottenReviewLabel.setText("Rotten Review file:");

        openFreshButton.setText("Open Fresh");
        openFreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFreshButtonActionPerformed(evt);
            }
        });

        openRottenButton.setText("Open Rotten");
        openRottenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRottenButtonActionPerformed(evt);
            }
        });

        printFreshWordsButton.setText("Print Fresh Words");
        printFreshWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFreshWordsButtonActionPerformed(evt);
            }
        });

        printRottenWordsButton.setText("Print Rotten Words");
        printRottenWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRottenWordsButtonActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openRottenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openFreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rottenReviewLabel)
                            .addComponent(freshReviewLabel)))
                    .addComponent(printFreshWordsButton)
                    .addComponent(printRottenWordsButton))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freshReviewLabel)
                    .addComponent(openFreshButton))
                .addGap(9, 9, 9)
                .addComponent(printFreshWordsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rottenReviewLabel)
                    .addComponent(openRottenButton))
                .addGap(18, 18, 18)
                .addComponent(printRottenWordsButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFreshButtonActionPerformed
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // clear the list for new file
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                readFile(selectedFile, FreshWordsMap);
                
            } catch (IOException ex) {
                Logger.getLogger(BayesLearning.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openFreshButtonActionPerformed

    private void openRottenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRottenButtonActionPerformed
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // clear the list for new file
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                readFile(selectedFile, RottenWordsMap);
                
            } catch (IOException ex) {
                Logger.getLogger(BayesLearning.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openRottenButtonActionPerformed

    private void printFreshWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFreshWordsButtonActionPerformed
        // TODO add your handling code here:
        printWordFrequencies(FreshWordsMap);
    }//GEN-LAST:event_printFreshWordsButtonActionPerformed

    private void printRottenWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRottenWordsButtonActionPerformed
        printWordFrequencies(RottenWordsMap);
    }//GEN-LAST:event_printRottenWordsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BayesLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BayesLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BayesLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BayesLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BayesLearning().setVisible(true);
            }
        });
    }

    public static int getCount(String word, TreeMap<String, Integer> frequencyData)
   {
      if (frequencyData.containsKey(word))
      { 
	   return frequencyData.get(word);
      }
      else
      { 
         return 0;
      }
   }
    
    public void printWordFrequencies(TreeMap<String, Integer> data){
        String a = "a";
        textArea.append(data.get(a) + "\n");
        textArea.append("Word Frequencies: \n");
        for(String word: data.keySet()){
            textArea.append(data.get(word) + " : " + word + "\n");
        }
    }
    
    public void readFile(File Selected, TreeMap<String, Integer> data)throws IOException{
        Scanner scan = new Scanner(Selected);
        ReviewWord nTemp = new ReviewWord();
        int count = 0;
        String word;
        double indata = 0.0;
        while(scan.hasNext()){
            //nTemp.setWord(scan.next());
            word = scan.next();
            if (data.containsKey(word))
            { 
                 count = data.get(word) + 1;
            }
            else
                count = 1;
            data.put(word, count);
        }
    }
    
    
    
    public void readFile2(File Selected, List<ReviewWord> id)throws IOException{
        Scanner scan = new Scanner(Selected);
        ReviewWord nTemp = new ReviewWord();
        int count1 = 0;
        double indata = 0.0;
        while(scan.hasNext()){
            nTemp.setWord(scan.next());        
            
            count1++;
            if(count1 > 2){
                count1 = 0;
                id.add(nTemp);
                nTemp = new ReviewWord();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel freshReviewLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openFreshButton;
    private javax.swing.JButton openRottenButton;
    private javax.swing.JButton printFreshWordsButton;
    private javax.swing.JButton printRottenWordsButton;
    private javax.swing.JLabel rottenReviewLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
