package aplicacion;

import dataLayer.DBConexion;
import guiLayer.MainFrame;

public class AppAccesoDatos {

	public static void main(String[] args) {
		
		MainFrame ventana = new MainFrame();
		ventana.setVisible(true);
		
		DBConexion.GetConnection();
		
	}
}