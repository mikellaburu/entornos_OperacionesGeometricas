package com.zubiri.geometria;

public class Rectangulo {
	//atribututos
		private double base=0;
		private double altura=0;
		
		//getters
		public double getBase(){
			return this.base;
		}
		public double getAltura(){
			return this.altura;
		}
		
		
		//setters
		public void setBase(double x){
			this.base=x;
		}
		public void setAltura(double y){
			this.altura=y;
		}
		
		//calcula area
		public double calculaArea(){
			return this.getAltura()*this.getBase();
		}
		
		//calcular perimetro
		public double calculaPerimetro(){
			return this.getAltura()*2+this.getBase()*2;
		}
		
}
