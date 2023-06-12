package com.principal;

//En Interfaces, el MA en Atributos y Métodos es siempre public, excepto en los métodos static, ahí pueden ser private.
public interface IDibujo {
	
	/* 
	ATRIBUTOS: 
	Todos públicos y CONSTANTES. Se obvia el "public static final". No es que tenga modificador de acceso por defecto, ojo.
	*/	
	String PALABRA_1 = "todos";
	public static final String PALABRA_2 = "todos";

	/*
	METODOS:
	 1. Sin cuerpo:
	 	1.1 Públicos y Abstractos. Se obvia el "public abstract". Obligatoria implementación.
	 	
	 2. Con cuerpo: 
	    - Desde Java 8, las interfaces pueden tener métodos con cuerpo. 
	    - Se obvia el "public". 

	 	2.1 Por defecto (default): 
	 		- No es obligatoria la implementación, en contraparte con los métodos public abstract.
	 		- Se usan para agregar funcionalidad adicional a las interfaces existentes sin romper la compatibilidad
	 		  hacia atrás y para evitar la duplicación de código.
	 		  
		2.2 Static (Los métodos static en Java NO se pueden SOBRESCRIBIR): 
			- La clase que implementa la interface No puede implementar estos métodos, ya que no se puede sobrescribir,
			  ie, no hay @Override.
			- Proporcionar funcionalidad asociada a la interfaz y métodos comunes y reutilizables. Se llama al método
			  directamente con el nombre de la interface.
			- Pueden tener MA private.
	 */	
	
	void cantar();
	public abstract void cantar2();
	
	
	void correr();
	public abstract void correr2();

	
	default void escribir() {
		System.out.println("Escribiendo");
	}

	public default void escribir2() {
		System.out.println("Escribiendo");
	}
	
	
	static void bailar() {
		System.out.println("Bailando");
	}
	
	public static void bailar2() {
		System.out.println("Bailando");
	}
	

}
