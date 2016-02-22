package com.carlos.avisamedelcoche.rs.filters;

public enum Recursos {

	ERRORES("Errores");

	private final String propertiesFile;

	private Recursos(String pFile) {
		this.propertiesFile = pFile;
	}

	public String getPropertiesFile() {
		return propertiesFile;
	}

}
