/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Windows_94
 */
public class CLIENT extends javax.swing.JFrame
{

	/**
	 * Creates new form CLIENT
	 */
	public CLIENT()
	{
		initComponents();
	}
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm"); //Date Format
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        serverStatus = new javax.swing.ButtonGroup();
        serverInfoPanel = new javax.swing.JPanel();
        serverInetAddressLbl = new javax.swing.JLabel();
        serverPortLbl = new javax.swing.JLabel();
        remoteServerLbl = new javax.swing.JLabel();
        remoteServerPortLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        serverRunningRBtn = new javax.swing.JRadioButton();
        serverStoppedRBtn = new javax.swing.JRadioButton();
        serverFunctions = new javax.swing.JPanel();
        fNameLbl = new javax.swing.JLabel();
        fNameInput = new javax.swing.JTextField();
        lNameLbl = new javax.swing.JLabel();
        lNameInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        serverResponsePanel = new javax.swing.JPanel();
        serverResponseScrollPane = new javax.swing.JScrollPane();
        serverResponseTextArea = new javax.swing.JTextArea();
        shutdownProgramBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serverInfoPanel.setBackground(new java.awt.Color(204, 204, 204));

        serverInetAddressLbl.setForeground(new java.awt.Color(0, 0, 0));
        serverInetAddressLbl.setText("Server Inet Address:");

        serverPortLbl.setForeground(new java.awt.Color(0, 0, 0));
        serverPortLbl.setText("Server Port:");

        remoteServerLbl.setForeground(new java.awt.Color(0, 204, 0));

        remoteServerPortLbl.setForeground(new java.awt.Color(0, 204, 0));

