/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4gui;

import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author FX506
 */
public class Calculadora {

    public static void main(String[] args) {
        
        JFrame ventanaPrincipal = new JFrame("Aplicación");

        
        ventanaPrincipal.setLocationRelativeTo(null);

        ventanaPrincipal.add(new Disenio());
        
        ventanaPrincipal.pack();
        
        ventanaPrincipal.setVisible(true);

        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
