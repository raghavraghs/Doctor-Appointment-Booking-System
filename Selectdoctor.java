/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinedoctorappointmentsystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import static onlinedoctorappointmentsystem.ManageProfile.user1;

/**
 *
 * @author raghavendhra
 */
public class Selectdoctor extends javax.swing.JFrame {

    /**
     * Creates new form Selectdoctory
     */
    public Selectdoctor() {
        initComponents();
        int x =50,y=20;
        String docname1 =Specilization.docname;
        String name,gender,time;
        int amount;
       JLabel[] array = new JLabel[10];
       JLabel name1 = new JLabel();
//        for(int i=0;i<10;i++)
//        {
//            array[i] = new JLabel("raghs"+i);
//            array[i].setText("i"+i);
//            this.add(array[i]);
//            array[i].setOpaque(true);
//            array[i].setBounds(x, y, 40, 40);
//           // array[i].setBackground(Color.CYAN);
//            //array[i].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
//            x += 140;
//
//           // System.out.println(array[i].toString());
//        }
        try {
           Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorappointment","raghs","root");
                Statement stmt=conn.createStatement();  
                //stmt.executeQuery("use doctorappointment");
                //ResultSet rs=stmt.executeQuery("select * from user");
                //System.out.println(user1 + "MP");
                ResultSet rp = stmt.executeQuery("select * from doctor where specailization='"+docname1+"'");
                ///rp.next();
              // System.out.println(rp.getString(4));
               //String gen = rp.getString(4);
                //conn.close();
                int i=0;
                while(rp.next())
                {
                    //System.out.println("hii");
                    array[i] = new JLabel("raghs"+i);
                    //array[i].setText("i"+i);
                    name1.setText(String.valueOf(rp.getString(2)));
                    this.add(name1);
                    // name1.setOpaque(true);
                     name1.setBounds(x, y, 120, 120);
                    // System.out.println(array[i].toString());
                     x+=100;
                    array[i].setText(String.valueOf(rp.getString(6)));
                    this.add(array[i]);
                     array[i].setOpaque(true);
                     array[i].setBounds(x, y, 140, 140);
                     x+=100;
                    array[i].setText(String.valueOf(rp.getString(3)));
//                    System.out.println(rp.getString(2));
//                    System.out.println(rp.getString(3));
//                    System.out.println(rp.getString(6));
                    this.add(array[i]);
                    array[i].setOpaque(true);
                    array[i].setBounds(x, y, 200, 200);
                    
                  //amount.setText(String.valueOf(rp.getString(7)));
                  //.setText(String.valueOf(rp.getString(2)));
                  x+=40;
                  i++;
                }
                  conn.close();
        }
         catch (Exception e) {
                    e.printStackTrace();
		}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selectdoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}