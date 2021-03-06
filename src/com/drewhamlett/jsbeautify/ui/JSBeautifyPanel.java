/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drewhamlett.jsbeautify.ui;

import com.drewhamlett.jsbeautify.JSBeautifyOptions;
import org.openide.util.NbPreferences;

final class JSBeautifyPanel extends javax.swing.JPanel {

	private final JSBeautifyOptionsPanelController controller;

	JSBeautifyPanel( JSBeautifyOptionsPanelController controller ) {
		this.controller = controller;
		initComponents();
		// TODO listen to changes in form fields and call controller.changed()
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useTabs = new javax.swing.JCheckBox();
        preserveNewLines = new javax.swing.JCheckBox();
        spaceBeforeConditional = new javax.swing.JCheckBox();
        braceStyle = new javax.swing.JComboBox();
        braceStyleLabel = new javax.swing.JLabel();
        indentCase = new javax.swing.JCheckBox();
        jslintHappy = new javax.swing.JCheckBox();
        indentSize = new javax.swing.JComboBox();
        indentSizeLabel = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(useTabs, org.openide.util.NbBundle.getMessage(JSBeautifyPanel.class, "JSBeautifyPanel.useTabs.text")); // NOI18N
        useTabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useTabsActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(preserveNewLines, org.openide.util.NbBundle.getMessage(JSBeautifyPanel.class, "JSBeautifyPanel.preserveNewLines.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(spaceBeforeConditional, org.openide.util.NbBundle.getMessage(JSBeautifyPanel.class, "JSBeautifyPanel.spaceBeforeConditional.text")); // NOI18N
        spaceBeforeConditional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceBeforeConditionalActionPerformed(evt);
            }
        });

        braceStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "collapse", "expand" }));
        braceStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                braceStyleActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(braceStyleLabel, org.openide.util.NbBundle.getMessage(JSBeautifyPanel.class, "JSBeautifyPanel.braceStyleLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(indentCase, org.openide.util.NbBundle.getMessage(JSBeautifyPanel.class, "JSBeautifyPanel.indentCase.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jslintHappy, org.openide.util.NbBundle.getMessage(JSBeautifyPanel.class, "JSBeautifyPanel.jslintHappy.text")); // NOI18N
        jslintHappy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jslintHappyActionPerformed(evt);
            }
        });

        indentSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "8" }));

        org.openide.awt.Mnemonics.setLocalizedText(indentSizeLabel, org.openide.util.NbBundle.getMessage(JSBeautifyPanel.class, "JSBeautifyPanel.indentSizeLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jslintHappy)
                    .addComponent(indentCase)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spaceBeforeConditional)
                            .addComponent(preserveNewLines)
                            .addComponent(useTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(braceStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indentSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indentSizeLabel)
                            .addComponent(braceStyleLabel))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(braceStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(braceStyleLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(preserveNewLines)
                        .addGap(18, 18, 18)
                        .addComponent(spaceBeforeConditional)
                        .addGap(18, 18, 18)
                        .addComponent(indentCase)
                        .addGap(18, 18, 18)
                        .addComponent(jslintHappy))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indentSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indentSizeLabel))))
                .addContainerGap(317, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void useTabsActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_useTabsActionPerformed
		if ( useTabs.isSelected() ) {
			indentSize.setEnabled( false );
		} else {
			indentSize.setEnabled( true );
		}
	}//GEN-LAST:event_useTabsActionPerformed

	private void spaceBeforeConditionalActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_spaceBeforeConditionalActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_spaceBeforeConditionalActionPerformed

	private void braceStyleActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_braceStyleActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_braceStyleActionPerformed

    private void jslintHappyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jslintHappyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jslintHappyActionPerformed

	void load() {

		preserveNewLines.setSelected( JSBeautifyOptions.getInstance().getOption( "preserveNewLines", true ) );
		useTabs.setSelected( JSBeautifyOptions.getInstance().getOption( "useTabs", false ) );
		spaceBeforeConditional.setSelected( JSBeautifyOptions.getInstance().getOption( "spaceBeforeConditional", true ) );
		jslintHappy.setSelected( JSBeautifyOptions.getInstance().getOption( "jslintHappy", false ) );
		indentCase.setSelected( JSBeautifyOptions.getInstance().getOption( "indentCase", false ) );
		indentSize.setSelectedIndex( JSBeautifyOptions.getInstance().getOption( "indentSize", 1 ) );
		braceStyle.setSelectedItem( JSBeautifyOptions.getInstance().getOption( "braceStyle", "collapse" ) );

		if ( useTabs.isSelected() ) {
			indentSize.setEnabled( false );
		} else {
			indentSize.setEnabled( true );
		}
	}

	void store() {

		JSBeautifyOptions.getInstance().setOption( "preserveNewLines", preserveNewLines.isSelected() );
		JSBeautifyOptions.getInstance().setOption( "useTabs", useTabs.isSelected() );
		JSBeautifyOptions.getInstance().setOption( "spaceBeforeConditional", spaceBeforeConditional.isSelected() );
		JSBeautifyOptions.getInstance().setOption( "jslintHappy", jslintHappy.isSelected() );
		JSBeautifyOptions.getInstance().setOption( "indentCase", indentCase.isSelected() );
		JSBeautifyOptions.getInstance().setOption( "indentSize",  indentSize.getSelectedIndex() );
		JSBeautifyOptions.getInstance().setOption( "braceStyle", braceStyle.getSelectedItem().toString() );
	}

	boolean valid() {
		// TODO check whether form is consistent and complete
		return true;
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox braceStyle;
    private javax.swing.JLabel braceStyleLabel;
    private javax.swing.JCheckBox indentCase;
    private javax.swing.JComboBox indentSize;
    private javax.swing.JLabel indentSizeLabel;
    private javax.swing.JCheckBox jslintHappy;
    private javax.swing.JCheckBox preserveNewLines;
    private javax.swing.JCheckBox spaceBeforeConditional;
    private javax.swing.JCheckBox useTabs;
    // End of variables declaration//GEN-END:variables
}
