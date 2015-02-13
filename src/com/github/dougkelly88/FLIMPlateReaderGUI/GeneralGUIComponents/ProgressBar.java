/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.dougkelly88.FLIMPlateReaderGUI.GeneralGUIComponents;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Frederik
 */
public class ProgressBar extends javax.swing.JPanel {


    /**
     * Creates new form ProgressBar
     */
    public ProgressBar() {
        initComponents();
        jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Nothing in progress!");
        jProgressBar1.setBorder(border);
        jProgressBar1.repaint();
        
    }
    public void setTitel(String TitelBorder){
        Border border = BorderFactory.createTitledBorder(TitelBorder);
        jProgressBar1.setBorder(border);
    }
    
    public void setColor(int color){
        if(color==0){
            jProgressBar1.setForeground(Color.blue);
        } else if(color==1){
            jProgressBar1.setForeground(Color.green);
        } else if(color==2){
            jProgressBar1.setForeground(Color.red);
        }
    }
    
    public void stepIncrement(double step, double end) throws InterruptedException {
        //set a step in progress bar
        double prozentIncr= 1/end*100;
        double prozentDouble= (step+1)*prozentIncr;
        int prozentInt=(int) prozentDouble;
        System.out.println(prozentInt);
        jProgressBar1.setValue(prozentInt);
        jProgressBar1.repaint();

    }
    
    public void setValue(int value){
        // set progress bar to value
        jProgressBar1.setValue(value);
    }
    
    public void setStart(String name){
        setTitel(name+" in progress...");
        setColor(1);
        setValue(0);
    }
    
    public void setEnd(String name){
        setTitel(name+" done!");
        setColor(0);
        setValue(100);
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}