        jButton1.setText("Toggle Server");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        serverStatus.add(serverRunningRBtn);
        serverRunningRBtn.setForeground(new java.awt.Color(0, 0, 0));
        serverRunningRBtn.setText("Server Running");
        serverRunningRBtn.setEnabled(false);
        serverRunningRBtn.setFocusable(false);
        serverRunningRBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                serverRunningRBtnActionPerformed(evt);
            }
        });

        serverStatus.add(serverStoppedRBtn);
        serverStoppedRBtn.setForeground(new java.awt.Color(0, 0, 0));
        serverStoppedRBtn.setSelected(true);
        serverStoppedRBtn.setText("Server Stopped");
        serverStoppedRBtn.setEnabled(false);
        serverStoppedRBtn.setFocusable(false);
        serverStoppedRBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                serverStoppedRBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout serverInfoPanelLayout = new javax.swing.GroupLayout(serverInfoPanel);
        serverInfoPanel.setLayout(serverInfoPanelLayout);
        serverInfoPanelLayout.setHorizontalGroup(
            serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serverInfoPanelLayout.createSequentialGroup()
                        .addComponent(serverInetAddressLbl)
                        .addGap(18, 18, 18)
                        .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remoteServerPortLbl)
                            .addComponent(remoteServerLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(serverInfoPanelLayout.createSequentialGroup()
                        .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(serverInfoPanelLayout.createSequentialGroup()
                                .addComponent(serverPortLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serverInfoPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(serverRunningRBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serverStoppedRBtn)))
                .addContainerGap())
        );
        serverInfoPanelLayout.setVerticalGroup(
            serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serverInfoPanelLayout.createSequentialGroup()
                        .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serverInetAddressLbl)
                            .addComponent(remoteServerLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serverPortLbl)
                            .addComponent(remoteServerPortLbl)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverStoppedRBtn)
                    .addComponent(serverRunningRBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        serverFunctions.setBackground(new java.awt.Color(204, 204, 204));

        fNameLbl.setForeground(new java.awt.Color(0, 0, 0));
        fNameLbl.setText("First Name:");

        lNameLbl.setForeground(new java.awt.Color(0, 0, 0));
        lNameLbl.setText("Surname:");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Age:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email:");

        javax.swing.GroupLayout serverFunctionsLayout = new javax.swing.GroupLayout(serverFunctions);
        serverFunctions.setLayout(serverFunctionsLayout);
        serverFunctionsLayout.setHorizontalGroup(
            serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNameLbl)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addGroup(serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNameLbl)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        serverFunctionsLayout.setVerticalGroup(
            serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLbl)
                    .addComponent(fNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameLbl)
                    .addComponent(lNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(serverFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        serverResponsePanel.setBackground(new java.awt.Color(204, 204, 204));

        serverResponseScrollPane.setBackground(new java.awt.Color(0, 0, 0));
        serverResponseScrollPane.setForeground(new java.awt.Color(255, 255, 255));
        serverResponseScrollPane.setAutoscrolls(true);

        serverResponseTextArea.setEditable(false);
        serverResponseTextArea.setBackground(new java.awt.Color(0, 0, 0));
        serverResponseTextArea.setColumns(20);
        serverResponseTextArea.setForeground(new java.awt.Color(255, 255, 255));
        serverResponseTextArea.setRows(5);
        serverResponseScrollPane.setViewportView(serverResponseTextArea);

        javax.swing.GroupLayout serverResponsePanelLayout = new javax.swing.GroupLayout(serverResponsePanel);
        serverResponsePanel.setLayout(serverResponsePanelLayout);
        serverResponsePanelLayout.setHorizontalGroup(
            serverResponsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serverResponsePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverResponseScrollPane)
                .addContainerGap())
        );
        serverResponsePanelLayout.setVerticalGroup(
            serverResponsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverResponsePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverResponseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        shutdownProgramBtn.setText("Close Program");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serverInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverResponsePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shutdownProgramBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(serverInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverResponsePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shutdownProgramBtn))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void serverRunningRBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_serverRunningRBtnActionPerformed
    {//GEN-HEADEREND:event_serverRunningRBtnActionPerformed
        serverRunningRBtn.setSelected(false);
    }//GEN-LAST:event_serverRunningRBtnActionPerformed

    private void serverStoppedRBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_serverStoppedRBtnActionPerformed
    {//GEN-HEADEREND:event_serverStoppedRBtnActionPerformed
        serverStoppedRBtn.setSelected(false);
    }//GEN-LAST:event_serverStoppedRBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        Date date = new Date(System.currentTimeMillis());
		if(serverRunningRBtn.isSelected()) //If Server Is Running > Stop
		{
			
			serverRunningRBtn.setSelected(false);
			serverStoppedRBtn.setSelected(true);
			serverResponseTextArea.append("\nSYSTEM: Shutting Down Server : \n"+date+"\n");
			//TODO > SHUTDOWN SERVER
		}
		else if(!serverRunningRBtn.isSelected()) //If Server Isn't Running > Run
		{
			serverRunningRBtn.setSelected(true);
			serverStoppedRBtn.setSelected(false);
			serverResponseTextArea.append("\nSYSTEM: Booting Up Server : \n"+date+"\n");			
			//TODO > BOOTUP SERVER
		}
    }//GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new CLIENT().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fNameInput;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lNameInput;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JLabel remoteServerLbl;
    private javax.swing.JLabel remoteServerPortLbl;
    private javax.swing.JPanel serverFunctions;
    private javax.swing.JLabel serverInetAddressLbl;
    private javax.swing.JPanel serverInfoPanel;
    private javax.swing.JLabel serverPortLbl;
    private javax.swing.JPanel serverResponsePanel;
    private javax.swing.JScrollPane serverResponseScrollPane;
    private javax.swing.JTextArea serverResponseTextArea;
    private javax.swing.JRadioButton serverRunningRBtn;
    private javax.swing.ButtonGroup serverStatus;
    private javax.swing.JRadioButton serverStoppedRBtn;
    private javax.swing.JButton shutdownProgramBtn;
    // End of variables declaration//GEN-END:variables
}
