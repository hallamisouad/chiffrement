
package poste1client;

//import static com.sun.corba.se.spi.orbutil.fsm.Guard.Result.convert;
import java.awt.Dimension;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;  
import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static javafx.scene.input.KeyCode.H;
import javax.swing.JOptionPane;
//import server_poste_2.RC4_Server;
//import static server_poste_2.RC4_Server.clé;
/*import static poste1.Hellmanbluclient.serveur;
import static poste1.server.serveur;*/

/**
 char a='v'; 
ghString mot=Character.toString(a); 
@+*
 * @author toshiba
 */

public class RC4_Client extends javax.swing.JFrame {
  
       static ServerSocket serveur,serveur2;
   static Socket socket,c ,socke,soc;
  static   DataInputStream din,din2;
   static DataOutputStream  dout,dout2;
int temp=0;

 static  String text1,con;
    String clé2; 
   String textde;
  
  /*  Hellmanbluclient */ 
 //  H= new Hellmanbluclient(sh).;
// RC4_As. clé =H.jhash.getText();
  //  clé.setText(sh);
  
   
     //new service(s,nbclient).start();
   
   
@Override
      public Dimension getPreferredSize() {
return new Dimension (500, 750); // largeur et hauteur préférées
}
           int s[]=new int[256];
int k[]=new int[256];
 static void display(int disp[])
        
{
  
char convert[]=new char[disp.length];
for(int l=0;l<disp.length;l++)
{
convert[l]=(char)disp[l];

String con=Character.toString(convert[l]);//la chaine de crypter 

textd2.append(con);

     
System.out.print(con);
//textd.setText(con);
//textd.append(con);


 }}
   void display2(int disp[])
        
{
  
char convert[]=new char[disp.length];
for(int l=0;l<disp.length;l++)
{
convert[l]=(char)disp[l];

String con=Character.toString(convert[l]);//la chaine de crypter 

textd.append(con);

     
System.out.print(con);
//textd.setText(con);
//textd.append(con);


 }}
 public void chiffrer( String text1,String clé2){
    try{  text1=textc.getText();
      clé2=clé.getText();    
//DataInputStream in=new DataInputStream(System.in);
      char ptextc[]=text1.toCharArray();
     char keyc[]=clé2.toCharArray();
     int cipher[]=new int[text1.length()];
         //int decrypt[]=new int[text1.length()];
       int text1i[]=new int[text1.length()];
int cléi[]=new int[clé2.length()];
for(int i=0;i<text1.length();i++)
{
text1i[i]=(int)ptextc[i];
}
   for(int i=0;i<clé2.length();i++)
{
cléi[i]=(int)keyc[i];
}  
  //intialisation de s
   for(int i=0;i<255;i++)
{
s[i]=i;
k[i]=cléi[i%clé2.length()];//pour remplir le tab k par  la clé autant de fois jusqu’à atteindre la taille de k
//System.out.print("gldfgldl"+k[i]);
}
   //generation de permutation
int j=0;
for(int i=0;i<255;i++)
{
j=(j+s[i]+k[i])%256; 
//cette partie pour le swaping
temp=s[i];
s[i]=s[j];
s[j]=temp;
}
int i=0;
j=0;
int z=0;
for(int l=0;l<text1.length();l++)
{
i=(l+1)%256;
j=(j+s[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
z=s[(s[i]+s[j])%256];
cipher[l]=z^text1i[l];}
    display(cipher);
 }catch(Exception e){ JOptionPane.showMessageDialog(null, " générer  la clé  avant / " +e.getMessage());
}}
 
 static String ip;
 public static void mclient(){
 
            
       try{
         String msgin = "";
System.out.println("moi le client j'attends leserveur");
        /*serveur=new ServerSocket(123);//server start at number 123
           socket=serveur.accept();*/
         socke =new Socket(ip,2000);
         din=new    DataInputStream (socke.getInputStream());
        
     dout=new  DataOutputStream(socke.getOutputStream());
  
     }    catch(Exception e){
                   JOptionPane.showMessageDialog(null, e.getMessage());
     
     }
 }
 /*public void dechiffrer(String textde,String clé2){
       clé2=clé.getText(); 
      textde=textd.getText();
     // System.out.print(textde);
     char ptextc[]=textde.toCharArray();
     char keyc[]=clé2.toCharArray();
     int decrypt[]=new int[textde.length()];
        // int decrypt[]=new int[textde.length()];
       int textdei[]=new int[textde.length()];
int cléi[]=new int[clé2.length()];
for(int i=0;i<textde.length();i++)
{
textdei[i]=(int)ptextc[i];
}
   for(int i=0;i<clé2.length();i++)
{
cléi[i]=(int)keyc[i];
}  for(int i=0;i<255;i++)
{
s[i]=i;
k[i]=cléi[i%clé2.length()];
 
}
 //System.out.print(k[i]);
int j=0;
for(int i=0;i<255;i++)
{
j=(j+s[i]+k[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
}
int i=0;
j=0;
int z=0;
for(int l=0;l<textde.length();l++)
{
i=(l+1)%256;
j=(j+s[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
z=s[(s[i]+s[j])%256];
decrypt[l]=z^textdei[l];}
    display(decrypt);
}*/
  
  public void dechiffrer(String textde,String clé2){
      jdech.setText(null);
       clé2=clé.getText(); 
      textde=textd.getText();
     // System.out.print(textde);
     char ptextc[]=textde.toCharArray();
     char keyc[]=clé2.toCharArray();
     int decrypt[]=new int[textde.length()];
        // int decrypt[]=new int[textde.length()];
       int textdei[]=new int[textde.length()];
int cléi[]=new int[clé2.length()];
for(int i=0;i<textde.length();i++)
{
textdei[i]=(int)ptextc[i];
}
   for(int i=0;i<clé2.length();i++)
{
cléi[i]=(int)keyc[i];
}  for(int i=0;i<255;i++)
{
s[i]=i;
k[i]=cléi[i%clé2.length()];
 
}
 //System.out.print(k[i]);
int j=0;
for(int i=0;i<255;i++)
{
j=(j+s[i]+k[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
}
int i=0;
j=0;
int z=0;
for(int l=0;l<textde.length();l++)
{
i=(l+1)%256;
j=(j+s[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
z=s[(s[i]+s[j])%256];
decrypt[l]=z^textdei[l];}
    display2(decrypt);
}
  
  
  
  
 
    
    public RC4_Client() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Décrypter =  new komponenMakeOver.buttonMakeOver();
        recevoir =  new komponenMakeOver.buttonMakeOver();
        msgc = new javax.swing.JScrollPane();
        jdech = new javax.swing.JTextArea();
        msgchif = new javax.swing.JScrollPane();
        textd = new javax.swing.JTextArea();
        crypter =  new komponenMakeOver.buttonMakeOver();
        envoyer =  new komponenMakeOver.buttonMakeOver();
        clé = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textc = new javax.swing.JTextArea();
        code = new javax.swing.JLabel();
        clear =  new komponenMakeOver.buttonMakeOver();
        quiter =  new komponenMakeOver.buttonMakeOver();
        jScrollPane1 = new javax.swing.JScrollPane();
        textd2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RC4_poste_1 client");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(735, 580));
        getContentPane().setLayout(null);

        Décrypter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Décrypter.setForeground(new java.awt.Color(255, 255, 255));
        Décrypter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/32open.png"))); // NOI18N
        Décrypter.setText("Décrypter");
        Décrypter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Décrypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DécrypterActionPerformed(evt);
            }
        });
        getContentPane().add(Décrypter);
        Décrypter.setBounds(400, 610, 150, 50);

        recevoir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recevoir.setForeground(new java.awt.Color(255, 255, 255));
        recevoir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Email-Download-icon.png"))); // NOI18N
        recevoir.setText("Recevoir");
        recevoir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recevoir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recevoirActionPerformed(evt);
            }
        });
        getContentPane().add(recevoir);
        recevoir.setBounds(30, 610, 140, 50);

