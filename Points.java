/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package points;

/**
 *
 * @author BHARATHKUMAR
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


        


class Points extends Frame {
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        for(;;)
        {
            int x=(int)(Math.random()*800);
            int y=(int)(Math.random()*600);
            g.drawLine(x, y, x, y);
            try{
                Thread.sleep(20);
            }catch(InterruptedException ie){}
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Points obj=new Points();
        obj.setBackground(Color.black);
        obj.setSize(500,400);
        obj.setTitle("Random dots");
        obj.setVisible(true);
        
        // TODO code application logic here
    }
    
}
