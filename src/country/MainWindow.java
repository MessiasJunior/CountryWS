package country;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;
import java.rmi.RemoteException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.swing.JComboBox;
//import javax.swing.JFormattedTextField;
//import javax.swing.JFrame;
//import javax.swing.JPanel;

import org.oorsprong.www.websamples_countryinfo.CountryInfoServiceSoapTypeProxy;
import org.oorsprong.www.websamples_countryinfo.TCurrency;

//import country.ItemCountry;


public class MainWindow {

//	private JFrame frame;
//	private JFormattedTextField textDataInicial;
//	private JFormattedTextField textDataFinal;
//	private JPanel panelChart;
//	private JComboBox comboCode;
//	private JComboBox comboFunc;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainWindow window = new MainWindow();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	/* private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u00CDndices paises");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		
	} */
	
	private String getCode() {
		/*if(this.comboCode.getSelectedItem().equals("Brasil")) {
			return ("BR");
		} else if(this.comboCode.getSelectedItem().equals("Japão")) {
			return ("JP");
		} else {
			return ("");
		} */ 
		return ("BR");
	}
	
	private void getFunc() {
		CountryInfoServiceSoapTypeProxy ws = new CountryInfoServiceSoapTypeProxy();
//		List<ItemCountry> value = new ArrayList<ItemCountry>();

//		if(this.comboFunc.getSelectedItem().equals("Capital")) {
			try {
				String capital = ws.capitalCity(getCode());
				System.out.println(capital);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} else if(this.comboFunc.getSelectedItem().equals("Moeda")) {
			try {
				TCurrency currency = ws.countryCurrency(getCode());
//				value.add(new ItemCountry(currency.getSISOCode(), currency.getSName()));
				System.out.println(currency.getSName());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} else {
			return;
//		}
	}
	
}


