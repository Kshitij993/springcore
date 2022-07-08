package com.kshitij.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {
	private Properties countriesAndLangs;

	@Override
	public String toString() {
		return "CountriesAndLanguages [countriesAndLangs=" + countriesAndLangs + "]";
	}

	public Properties getCountriesAndLangs() {
		return countriesAndLangs;
	}

	public void setCountriesAndLangs(Properties countriesAndLangs) {
		this.countriesAndLangs = countriesAndLangs;
	}

}
