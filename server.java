/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toshiba
 */
public class server extends javax.swing.JFrame {
      static  PrintWriter pw;
    static OutputStream  os;
       static BufferedReader br; 
   static InputStreamReader isr;
 static InputStream  is;
   static ServerSocket serveur;
   static Socket socket,c ;
  static   DataInputStream din;
   static DataOutputStream  dout;
                // System.out.print("ljjjkl"+msgin);
  /* public static void conn(){
    try {ServerSocket serveur=new ServerSocket(123);
     
         System.out.print("j'attends une connectin");
         Socket c=serveur.accept();//bloquant en attent une connexion
         //lire une ch de char envoyé par le client 
              InputStream  is=c.getInputStream();
              InputStreamReader isr=new InputStreamReader(is);
              BufferedReader br =new BufferedReader(isr);
               
               // pour envoyer une chaine de char au client
          OutputStream  os=c.getOutputStream();
          PrintWriter pw=new PrintWriter(os,true);
          
         System.out.print("j'attends une chaine");
       String s=br.readLine();//lire la chaine de client
       System.out.print("voici la chaine de  client" +s);
               System.out.print("j envoie la reponse");
                      String res="voici la chaine de  client:"  +s;
      pw.println(res);//l'envoi de la chaine de client  
           c.close();}
           catch(Exception e){e.printStackTrace();
      } }*/
   
    /**
     * Creates new form server
     */
    public server() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        send = new javax.swing.JButton();
        msgt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        msga = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("server");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        send.setText("send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        msgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgtActionPerformed(evt);
            }
        });

        msga.setColumns(20);
        msga.setRows(5);
        jScrollPane2.setViewportView(msga);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgt)
                .addGap(18, 18, 18)
                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
       
          try {
               String msgout="";
        msgout=msgt.getText().trim();
              dout.writeUTF(msgout);//.println(msgout);
          } catch (IOException e) {
       
          }
    }//GEN-LAST:event_sendActionPerformed

    private void msgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         
      /* try{
         String msgin = "";

        serveur=new ServerSocket(2005);//server start at number 123
           socket=serveur.accept();
          din=new   DataInputStream (socket.getInputStream());
     dout=new  DataOutputStream(socket.getOutputStream());
     //while(!msgin.equals("exit")){
         msgin=din.readUTF();
              
         msga.setText(msga.getText().trim()+"\n"+msgin);//}//displaying the msg from client
             // System.out.print("ljjjkl"+msgin);*/
         /*  System .out.println("xvnv");
     }    catch(Exception e){
     
     }***/
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new server().setVisible(true);
            }
        });
    //bloquant en attent une connexion
         //lire usene ch de char envoyé par le client 
              
      
      try{
         String msgin = "";

        serveur=new ServerSocket(2005);//server start at number 123
           socket=serveur.accept();
          din=new   DataInputStream (socket.getInputStream());
     dout=new  DataOutputStream(socket.getOutputStream());
     while(!msgin.equals("exit")){
         msgin=din.readUTF();
              
         msga.setText(msga.getText().trim()+"\n"+msgin);}//displaying the msg from client
             // System.out.print("ljjjkl"+msgin);
     }    catch(Exception e){
     
     }
        
        
    //    String msg;
        
      /*   try {ServerSocket serveur=new ServerSocket(123);
     
         System.out.print("j'attends une connectin");
         Socket c=serveur.accept();//bloquant en attent une connexion
         //lire une ch de char envoyé par le client 
              InputStream  is=c.getInputStream();
              InputStreamReader isr=new InputStreamReader(is);
              BufferedReader br =new BufferedReader(isr);
               
               // pour envoyer une chaine de char au client
          OutputStream  os=c.getOutputStream();
          PrintWriter pw=new PrintWriter(os,true);
           din=new    DataInputStream (c.getInputStream());
     dout=new  DataOutputStream(c.getOutputStream());
     String msgin;
            msgin=din.readUTF();
         System.out.print("j'attends une chaine");
       String s=br.readLine();//lire la chaine de client
       msga.setText(msgin);
       System.out.print("voici la chaine de  client" +s);
               System.out.print("j envoie la reponse");
                      String res="voici la chaine de  client:"  +s;}
    // pw.println(res);//l'envoi de la chaine de client  
      
          // c.close();}
           catch(Exception e){e.printStackTrace();
      } */
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextArea msga;
    private javax.swing.JTextField msgt;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
