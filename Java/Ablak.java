package unikurzalisgraf;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author User
 */
public class Ablak extends javax.swing.JFrame {

    /**
     * Creates new form Ablak
     */
    boolean kesz=false;
    public Ablak() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kattintas(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void Kattintas(java.awt.event.MouseEvent evt) {                           
        // TODO add your handling code here:
        class Pont{
            public int x;
            public int y;
            public Pont(int x, int y){
                this.x=x;
                this.y=y;
            }
        }
        Pont[] pontok=new Pont[5];
        for(int i=0;i<pontok.length;i++){
            switch(i){
                case 0:
                    pontok[i]=new Pont(getWidth()/2,40);
                    break;
                case 1:
                    pontok[i]=new Pont(getWidth()/2-50,90);
                    break;
                case 2:
                    pontok[i]=new Pont(getWidth()/2+50,90);
                    break;
                case 3:
                    pontok[i]=new Pont(getWidth()/2-50,140);
                    break;
                case 4:
                    pontok[i]=new Pont(getWidth()/2+50,140);
                    break;                     
            }
        }
        Graphics rl=getGraphics();
        if(evt.getButton()==1){
            kesz=true;
            rl.setColor(Color.red);
            rl.fillOval(pontok[0].x, pontok[0].y, 10, 10);
            rl.fillOval(pontok[1].x, pontok[1].y, 10, 10);
            rl.fillOval(pontok[2].x, pontok[2].y, 10, 10);
            rl.fillOval(pontok[3].x, pontok[3].y, 10, 10);
            rl.fillOval(pontok[4].x, pontok[4].y, 10, 10);
        }
        if(evt.getButton()==3&&kesz){
            rl.setColor(new Color(255,255,0));
            rl.drawLine(pontok[0].x+5, pontok[0].y+5, pontok[1].x+5, pontok[1].y+5);
            rl.drawLine(pontok[1].x+5, pontok[1].y+5, pontok[2].x+5, pontok[2].y+5);
            rl.drawLine(pontok[2].x+5, pontok[2].y+5, pontok[3].x+5, pontok[3].y+5);
            rl.drawLine(pontok[3].x+5, pontok[3].y+5, pontok[4].x+5, pontok[4].y+5);
        }
        if(evt.getButton()==2&&kesz){
            rl.setColor(new Color(255,255,0));
            /*itt kell a megfelel� sorrendet haszn�lva �sszek�tni �gy a pontokat, hogy
            a mell�kelt �bra l�trej�jj�n �s minden �sszek�t�vonalon egyszer �s csakis
            egyszer, vagyis a ceruza felemel�se n�lk�l haladunk �t*/
            
        }
    }                          

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
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