        jdech.setColumns(20);
        jdech.setRows(5);
        jdech.setBorder(javax.swing.BorderFactory.createTitledBorder("Décrypter  le cryptogramme recue"));
        msgc.setViewportView(jdech);

        getContentPane().add(msgc);
        msgc.setBounds(390, 390, 320, 200);

        textd.setColumns(20);
        textd.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        textd.setRows(5);
        textd.setBorder(javax.swing.BorderFactory.createTitledBorder("Recevoir le cryptogramme"));
        msgchif.setViewportView(textd);

        getContentPane().add(msgchif);
        msgchif.setBounds(20, 390, 340, 200);

        crypter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crypter.setForeground(new java.awt.Color(255, 255, 255));
        crypter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/32fermer.png"))); // NOI18N
        crypter.setText("Crypter");
        crypter.setToolTipText("chiffrer le message par le RC4");
        crypter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crypter.setBorderPainted(false);
        crypter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        crypter.setFocusPainted(false);
        crypter.setMaximumSize(new java.awt.Dimension(61, 25));
        crypter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crypterMouseClicked(evt);
            }
        });
        crypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crypterActionPerformed(evt);
            }
        });
        getContentPane().add(crypter);
        crypter.setBounds(30, 330, 140, 50);

        envoyer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        envoyer.setForeground(new java.awt.Color(255, 255, 255));
        envoyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/env32.png"))); // NOI18N
        envoyer.setText("Envoyer");
        envoyer.setToolTipText("envoyer le cryptograme a la station B");
        envoyer.setBorderPainted(false);
        envoyer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        envoyer.setDoubleBuffered(true);
        envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerActionPerformed(evt);
            }
        });
        getContentPane().add(envoyer);
        envoyer.setBounds(380, 330, 130, 50);

        clé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cléActionPerformed(evt);
            }
        });
        getContentPane().add(clé);
        clé.setBounds(190, 20, 320, 60);

        textc.setColumns(20);
        textc.setRows(5);
        textc.setBorder(javax.swing.BorderFactory.createTitledBorder("Saisir et crypter le message "));
        jScrollPane2.setViewportView(textc);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 120, 340, 200);

        code.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        code.setForeground(new java.awt.Color(255, 255, 255));
        code.setText("La Clé");
        code.setToolTipText("on a generer cette  clé a l'aide de Deffie Hellman");
        getContentPane().add(code);
        code.setBounds(90, 40, 90, 20);

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Corbeille-vide-1-icon.pngjllk.png"))); // NOI18N
        clear.setText("Vider");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(220, 610, 140, 50);

        quiter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quiter.setForeground(new java.awt.Color(255, 255, 255));
        quiter.setText("Déconnecter");
        quiter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        quiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiterActionPerformed(evt);
            }
        });
        getContentPane().add(quiter);
        quiter.setBounds(570, 610, 140, 50);

        textd2.setColumns(20);
        textd2.setRows(5);
        textd2.setBorder(javax.swing.BorderFactory.createTitledBorder("Envoyer le cryptogramme"));
        jScrollPane1.setViewportView(textd2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 120, 330, 200);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("RC4");
        jLabel5.setToolTipText("RC4  c'est un algorithme de chiffremnt symétrique (par flux)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 80, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fontblue.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, -20, 780, 740);

        labb.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        labb.setForeground(new java.awt.Color(51, 51, 255));
        labb.setText("connecter");
        labb.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labbAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(labb);
        labb.setBounds(30, 50, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crypterActionPerformed
                                                   


 try{chiffrer(text1,clé2);}catch(Exception e){//textd.setText(null);
          JOptionPane.showMessageDialog(null, " générer  la clé  avant / ");}
 
    }//GEN-LAST:event_crypterActionPerformed

    private void cléActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cléActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cléActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
      // textd.setText(null); 
              textc.setText(null); 
                   //  clé.setText(null);
                     textd2.setText(null); 
                     textd.setText(null); 
                     jdech.setText(null); 
    }//GEN-LAST:event_clearActionPerformed

    private void quiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiterActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_quiterActionPerformed

    private void labbAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labbAncestorAdded
        // TODO add your handling code here:
        //mclient();
    }//GEN-LAST:event_labbAncestorAdded

    private void DécrypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DécrypterActionPerformed
 /*String text1=textd.getText();
     String clé2=clé.getText();
   
    
     
     char ptextc[]=text1.toCharArray();
     char keyc[]=clé2.toCharArray();
     int cipher[]=new int[text1.length()];
         int decrypt[]=new int[text1.length()];
       int text1i[]=new int[text1.length()];
int cléi[]=new int[clé2.length()];
for(int i=0;i<text1.length();i++)
{
text1i[i]=(int)ptextc[i];
}
   for(int i=0;i<clé2.length();i++)
{
cléi[i]=(int)keyc[i];
}  for(int i=0;i<255;i++)
{
s[i]=i;
k[i]=cléi[i%clé2.length()];
}
int j=0;
for(int i=0;i<255;i++)
{
j=(j+s[i]+k[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
}
int i=0;
j=0;
int z=0;
for(int l=0;l<text1.length();l++)
{
i=(l+1)%256;
j=(j+s[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
z=s[(s[i]+s[j])%256];
cipher[l]=z^text1i[l];
decrypt[l]=z^cipher[l];  }
 display2(decrypt);
 /*try{
    // textd2.setText(null);
     
   display2(decrypt);
       
     
 }
       catch(Exception e){
       }     /**/try{ dechiffrer(textde, clé2);
      }catch(Exception e){          JOptionPane.showMessageDialog(null, " Un champ est vide ");
     }
        
        
