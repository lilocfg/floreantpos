/*
 * NumericDialog.java
 *
 * Created on August 22, 2006, 11:38 PM
 */

package com.floreantpos.ui.dialog;

import com.floreantpos.main.Application;

/**
 *
 * @author  MShahriar
 */
public class NumberSelectionDialog extends POSDialog {
	
    /** Creates new form NumericDialog */
    public NumberSelectionDialog() {
        super(Application.getPosWindow(), true);
        initComponents();
        
        setResizable(false);
        setValue(0);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        transparentPanel2 = new com.floreantpos.swing.TransparentPanel();
        transparentPanel1 = new com.floreantpos.swing.TransparentPanel();
        numberSelectionView = new com.floreantpos.ui.views.NumberSelectionView();
        titlePanel1 = new com.floreantpos.ui.TitlePanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        posButton1 = new com.floreantpos.swing.PosButton();
        posButton2 = new com.floreantpos.swing.PosButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enter Amount");

        transparentPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        transparentPanel2.setLayout(new java.awt.BorderLayout(5, 10));

        transparentPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        transparentPanel1.setLayout(new java.awt.GridLayout(1, 0, 5, 5));
        transparentPanel2.add(transparentPanel1, java.awt.BorderLayout.EAST);

        numberSelectionView.setBorder(null);
        transparentPanel2.add(numberSelectionView, java.awt.BorderLayout.CENTER);
        transparentPanel2.add(titlePanel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jSeparator1, java.awt.BorderLayout.NORTH);

        posButton1.setText("OK");
        posButton1.setPreferredSize(new java.awt.Dimension(120, 50));
        posButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doOk(evt);
            }
        });

        posButton2.setText("CANCEL");
        posButton2.setPreferredSize(new java.awt.Dimension(120, 50));
        posButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doCancel(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(posButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 58, Short.MAX_VALUE)
                .add(posButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(posButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(posButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        transparentPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(transparentPanel2, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-308)/2, (screenSize.height-490)/2, 308, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void doCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doCancel
    	canceled = true;
    	dispose();
    }//GEN-LAST:event_doCancel

    private void doOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doOk
    	canceled = false;
    	dispose();
    }//GEN-LAST:event_doOk
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private com.floreantpos.ui.views.NumberSelectionView numberSelectionView;
    private com.floreantpos.swing.PosButton posButton1;
    private com.floreantpos.swing.PosButton posButton2;
    private com.floreantpos.ui.TitlePanel titlePanel1;
    private com.floreantpos.swing.TransparentPanel transparentPanel1;
    private com.floreantpos.swing.TransparentPanel transparentPanel2;
    // End of variables declaration//GEN-END:variables
    
    public void setTitle(String title) {
    	numberSelectionView.setTitle(title);
    	super.setTitle(title);
    }

	public double getValue() {
		return numberSelectionView.getValue();
	}

	public boolean isDecimalAllowed() {
		return numberSelectionView.isDecimalAllowed();
	}

	public void setDecimalAllowed(boolean decimalAllowed) {
		numberSelectionView.setDecimalAllowed(decimalAllowed);
	}

	public void setValue(double value) {
		numberSelectionView.setValue(value);
	}
    
    
}