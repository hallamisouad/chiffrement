
package server_poste_2;

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
import javax.swing.JOptionPane;
//import static poste1client.RC4_Client.clé;
//import static server_poste_2.Clientposte2.socke;
//import static poste2.RC4_Aclient.serveur;

/**
 char a='v'; 
ghString mot=Character.toString(a); 
@+*
 * @author toshiba
 */

public class RC4_Server extends javax.swing.JFrame {
    static ServerSocket serveur;
   static Socket socke,socket,c ;
  static   DataInputStream din,din2;
   static DataOutputStream  dout ,dout2;
    
int temp=0;

   String text1;
    String clé2; 
   String textde;
@Override
      public Dimension getPreferredSize() {
return new Dimension (500, 750); // largeur et hauteur préférées
}
         
      
 int s[]=new int[256];
int k[]=new int[256];


void display(int disp[])
        
{
  
char convert[]=new char[disp.length];
for(int l=0;l<disp.length;l++)
{
convert[l]=(char)disp[l];

String con=Character.toString(convert[l]);



     
System.out.print(con);
//textd.setText(con);
textd2.append(con);


 }}

void display2(int disp[])
        
{
  
char convert[]=new char[disp.length];
for(int l=0;l<disp.length;l++)
{
convert[l]=(char)disp[l];

String con=Character.toString(convert[l]);



     
System.out.print(con);
//textd.setText(con);
jcryp.append(con);


 }}
 /*public void chiffrer( String text1,String clé2){
      text1=tdechif.getText();
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
}*/
public void chiffrer( String text1,String clé2){
      text1=textd.getText();
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
    display2(cipher);
}

 public void dechiffrer(String textde,String clé2){
  textd2.setText(null);
       clé2=clé.getText(); 
      textde=textc.getText();
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
}
  
