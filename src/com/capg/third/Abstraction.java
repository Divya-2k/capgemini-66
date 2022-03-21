package com.capg.third;

interface Elements{
	void Name();
	void Id();
}


//Laptop
abstract class Laptop1{
	abstract public void Name();
	public void Id(){
		System.out.println("Product id = 2435");
	}
}
class LaptopFeatures extends Laptop1 implements Elements{
	@Override
	public void Name() {
		System.out.println("HP");
	}
	
	public void OS() {
		System.out.println("Windows");
	}
}


//Mobile
abstract class Mobile1{
	abstract public void Name();
	//abstract public void Id();
	public void VoiceCall(){
		System.out.println("Voice calling");
	}
}
class Mobilefunctions extends Mobile1 implements Elements{
	@Override
	public void Id() {
		System.out.println("Product Id = 123");
	}
	@Override
	public void Name() {
		System.out.println("Samsung");
	}
	
	public void VideoCall() {
		System.out.println("Video calling");
	}

	public void SendSMS() {
		System.out.println("Sending SMS");
	}

}

//Student
abstract class StudentAbc {
	abstract public void Study();
	public void Name(){
		System.out.println("Bob");
	}
}
class Academic extends StudentAbc implements Elements{
	
	public void Study() {
		System.out.println("Study");
	}
	
	public void Play() {
		System.out.println("Play well");
	}
	
	@Override
	public void Id() {
		System.out.println("Student ID = 023");
	}

}

//Car
abstract class Car1{
	abstract public void Id();
	public void Model() {
		System.out.println("Model=2018");
	}
}
class CarFeatures extends Car1 implements Elements{
	@Override
	public void Name() {
		System.out.println("Swift");
		
	}
	public void Id() {
		System.out.println("Car id = 2435");
		
	}
	
	public void Mileage() {
		System.out.println("Mileage = 23km/l");
	}
	
	
}


//Driver
public class Abstraction {
	public static void main(String[] args) {
		System.out.println("Laptop");
		System.out.println("---------------------------------------------------");
		LaptopFeatures l=new LaptopFeatures();
		l.Name();
		l.Id();
		l.OS();
		
		System.out.println();
		System.out.println("Mobile");
		System.out.println("---------------------------------------------------");
		Mobilefunctions f=new Mobilefunctions();
		f.Name();
		f.Id();
		f.SendSMS();
		f.VideoCall();
		f.VoiceCall();
		
		System.out.println();
		System.out.println("Student Details");
		System.out.println("---------------------------------------------------");
		Academic s=new Academic();
		s.Name();
		s.Id();
		s.Study();
		s.Play();
		
		System.out.println();
		System.out.println("Car");
		System.out.println("---------------------------------------------------");
		CarFeatures c=new CarFeatures();
		c.Name();
		c.Id();
		c.Model();
		c.Mileage();
		
	}
}
