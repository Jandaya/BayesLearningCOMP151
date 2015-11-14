/* Joseph Andaya
    COMP 151
    11/2/2015
    Project 3

    Note: probabilities have been shifted by *100 defined by variable CONSTANTSHIFT
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
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;


public class BayesLearning extends javax.swing.JFrame {
    
    private double RottenPercentage;
    private double FreshPercentage;
    private double CONSTANTSHIFT = 100.0;

    private TreeMap<String, Integer> RottenWordsMap = new TreeMap<String, Integer>();
    private TreeMap<String, Integer> FreshWordsMap = new TreeMap<String, Integer>();
    private TreeMap<String, Integer> TestWordsMap = new TreeMap<String, Integer>();
    private TreeMap<String, Double> RottenProbabilityMap = new TreeMap<String, Double>();
    private TreeMap<String, Double> FreshProbabilityMap = new TreeMap<String, Double>();
    private TreeMap<String, Double> TestProbabilityMap = new TreeMap<String, Double>();
    
    private TreeMap<String, Double> unkFreshProbabilityMap = new TreeMap<String, Double>();
    private TreeMap<String, Double> unkRottenProbabilityMap = new TreeMap<String, Double>();
        
    private int freshWordCount;
    private int rottenWordCount;

    private File selectedFile;
    private String sFile;
    private JFileChooser fc = new JFileChooser();
    
    public BayesLearning() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        freshReviewLabel = new javax.swing.JLabel();
        rottenReviewLabel = new javax.swing.JLabel();
        freshPercentageField = new javax.swing.JTextField();
        RottenPercentageField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        printFreshWordsButton = new javax.swing.JButton();
        openFreshButton = new javax.swing.JButton();
        printFreshProbabilities = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        printRottenWordsButton = new javax.swing.JButton();
        openRottenButton = new javax.swing.JButton();
        printRottenProbabilities = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        printTestWordsButton = new javax.swing.JButton();
        openTestButton = new javax.swing.JButton();
        printTestProbabilities = new javax.swing.JButton();
        testButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        testFileLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        freshReviewLabel.setText("Fresh Review file:");

        rottenReviewLabel.setText("Rotten Review file:");

        freshPercentageField.setText("50");

        RottenPercentageField.setText("50");

        jLabel1.setText("Fresh Percentage:");

        jLabel2.setText("Rotten Percentage:");

        printFreshWordsButton.setText("Print Fresh Words");
        printFreshWordsButton.setEnabled(false);
        printFreshWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFreshWordsButtonActionPerformed(evt);
            }
        });

        openFreshButton.setText("Open Fresh");
        openFreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFreshButtonActionPerformed(evt);
            }
        });

        printFreshProbabilities.setText("Print Fresh Probabilities");
        printFreshProbabilities.setEnabled(false);
        printFreshProbabilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFreshProbabilitiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(openFreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printFreshWordsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printFreshProbabilities)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(printFreshWordsButton)
                .addComponent(openFreshButton)
                .addComponent(printFreshProbabilities))
        );

        printRottenWordsButton.setText("Print Rotten Words");
        printRottenWordsButton.setEnabled(false);
        printRottenWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRottenWordsButtonActionPerformed(evt);
            }
        });

        openRottenButton.setText("Open Rotten");
        openRottenButton.setEnabled(false);
        openRottenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRottenButtonActionPerformed(evt);
            }
        });

        printRottenProbabilities.setText("Print Rotten Probabilities");
        printRottenProbabilities.setEnabled(false);
        printRottenProbabilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRottenProbabilitiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(openRottenButton)
                .addGap(18, 18, 18)
                .addComponent(printRottenWordsButton)
                .addGap(18, 18, 18)
                .addComponent(printRottenProbabilities)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printRottenWordsButton)
                    .addComponent(openRottenButton)
                    .addComponent(printRottenProbabilities)))
        );

        printTestWordsButton.setText("Print Test Words");
        printTestWordsButton.setEnabled(false);
        printTestWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTestWordsButtonActionPerformed(evt);
            }
        });

        openTestButton.setText("Open Test");
        openTestButton.setEnabled(false);
        openTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTestButtonActionPerformed(evt);
            }
        });

        printTestProbabilities.setText("Print Test Probabilities");
        printTestProbabilities.setEnabled(false);
        printTestProbabilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTestProbabilitiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(openTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printTestWordsButton)
                .addGap(32, 32, 32)
                .addComponent(printTestProbabilities)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printTestWordsButton)
                    .addComponent(openTestButton)
                    .addComponent(printTestProbabilities)))
        );

        testButton.setText("Run");
        testButton.setEnabled(false);
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("%");

        jLabel4.setText("%");

        testFileLabel.setText("Test Review File: ");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear Window");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(freshReviewLabel)
                                .addComponent(testFileLabel)
                                .addComponent(rottenReviewLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(freshPercentageField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RottenPercentageField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(testButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearButton)
                                    .addComponent(resetButton)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(freshReviewLabel)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rottenReviewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(testFileLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freshPercentageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RottenPercentageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(testButton)
                    .addComponent(clearButton))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                createUnknown(FreshWordsMap);
                freshReviewLabel.setText("Fresh Review File: " + sFile);
                calculateProbabilities(FreshWordsMap, FreshProbabilityMap);
                printFreshWordsButton.setEnabled(true);
                printFreshProbabilities.setEnabled(true);
                openRottenButton.setEnabled(true);
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
                createUnknown(RottenWordsMap);
                rottenReviewLabel.setText("Rotten Review File: " + sFile);
                calculateProbabilities(RottenWordsMap, RottenProbabilityMap);
                printRottenWordsButton.setEnabled(true);
                printRottenProbabilities.setEnabled(true);
                openTestButton.setEnabled(true);
                
            } catch (IOException ex) {
                Logger.getLogger(BayesLearning.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openRottenButtonActionPerformed

    private void printFreshWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFreshWordsButtonActionPerformed
        printWordFrequencies(FreshWordsMap);        
        //textArea.append("\nNumber of Unknown words based on 10% of total number of words: " + FreshWordsMap.get("UNK"));
    }//GEN-LAST:event_printFreshWordsButtonActionPerformed

    private void printRottenWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRottenWordsButtonActionPerformed
        printWordFrequencies(RottenWordsMap);
    }//GEN-LAST:event_printRottenWordsButtonActionPerformed

    private void openTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTestButtonActionPerformed
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // clear the list for new file
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                // reset test
                TestWordsMap = new TreeMap<String, Integer>();
                TestProbabilityMap = new TreeMap<String, Double>();
                
                // read in file
                readFile(selectedFile, TestWordsMap);
                testFileLabel.setText("Test Review File: " + sFile);
                calculateProbabilities(TestWordsMap, TestProbabilityMap);
                printTestWordsButton.setEnabled(true);
                printTestProbabilities.setEnabled(true);
                testButton.setEnabled(true);
            } catch (IOException ex) {
                Logger.getLogger(BayesLearning.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openTestButtonActionPerformed

    private void printTestWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTestWordsButtonActionPerformed
        printWordFrequencies(TestWordsMap);
    }//GEN-LAST:event_printTestWordsButtonActionPerformed

    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        
        //textArea.append("\n" + knownWordProbability(FreshProbabilityMap, TestProbabilityMap));
        if(freshPercentageField.getText().isEmpty() ||RottenPercentageField.getText().isEmpty())
        {
            
        }
        else{
            String temp, temp2;
            double resultFresh, resultRotten;
            temp = freshPercentageField.getText();
            FreshPercentage = Double.parseDouble(temp);
            FreshPercentage = FreshPercentage *0.01;
            //textArea.append("\nFresh Percentage" + FreshPercentage);

            temp2 = RottenPercentageField.getText();
            RottenPercentage = Double.parseDouble(temp2);
            RottenPercentage = RottenPercentage *0.01;
            
            
            //int unk = countNumberUnknown(FreshWordsMap, TestWordsMap);
            //int unk2 = countNumberUnknown(RottenWordsMap, TestWordsMap);
            //reCalculateProbabilities(FreshWordsMap, FreshProbabilityMap, unkFreshProbabilityMap, unk);
            //reCalculateProbabilities(RottenWordsMap, RottenProbabilityMap, unkRottenProbabilityMap, unk2);
            //printProbability(unkFreshProbabilityMap);
            
            resultFresh = bayes(FreshProbabilityMap, TestProbabilityMap, FreshWordsMap, TestWordsMap, FreshPercentage);
            resultRotten = bayes(RottenProbabilityMap, TestProbabilityMap, RottenWordsMap, TestWordsMap, RottenPercentage);
            
            textArea.append("\nResult Fresh: " + resultFresh);
            textArea.append("\nResult Rotten: " + resultRotten);
            
            makeDecision(resultFresh, resultRotten);
            
        }
    }//GEN-LAST:event_testButtonActionPerformed

    private void printFreshProbabilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFreshProbabilitiesActionPerformed
        printWordProbabilities(FreshProbabilityMap);
    }//GEN-LAST:event_printFreshProbabilitiesActionPerformed

    private void printRottenProbabilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRottenProbabilitiesActionPerformed
        printWordProbabilities(RottenProbabilityMap);
    }//GEN-LAST:event_printRottenProbabilitiesActionPerformed

    private void printTestProbabilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTestProbabilitiesActionPerformed
        printWordProbabilities(TestProbabilityMap);
    }//GEN-LAST:event_printTestProbabilitiesActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resetValues();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        textArea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

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
    
    public void resetValues(){
        RottenWordsMap = new TreeMap<String, Integer>();
        FreshWordsMap = new TreeMap<String, Integer>();
        TestWordsMap = new TreeMap<String, Integer>();
        RottenProbabilityMap = new TreeMap<String, Double>();
        FreshProbabilityMap = new TreeMap<String, Double>();
        TestProbabilityMap = new TreeMap<String, Double>();

        unkFreshProbabilityMap = new TreeMap<String, Double>();
        unkRottenProbabilityMap = new TreeMap<String, Double>();

         int freshWordCount = 0;
         int rottenWordCount = 0;

        openRottenButton.setEnabled(false); 
        openTestButton.setEnabled(false); 
        printFreshProbabilities.setEnabled(false);
        printRottenProbabilities.setEnabled(false);
        printFreshWordsButton.setEnabled(false);
        printRottenWordsButton.setEnabled(false);
        printTestWordsButton.setEnabled(false);
        printTestProbabilities.setEnabled(false);
        testButton.setEnabled(false);

        freshReviewLabel.setText("Fresh Review File: ");
        rottenReviewLabel.setText("Rotten Review File: ");
        testFileLabel.setText("Test Review File: ");
        textArea.setText("");
    }
    
    // counts the number of non-unique unknown occurances
    public int countNumberUnknown(TreeMap<String, Integer> training, TreeMap<String, Integer> test){
        int commonCount = 0, unknownCount = 0;
        for(String i: test.keySet()){
            if(training.containsKey(i))
                commonCount+=test.get(i);
            else
                unknownCount+=test.get(i);
        }
        return unknownCount;
    }
    
    // makes it's final decision if fresh or rotten or neutral
    public void makeDecision(double fresh, double rotten){
        if(fresh > rotten){
            textArea.append("\nFresh!");
        }
        else if(rotten > fresh)
            textArea.append("\nRotten!");
        else
            textArea.append("\nNeutral.");
    }
    
    // uses the formula to generate an overall probability that it will be fresh or rotten
    public double bayes(TreeMap<String, Double> trainingProbability, TreeMap<String, Double> testProbability, 
                        TreeMap<String, Integer> trainingWords, TreeMap<String, Integer> testWords, double overall){
        double temp;
        double unknownProb = trainingProbability.get("UNK");
        temp = overall * knownWordProbability(trainingProbability, testProbability) * unknownProb; //* unknownWordProbability(trainingWords, testWords);
        return temp;
    }
    
    // each occurance of a word in the test file is taken and multiplied by it's probabilty it is fresh or rotten
    // takes probability from training set.
    public double knownWordProbability(TreeMap<String, Double> training, TreeMap<String, Double> test){//, TreeMap<String, Integer> testWordMap){
        double prob = -1000;
        for(String i: test.keySet() ){
            if(training.containsKey(i)){
                if (prob == -1000)
                {
                    prob = training.get(i);
                    // starting at 1 to skip the amount of words
                    for(int j = 1; j < TestWordsMap.get(i); j++)
                        prob = prob * training.get(i);
                }
                else
                    // get the number of occurances, multiply the probability that many times.
                    for(int j = 0; j < TestWordsMap.get(i); j++)
                        prob = prob * training.get(i);
            }
        }

        return prob;
    }
    
    // calculates the unknown word probability.
    public double unknownWordProbability(TreeMap<String, Integer> training, TreeMap<String, Integer> test){
        double prob = -1000;
        int commonCount = 0, unknownCount = 0, overallCount = 0;
        for(String i: test.keySet()){
            if(training.containsKey(i))
                commonCount++;
                //commonCount+=test.get(i);
            else
                unknownCount++;
                //unknownCount+=test.get(i);
        }
        overallCount = unknownCount + commonCount;
        prob = (double)unknownCount / (double)overallCount;
        prob = prob * CONSTANTSHIFT;
        return prob;
    }
    
    // calculates probabilties and stores in a tree map of probabilities to words as keys
    public void calculateProbabilities(TreeMap<String, Integer> wordMap, TreeMap<String, Double> probMap){
        double probability;
        int numOccurance = 0;
        
        numOccurance = countNumberTotalOccurance(wordMap);
        for(String word: wordMap.keySet()){
            probability = ((double)wordMap.get(word) / (double)numOccurance) * CONSTANTSHIFT;
            probMap.put(word, probability);
        }
    }
    
    //re calculates probabilities into a new map.
    public void reCalculateProbabilities(TreeMap<String, Integer> wordMap, TreeMap<String, Double> probMap, TreeMap<String, Double> newMap,
                                            int unk){
        double probability;
        int numOccurance = 0;
        double unkProb;
        numOccurance = countNumberTotalOccurance(wordMap) + unk;
        for(String word: wordMap.keySet()){
            
            probability = ((double)wordMap.get(word) / (double)numOccurance) * CONSTANTSHIFT;
            newMap.put(word, probability);
        }
        // add the unknown probability to the list
        unkProb = unk/(double)numOccurance;
        newMap.put("unknown", unkProb);
    }
    
    // counts number of all occurances in a wordmap
    public int countNumberTotalOccurance(TreeMap<String, Integer> a){
        int count = 0;
        for(String i: a.keySet()){
            count += a.get(i);
        }
        return count;
    }
    
    // generates unknown words in the training file to be initialized
    public void createUnknown(TreeMap<String, Integer> map){
        int numWords = countNumberTotalOccurance(map);
        double proportion = 0.1;
        int numberUnknown = 0;
        proportion = numWords * 0.1;
        numberUnknown = (int)proportion;
        map.put("UNK", numberUnknown);
    }
    
    // displays the probability map of given.
    public void printProbability(TreeMap<String, Double> prob){
        textArea.append("\nProbabilities: \n");
        for(String word: prob.keySet()){
            textArea.append(prob.get(word) + " : " + word + "\n");
        }
    }
    
    // display's each word's frequency
    public void printWordFrequencies(TreeMap<String, Integer> data){
        String a = "a";
       // textArea.append(data.get(a) + "\n");
        textArea.append("\nWord Frequencies: \n");
        for(String word: data.keySet()){
            textArea.append(data.get(word) + " : " + word + "\n");
        }
        textArea.append("Total number of words: " + countNumberTotalOccurance(data));

    }
    
    // display's each word's frequency
    public void printWordProbabilities(TreeMap<String, Double> data){
        String a = "a";
       // textArea.append(data.get(a) + "\n");
        textArea.append("\nWord Probabilities: \n");
        for(String word: data.keySet()){
            textArea.append(data.get(word) + " : " + word + "\n");
        }

    }
    
    // algorithm to read in file. will strip all special characters except '
    public void readFile(File Selected, TreeMap<String, Integer> data)throws IOException{
        Scanner scan = new Scanner(Selected);
        ReviewWord nTemp = new ReviewWord();
        int count = 0;
        String word;
        double indata = 0.0;
        while(scan.hasNext()){
            //nTemp.setWord(scan.next());
            // ignores cases, and replaces all punctuation
            //word = scan.next().toLowerCase().replaceAll("[^\\w]", "");
            
            // replaces punctuation except for apostrophe.
            word = scan.next().toLowerCase().replaceAll("[\\p{P}&&[^\u0027]]", "");
            
            if (data.containsKey(word))
            { 
                 count = data.get(word) + 1;
            }
            else
                count = 1;
            data.put(word, count);
                    
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RottenPercentageField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField freshPercentageField;
    private javax.swing.JLabel freshReviewLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openFreshButton;
    private javax.swing.JButton openRottenButton;
    private javax.swing.JButton openTestButton;
    private javax.swing.JButton printFreshProbabilities;
    private javax.swing.JButton printFreshWordsButton;
    private javax.swing.JButton printRottenProbabilities;
    private javax.swing.JButton printRottenWordsButton;
    private javax.swing.JButton printTestProbabilities;
    private javax.swing.JButton printTestWordsButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel rottenReviewLabel;
    private javax.swing.JButton testButton;
    private javax.swing.JLabel testFileLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
