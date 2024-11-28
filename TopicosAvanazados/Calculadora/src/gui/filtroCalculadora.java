package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.DocumentFilter.FilterBypass;

public class filtroCalculadora extends JTextField implements KeyListener {
    
    private static final long serialVersionUID = 1L;

    public filtroCalculadora() {
        ((AbstractDocument) this.getDocument()).setDocumentFilter(new FiltroNumerico());
        addKeyListener(this); // Agrega KeyListener a este campo de texto
    }

    private class FiltroNumerico extends DocumentFilter {
        @Override
        public void insertString(FilterBypass accesoFiltro, int desplazamiento, String cadena, AttributeSet atributos) throws BadLocationException {
            if (cadena == null) {
                return;
            }
            if (esNumero(cadena)) {
                super.insertString(accesoFiltro, desplazamiento, cadena, atributos);
            }
        }

        @Override
        public void replace(FilterBypass accesoFiltro, int desplazamiento, int longitud, String texto, AttributeSet atributos) throws BadLocationException {
            String textoActual = accesoFiltro.getDocument().getText(0, accesoFiltro.getDocument().getLength());
            String nuevoTexto = textoActual.substring(0, desplazamiento) + texto + textoActual.substring(desplazamiento + longitud);

            if (nuevoTexto.matches("-?\\d*\\.?\\d*")) {
                super.replace(accesoFiltro, desplazamiento, longitud, texto, atributos);	
            }
        }

        @Override
        public void remove(FilterBypass accesoFiltro, int desplazamiento, int longitud) throws BadLocationException {
            super.remove(accesoFiltro, desplazamiento, longitud);
        }

        private boolean esNumero(String texto) {
            // Permite dígitos, punto decimal y un único signo negativo al inicio
            return texto.matches("[0-9]*\\.?[0-9]*");
        }
    }

    @Override
    public void keyTyped(KeyEvent evento) {
        FrmMain.TeclaPresionada(evento); // Llama al método estático de FrmMain
    }

    @Override
    public void keyPressed(KeyEvent evento) {
        // Opcionalmente maneja eventos de tecla presionada
    }

    @Override
    public void keyReleased(KeyEvent evento) {
        // Opcionalmente maneja eventos de tecla liberada
    }
}