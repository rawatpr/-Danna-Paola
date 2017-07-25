package com.dana.animal;

public class Dog 
{

	public boolean bonitaPerrita;
	
	public boolean divertida;
	
	public String nivelDeInteligencia;
	
	public String definirPerrita(boolean bonitaPerrita1, boolean devertida1,String nivelDeInteligencia1)
	{
		if(bonitaPerrita1&&devertida1&&nivelDeInteligencia1.equals("MAXIMO"))
		{
			return "Muy Inteligente Y bonita";
		}
		{
			return "Fea y aburrida";
		}
	 	
	}
	
}
