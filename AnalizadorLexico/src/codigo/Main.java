/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;   
/**
 *
 * @author angelarturo
 */
public class Main {
    public static void main(String[] args) {

        String directorio =     "/home/angelarturo/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.flex";
        generateLexer(directorio);
        
    }
    public static void generateLexer(String directorio)
    {
        MainFrame m = new MainFrame();
        File archive = new File (directorio);
        JFlex.Main.generate(archive);
    }
}
