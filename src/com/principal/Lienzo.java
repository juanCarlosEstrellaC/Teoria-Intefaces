package com.principal;

public class Lienzo implements IDibujo{
	
	Lienzo name = new Lienzo();
	

	@Override
	public void cantar() {
		// Es un método
		
	}

	@Override
	public void cantar2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correr() {
		// TODO jklsd
		
	}

	@Override
	public void correr2() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void escribir() {
		// TODO significa TO DO, o la lista para hacer.
		IDibujo.super.escribir();
		
		// Llamando al método static bailar().
		IDibujo.bailar();
	}
	
	//No puede sobrescribir a bailar, por ser static.
	
}
