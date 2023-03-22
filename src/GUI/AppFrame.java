package GUI;
// package GUI;
// package comp_decomp;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import comp_decomp.decompressor;
import comp_decomp.compressor;

public class AppFrame extends JFrame implements ActionListener{
    JButton comp;
    JButton decomp;
    AppFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comp=new JButton("Select File to compress");
          comp.setBounds(200,100,200,30);
            comp.addActionListener(this);
        decomp=new JButton("Select File to decompress");
        decomp.setBounds(250,100,200,30);
         decomp.addActionListener(this);
        this.add(comp);
        this.add(decomp);

        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.GREEN);
        this.setVisible(true);
    }
    @Override
    public  void actionPerformed(ActionEvent e){
if(e.getSource()==comp){
  JFileChooser fileChooser=new JFileChooser();
  int response=fileChooser.showSaveDialog(null);
  if(response==JFileChooser.APPROVE_OPTION){
    File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
    System.out.print(file);
    try{
      compressor.method(file);
    }
    catch(Exception ee){
      JOptionPane.showMessageDialog(null,ee.toString());
    }
  }
}
if(e.getSource()==decomp){
  JFileChooser fileChooser=new JFileChooser();
  int response=fileChooser.showSaveDialog(null);
  if(response==JFileChooser.APPROVE_OPTION){
    File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
    System.out.print(file);
    try{
    //  decomp.method(file);
     decompressor.method(file);
    }
    catch(Exception ee){
      JOptionPane.showMessageDialog(null,ee.toString());
    }
  }
}
    }
}