  public static void mserver(){
  
  
  
     try{String msgin = "";
         System.out.println("moi le srveur j'attends le client");
     /*  socke =new Socket("127.0.0.1",2005);
         din=new    DataInputStream (socke.getInputStream());*/
          
      serveur=new ServerSocket(2000);//server start at number 123
           socket=serveur.accept();
            din=new    DataInputStream (socket.getInputStream());
     dout=new  DataOutputStream(socket.getOutputStream());
    
       
     
        
       
          }   catch(Exception e){
              JOptionPane.showMessageDialog(null, " attendez le client / " +e.getMessage());
      }
  }
  
  
 public static void mrecue(){
 
 String msgin="";
        
        try {
            msgin=din.readUTF();
        } catch (IOException ex) {
            Logger.getLogger(RC4_Server.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Problème de connexion  " );
            
        }
         textc.setText(msgin);//displaying the msg from client
 }
 
    
    public RC4_Server() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crypter = new komponenMakeOver.buttonMakeOver();
        envoyer = new komponenMakeOver.buttonMakeOver();
        dech = new javax.swing.JScrollPane();
        jcryp = new javax.swing.JTextArea();
        msenv = new javax.swing.JScrollPane();
        textd = new javax.swing.JTextArea();
        décrypter = new komponenMakeOver.buttonMakeOver();
        clé = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textd2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        clear = new komponenMakeOver.buttonMakeOver();
        quiter = new komponenMakeOver.buttonMakeOver();
        jScrollPane1 = new javax.swing.JScrollPane();
        textc = new javax.swing.JTextArea();
        recue = new komponenMakeOver.buttonMakeOver();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        connect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RC4_poste_2(server)");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(735, 580));
        getContentPane().setLayout(null);

        crypter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crypter.setForeground(new java.awt.Color(255, 255, 255));
        crypter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32fermer.png"))); // NOI18N
        crypter.setText("Crypter");
        crypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crypterActionPerformed(evt);
            }
        });
        getContentPane().add(crypter);
        crypter.setBounds(40, 620, 140, 50);

        envoyer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        envoyer.setForeground(new java.awt.Color(255, 255, 255));
        envoyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Email-Reply-icon.png"))); // NOI18N
        envoyer.setText("Envoyer");
        envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerActionPerformed(evt);
            }
        });
        getContentPane().add(envoyer);
        envoyer.setBounds(410, 620, 130, 50);

        jcryp.setColumns(20);
        jcryp.setRows(5);
        jcryp.setBorder(javax.swing.BorderFactory.createTitledBorder("Envoyer le cryptogramme"));
        dech.setViewportView(jcryp);

        getContentPane().add(dech);
        dech.setBounds(390, 400, 310, 200);

        textd.setColumns(20);
        textd.setRows(5);
        textd.setBorder(javax.swing.BorderFactory.createTitledBorder("Saisir et crypter le Message"));
        msenv.setViewportView(textd);

        getContentPane().add(msenv);
        msenv.setBounds(30, 400, 330, 200);

        décrypter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        décrypter.setForeground(new java.awt.Color(255, 255, 255));
        décrypter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32open.png"))); // NOI18N
        décrypter.setText("Décrypter");
        décrypter.setToolTipText("déchiffrer le cryptogramme envoyer par  la station 1");
        décrypter.setBorder(null);
        décrypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                décrypterActionPerformed(evt);
            }
        });
        getContentPane().add(décrypter);
        décrypter.setBounds(560, 340, 140, 50);

        clé.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cléActionPerformed(evt);
            }
        });
        getContentPane().add(clé);
        clé.setBounds(230, 30, 320, 60);

        textd2.setColumns(20);
        textd2.setRows(5);
        textd2.setBorder(javax.swing.BorderFactory.createTitledBorder("Décrypter le message recue"));
        jScrollPane2.setViewportView(textd2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(390, 140, 320, 190);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("La Clé");
        jLabel1.setToolTipText("on a generer cette  clé a l'aide de Deffie Hellman");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 50, 90, 20);

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Corbeille-vide-1-icon.pngjllk.png"))); // NOI18N
        clear.setText("Vider");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(220, 620, 130, 50);

        quiter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quiter.setForeground(new java.awt.Color(255, 255, 255));
        quiter.setText("Déconnecter");
        quiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiterActionPerformed(evt);
            }
        });
        getContentPane().add(quiter);
        quiter.setBounds(580, 620, 120, 50);

        textc.setColumns(20);
        textc.setRows(5);
        textc.setBorder(javax.swing.BorderFactory.createTitledBorder(" receveoir le message crypter "));
        jScrollPane1.setViewportView(textc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 320, 190);

        recue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recue.setForeground(new java.awt.Color(255, 255, 255));
        recue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Email-Download-icon.png"))); // NOI18N
        recue.setText("recevoir");
        recue.setToolTipText("cliquer pour recevoir le message chiffrer");
        recue.setBorder(null);
        recue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recue.setFocusPainted(false);
        recue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recueActionPerformed(evt);
            }
        });
        getContentPane().add(recue);
        recue.setBounds(220, 340, 130, 50);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("RC4");
        jLabel5.setToolTipText("RC4  c'est un algorithme de chiffremnt symétrique (par flux)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 20, 70, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/light_texture2295.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -10, 740, 730);

        connect.setText("connecter");
        connect.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                connectAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(connect);
        connect.setBounds(20, 60, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cléActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cléActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cléActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
       textd2.setText(null); 
                textc.setText(null); 
                     //clé.setText(null);
                       textd.setText(null);   jcryp.setText(null); 
    }//GEN-LAST:event_clearActionPerformed

    private void quiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiterActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_quiterActionPerformed

    private void décrypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_décrypterActionPerformed

        // TODO add your handling code here:

        try{

            dechiffrer( textde, clé2);

        }
        catch(Exception e){
JOptionPane.showMessageDialog(null, " Attention un champ est vide  " );
        }
    }//GEN-LAST:event_décrypterActionPerformed

    private void recueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recueActionPerformed
        // TODO add your handling code here:
        mrecue();
        
    }//GEN-LAST:event_recueActionPerformed

    private void connectAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_connectAncestorAdded
        // TODO add your handling code here:
        
        //c'est une label connect (voir le navigater)
        mserver();
    }//GEN-LAST:event_connectAncestorAdded

    private void crypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crypterActionPerformed
try{        // TODO add your handling code here:
        chiffrer( text1, clé2);}
catch(Exception e){JOptionPane.showMessageDialog(null, " Attention un champ est vide ");
}
    }//GEN-LAST:event_crypterActionPerformed

    private void envoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerActionPerformed
 try {
                       
              String msgout="";
        msgout=jcryp.getText()/*.trim()*/;
              dout.writeUTF(msgout);//.println(msgout);
          } catch (IOException e) {
       JOptionPane.showMessageDialog(null, " Problème de connexion " );
          }
                  // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(RC4_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RC4_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RC4_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RC4_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RC4_Server().setVisible(true);
                
                
            }
        }); 
       
           
               
   
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    public static javax.swing.JTextField clé;
    private javax.swing.JLabel connect;
    private javax.swing.JButton crypter;
    private javax.swing.JScrollPane dech;
    private javax.swing.JButton décrypter;
    private javax.swing.JButton envoyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jcryp;
    private javax.swing.JScrollPane msenv;
    private javax.swing.JButton quiter;
    private javax.swing.JButton recue;
    private static javax.swing.JTextArea textc;
    private javax.swing.JTextArea textd;
    private static javax.swing.JTextArea textd2;
    // End of variables declaration//GEN-END:variables
}
