package test;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class APP {
	public static void main(String[] args) {
		Mainframe f = new Mainframe(0);
		f.addWindowListener(new WindowAdapter()
				{
		   public void windowClosing(WindowEvent e)
		   {
		       System.exit(0);
		   }
				}
		   );  
	}
}
