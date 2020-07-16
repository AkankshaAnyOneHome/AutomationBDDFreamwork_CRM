package managers;

import org.openqa.selenium.WebDriver;

import CRMPages.CRMDashboardCreateEventPage;

import CRMPages.CRMLeadPage;

import CRMPages.CRMPropertiesPage;

import CRMPages.CRMLoginPage;



public class PageObjectManager {
	private WebDriver driver;

	private CRMLoginPage crmLoginPage;

	private CRMLeadPage crmLeadPage;

	private CRMPropertiesPage crmPropertiesPage;

	private CRMDashboardCreateEventPage crmDashboardCreateEventPage;

	

	

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	public CRMLoginPage getCRMLoginPage(){

		return (crmLoginPage == null) ? crmLoginPage = new CRMLoginPage(driver) : crmLoginPage;
	}

	

	public CRMLeadPage getCRMLeadPage() {

		return (crmLeadPage == null) ? crmLeadPage = new CRMLeadPage(driver) : crmLeadPage;
	}

	

	public CRMPropertiesPage getCRMPropertiesPage() {

		return (crmPropertiesPage == null) ? crmPropertiesPage = new CRMPropertiesPage(driver) : crmPropertiesPage;

	}

	

	public CRMDashboardCreateEventPage getCRMDashboardCreateEventPage() {

		return (crmDashboardCreateEventPage == null) ? crmDashboardCreateEventPage = new CRMDashboardCreateEventPage(driver) : crmDashboardCreateEventPage;

	}
	
}
