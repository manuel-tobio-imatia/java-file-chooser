package com.imatia.elastic;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.imatia.elastic.frames.AppMainPanel;

/**
 * @author Manuel Tobio
 *
 *         Params:
 *
 *         <li>-lookAndFeel: specify the look and feel class to load
 *
 */
public class App {

	public static final String ARGS_LOOK_AND_FEEL = "-lookandfeel";

	public static void main(String[] args) {

		String lookAndFeelClass = App.getParamLookAndFeel(args);

		JFrame menu = AppMainPanel.getInstance(lookAndFeelClass);

		menu.pack();
		menu.setLocationRelativeTo(null);
		menu.setVisible(true);
	}

	protected static String getParamLookAndFeel(String[] args) {

		String lookAndFeelClass = UIManager.getLookAndFeel().getClass().getName();
		if (args.length > 1) {

			boolean next = false;
			for (String arg : args) {

				if (next) {
					lookAndFeelClass = arg;
					break;
				}
				if (App.ARGS_LOOK_AND_FEEL.equalsIgnoreCase(arg)) {
					next = true;
				}
			}
		}
		return lookAndFeelClass;
	}
}
