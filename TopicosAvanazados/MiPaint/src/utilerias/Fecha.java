package utilerias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Fecha extends JLabel{
	private static final long serialVersionUID = 1L;

	public Fecha() {
		super();
		Timer t = new Timer(100, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setText(ActualizaHora());
			}
			
		});
		t.start();
	}
	
	private String ActualizaHora() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(cal.getTime());
	}
}