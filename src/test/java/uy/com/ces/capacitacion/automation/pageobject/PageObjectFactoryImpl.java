package uy.com.ces.capacitacion.automation.pageobject;

import uy.com.ces.capacitacion.automation.selenium.DriverManager;

public class PageObjectFactoryImpl implements PageObjectFactory {

	@Override
	public CapacitacionCes factoryCapacitacionCes(DriverManager driverManager) {
		return driverManager.factoryElements(new CapacitacionCesImpl(driverManager));
	}

	@Override
	public GoogleGmail factoryGoogleGmail(DriverManager driverManager) {
		return driverManager.factoryElements(new GoogleGmailImpl(driverManager));
	}

	@Override
	public GoogleSearch factoryGoogleSearch(DriverManager driverManager) {
		return driverManager.factoryElements(new GoogleSearchImpl(driverManager));
	}

}
