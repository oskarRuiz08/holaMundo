/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.main;

import edu.jdc.modelo.Model;
import edu.jdc.vista.View;
import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class Banco {
    public static void main(String[] args) {
        Model model = new Model();
        Scanner scanner = new Scanner(System.in);
        View view = new View(model, scanner);
        view.mostrarMenu();
    }
}