// TODO add your handling code here:
        
    }//GEN-LAST:event_DécrypterActionPerformed

    private void crypterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crypterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crypterMouseClicked

    private void recevoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recevoirActionPerformed

        // TODO add your handling code here:
        String msgin="";

        try {
            msgin=din.readUTF();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Problème de connexion " );
        }
        textd.setText(msgin);//displaying the msg from client
    }//GEN-LAST:event_recevoirActionPerformed

    private void envoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerActionPerformed

        try {

            String msgout="";
            msgout=textd2.getText()/*.trim()*/;
            dout.writeUTF(msgout);//.println(msgout);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, " connecter au serveur / " +e.getMessage());
        }

    }//GEN-LAST:event_envoyerActionPerformed

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
            java.util.logging.Logger.getLogger(RC4_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RC4_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RC4_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RC4_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      
   
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RC4_Client().setVisible(true);
            }
        });
        
   
        /*try{String msgin = "";
        socke =new Socket("127.0.0.1",12);
         din=new    DataInputStream (socke.getInputStream());
     dout2=new  DataOutputStream(socke.getOutputStream());
    
     
        
        }    catch(Exception e){
      }*/
        
    /*  try{
          String msgin = "";
          
         
           
              serveur2=new ServerSocket(22);//server start at number 123
           soc=serveur2.accept();
               
         din=new    DataInputStream (soc.getInputStream());
     dout=new  DataOutputStream(soc.getOutputStream());
     
         msgin=din.readUTF();
           clé.setText(msgin);
      
        
        }    catch(Exception e){
      } */   
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Décrypter;
    private javax.swing.JButton clear;
    public static javax.swing.JTextField clé;
    private javax.swing.JLabel code;
    private javax.swing.JButton crypter;
    private javax.swing.JButton envoyer;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea jdech;
    private javax.swing.JLabel labb;
    private javax.swing.JScrollPane msgc;
    private javax.swing.JScrollPane msgchif;
    private javax.swing.JButton quiter;
    private javax.swing.JButton recevoir;
    private javax.swing.JTextArea textc;
    private javax.swing.JTextArea textd;
    private static javax.swing.JTextArea textd2;
    // End of variables declaration//GEN-END:variables
}
