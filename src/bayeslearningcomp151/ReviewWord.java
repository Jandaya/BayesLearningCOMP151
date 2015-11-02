/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayeslearningcomp151;

/**
 *
 * @author Joseph
 */
public class ReviewWord {
    
    private String word;
    private int numOccurance;
    
    public ReviewWord(){
        word = "";
        numOccurance = 0;
    }
    
    public ReviewWord(String w, int o){
        word = w;
        numOccurance = o;
    }
    
    public void setWord(String w){
        word = w;
    }
    
    public void setOccurance(int o){
        numOccurance = o;
    }
    
    public String getWord(){
        return word;
    }
    
    public int getOccurance(){
        return numOccurance;
    }
    
    
}
