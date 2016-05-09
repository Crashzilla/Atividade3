package Atividade3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.swing.JOptionPane;

public class Criptografo {
	
	public static void main (String[] Args){
	
		StringBuilder mensagem = new StringBuilder(JOptionPane.showInputDialog("Digite o texto a ser criptografado."));
		Writer writer = null;
		
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("mesagemDecodificada.txt"), "utf-8"));
		    writer.append(mensagem);
		} catch (IOException ex) {
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
		
		for (int i=0; i<mensagem.length(); i++){
			
			int incr = (int) mensagem.charAt(i);
			incr++;
			char ascii = (char) incr;
			mensagem.setCharAt(i, ascii);
		}
		
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("mensagemCodificada.txt"), "utf-8"));
		    writer.append(mensagem);
		} catch (IOException ex) {
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
}
