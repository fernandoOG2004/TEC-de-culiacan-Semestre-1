package guiLayer;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class telefonoTextField extends JTextField {

    private static final long serialVersionUID = 1L;
    private static final int MAX_DIGITS = 10;

    public telefonoTextField() {
        super();

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                
                if (!Character.isDigit(c) || getDigits().length() >= MAX_DIGITS) {
                    e.consume(); 
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    manejoborrado();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (getDigits().length() == MAX_DIGITS) {
                    formatPhoneNumber();
                }
                validardigitos();
            }
        });
    }

    private String getDigits() {
        return getText().replaceAll("\\D", ""); 
    }

    private void formatPhoneNumber() {
        String digitos = getDigits();

        StringBuilder formattedNumber = new StringBuilder();
        int len = digitos.length();

        for (int i = 0; i < len; i++) {
            formattedNumber.append(digitos.charAt(i));
            if (i == 2 || i == 5 || i == 7) {
                formattedNumber.append('-');
            }
        }

        setText(formattedNumber.toString());
    }

    private void manejoborrado() {
        int caretPosition = getCaretPosition();
        
        if (caretPosition > 0 && getText().charAt(caretPosition - 1) == '-') {
            setCaretPosition(caretPosition - 1);
        }
    }

    private void validardigitos() {
        if (getDigits().length() == MAX_DIGITS) {
            setBackground(Color.WHITE);  
        } else {
            setBackground(Color.RED);    
        }
    }
}