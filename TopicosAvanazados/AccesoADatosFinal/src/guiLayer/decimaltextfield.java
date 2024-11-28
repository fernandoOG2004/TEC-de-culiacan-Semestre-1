package guiLayer;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class decimaltextfield extends JTextField {

    private static final long serialVersionUID = 1L;
    private final int maxIntegerDigits;
    private final int maxDecimalDigits;

    public decimaltextfield(int maxIntegerDigits, int maxDecimalDigits) {
        super();
        this.maxIntegerDigits = maxIntegerDigits;
        this.maxDecimalDigits = maxDecimalDigits;
        setHorizontalAlignment(SwingConstants.RIGHT); 

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = getText();

                // Permitir solo dígitos y un único punto decimal
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                    return;
                }

                if (c == '.' && text.contains(".")) {
                    e.consume();
                    return;
                }

                if (text.equals("0") && c != '.') {
                    e.consume();
                    return;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = getText();
                int decimalIndex = text.indexOf(".");

                if (decimalIndex == -1) { 
                    // Controla la longitud de la parte entera
                    if (text.length() > maxIntegerDigits) {
                        setText(text.substring(0, maxIntegerDigits));
                    }
                } else { 
                    // Controla la longitud de la parte decimal
                    if (decimalIndex > maxIntegerDigits) {
                        setText(text.substring(0, maxIntegerDigits) + text.substring(decimalIndex));
                    } else if (text.length() - decimalIndex - 1 > maxDecimalDigits) {
                        setText(text.substring(0, decimalIndex + maxDecimalDigits + 1));
                    }
                }
            }
        });
    }
}