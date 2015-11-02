package guiDemo;

//USES "FileDumper" CLASS

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFileChooserDemo {

	final JFrame frame;
	final FileDumper f;

	public JFileChooserDemo() {
		f = new FileDumper();
		frame = new JFrame("JFileChooser Demo");
		initUI();
	}

	public final void initUI() {
		JMenuBar menubar = setUpMenus();
		setUpFrame(menubar);
	}

	public JMenuBar setUpMenus() {
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);

		// instance variables are only visible inside anonymous classes if they
		// are final
		final JFileChooser fc = new JFileChooser();

		// allow multiple selections. Don't use with Save As... !
		fc.setMultiSelectionEnabled(true);

		JMenuItem fMenuItem = new JMenuItem("Open");
		fMenuItem.setMnemonic(KeyEvent.VK_O);
		fMenuItem.setToolTipText("Open A File");
		fMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int retVal = fc.showOpenDialog(frame);
				if (retVal == JFileChooser.APPROVE_OPTION) {
					File[] selectedfiles = fc.getSelectedFiles();
					for (int i = 0; i < selectedfiles.length; i++) {
						f.readFileToSystemOut(selectedfiles[i]);
					}
				}
			}
		});

		JMenuItem eMenuItem = new JMenuItem("Exit");
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		file.add(fMenuItem);
		file.add(eMenuItem);
		menubar.add(file);
		return menubar;
	}

	private void setUpFrame(JMenuBar menubar) {
		frame.setJMenuBar(menubar);
		frame.setTitle("Simple menu");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		JFileChooserDemo ex = new JFileChooserDemo();
	}
}

