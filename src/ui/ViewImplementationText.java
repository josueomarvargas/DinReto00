package ui;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Implementación de view con la UI por terminal
 *
 * @author yeguo
 */
public class ViewImplementationText implements View {

    @Override
    public void showGreeting(String text) {
        System.out.println(text);
    }

}
