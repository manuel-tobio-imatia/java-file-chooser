package com.imatia.elastic.frames;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.imatia.elastic.utils.Constants;

public class AppMenu extends JMenu {

	private static final long serialVersionUID = 1L;

	protected AppMenu(Map<String, Object> params) {
		super(Constants.MENU);

		this.init(params);

		this.addActionListeners();
	}

	public static AppMenu newInstance(Map<String, Object> params) {
		return new AppMenu(params);
	}

	protected void init(Map<String, Object> params) {

		List<JMenuItem> menuItems = this.createMenuItems();
		for (JMenuItem menuItem : menuItems) {
			this.add(menuItem);
		}
	}

	protected List<JMenuItem> createMenuItems() {

		List<JMenuItem> menuItems = new ArrayList<>();

		return menuItems;
	}

	protected void addActionListeners() {

	}

}
