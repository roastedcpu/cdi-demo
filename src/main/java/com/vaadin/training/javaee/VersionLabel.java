package com.vaadin.training.javaee;

import com.vaadin.cdi.UIScoped;
import com.vaadin.ui.Label;

// We are making this UIScoped so that both views can share the same
// component instance. NormalUIScoped cannot be used for Vaadin components.
// You can change this to be e.g. @Dependent and see how behavior of the
// application changes.
@UIScoped
public class VersionLabel extends Label {

	public VersionLabel() {
		super("version 0.0");
		setDescription("This label is UI scoped, the setting version in login view is visible also main view");
	}
}
