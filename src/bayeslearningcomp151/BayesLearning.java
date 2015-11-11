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
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

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
    private TreeMap<String, Integer> TestWordsMap = new TreeMap<String, Integer>();
    private TreeMap<String, Double> RottenProbabilityMap = new TreeMap<String, Double>();
    private TreeMap<String, Double> FreshProbabilityMap = new TreeMap<String, Double>();
    private TreeMap<String, Double> TestProbabilityMap = new TreeMap<String, Double>();
    private List<String> wordList = new ArrayList<String>();
    
    private int freshWordCount;
    private int rottenWordCount;

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
        calculateProbabilitiesButton = new javax.swing.JButton();
        openTestButton = new javax.swing.JButton();
        printTestWordsButton = new javax.swing.JButton();
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

        calculateProbabilitiesButton.setText("Calculate Fresh");
        calculateProbabilitiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateProbabilitiesButtonActionPerformed(evt);
            }
        });

        openTestButton.setText("Open Test");
        openTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTestButtonActionPerformed(evt);
            }
        });

        printTestWordsButton.setText("Print Test Words");
        printTestWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTestWordsButtonActionPerformed(evt);
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
                        .addComponent(openTestButton)
                        .addGap(18, 18, 18)
                        .addComponent(printTestWordsButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(openFreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(freshReviewLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printFreshWordsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calculateProbabilitiesButton))
                            .addComponent(rottenReviewLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(openRottenButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printRottenWordsButton)))
                        .addGap(172, 260, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(freshReviewLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openFreshButton)
                            .addComponent(printFreshWordsButton)
                            .addComponent(calculateProbabilitiesButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rottenReviewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openRottenButton)
                    .addComponent(printRottenWordsButton))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openTestButton)
                    .addComponent(printTestWordsButton))
                .addContainerGap(62, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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
                freshReviewLabel.setText("Fresh Review File: " + sFile);
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
                rottenReviewLabel.setText("Rotten Review File: " + sFile);
                
            } catch (IOException ex) {
                Logger.getLogger(BayesLearning.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openRottenButtonActionPerformed

    private void printFreshWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFreshWordsButtonActionPerformed
        printWordFrequencies(FreshWordsMap);
        textArea.append("" + countNumberTotalOccurance(FreshWordsMap));
        
    }//GEN-LAST:event_printFreshWordsButtonActionPerformed

    private void printRottenWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRottenWordsButtonActionPerformed
        printWordFrequencies(RottenWordsMap);
    }//GEN-LAST:event_printRottenWordsButtonActionPerformed

    private void calculateProbabilitiesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateProbabilitiesButtonActionPerformed
        calculateProbabilities(FreshWordsMap, FreshProbabilityMap);
        printProbability(FreshProbabilityMap);
    }//GEN-LAST:event_calculateProbabilitiesButtonActionPerformed

    private void openTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTestButtonActionPerformed
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // clear the list for new file
            selectedFile  = fc.getSelectedFile();
            sFile = selectedFile.toString();
            try {
                readFile(selectedFile, TestWordsMap);
                //freshReviewLabel.setText("Fresh Review File: " + sFile);
            } catch (IOException ex) {
                Logger.getLogger(BayesLearning.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openTestButtonActionPerformed

    private void printTestWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTestWordsButtonActionPerformed
        printWordFrequencies(TestWordsMap);
        textArea.append("" + countNumberTotalOccurance(TestWordsMap));
    }//GEN-LAST:event_printTestWordsButtonActionPerformed

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
    
    public void calculateProbabilities(TreeMap<String, Integer> wordMap, TreeMap<String, Double> probMap){
        double probability;
        int numOccurance = 0;
        numOccurance = countNumberTotalOccurance(wordMap);
        for(String word: wordMap.keySet()){
            probability = ((double)wordMap.get(word) / (double)numOccurance) * 100.0;
            probMap.put(word, probability);
        }
    }
    
    public int countNumberTotalOccurance(TreeMap<String, Integer> a){
        int count = 0;
        for(String i: a.keySet()){
            count += a.get(i);
        }
        return count;
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
    
    public void printProbability(TreeMap<String, Double> prob){
        String a = "a";
        textArea.append(prob.get(a) + "\n");
        textArea.append("Probabilities: \n");
        for(String word: prob.keySet()){
            textArea.append(prob.get(word) + " : " + word + "\n");
        }
        //System.out.println("Total count: " + countNumberTotalOccurance(data));
    }
    
    public void printWordFrequencies(TreeMap<String, Integer> data){
        String a = "a";
       // textArea.append(data.get(a) + "\n");
        textArea.append("Word Frequencies: \n");
        for(String word: data.keySet()){
            textArea.append(data.get(word) + " : " + word + "\n");
        }
        //System.out.println("Total count: " + countNumberTotalOccurance(data));
    }
    
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
        System.out.println("Done");
    }
    
    public String StripString(String test){
        int i = 0;
        char temp;
        StringBuilder aString = new StringBuilder();
        while(i < test.length()){
            temp = test.charAt(i);
            if(Character.isAlphabetic(temp))
                aString.append(temp);
            i++;
        }
        return aString.toString();
        
    }
    
    public void readFile3(File Selected, TreeMap<String, Integer> data)throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(Selected)); 
        ReviewWord nTemp = new ReviewWord();
        int count = 0, i = 0;
        String word;
        String temp2;
        char temp;
        StringBuilder aString = new StringBuilder();
        double indata = 0.0;
        while((word = reader.readLine()) != null){
            //nTemp.setWord(scan.next());
            // ignores cases, and replaces all punctuation
            
            //word = scan.next().toLowerCase().replaceAll("[^\\w]", "");
            while(i < word.length()){
                    temp = word.charAt(i);
                if(Character.isAlphabetic(temp))
                    aString.append(temp);
                else if(Character.isSpaceChar(temp)){
                    temp2 = aString.toString();
                    wordList.add(temp2);
                    aString = new StringBuilder();
                }
                    
                i++;
            }
            displayWordList(wordList);
            /*
            if (data.containsKey(word))
            { 
                 count = data.get(word) + 1;
            }
            else
                count = 1;
            data.put(word, count);
              */      
        }
        System.out.println("Done");
    }
    
    public void displayWordList(List<String> List){
        Iterator iter = List.iterator();
        int i = 0;
        while(iter.hasNext()){
            textArea.append(List.get(i) + "\n");
            iter.next();
            i++;
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
    private javax.swing.JButton calculateProbabilitiesButton;
    private javax.swing.JLabel freshReviewLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openFreshButton;
    private javax.swing.JButton openRottenButton;
    private javax.swing.JButton openTestButton;
    private javax.swing.JButton printFreshWordsButton;
    private javax.swing.JButton printRottenWordsButton;
    private javax.swing.JButton printTestWordsButton;
    private javax.swing.JLabel rottenReviewLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
