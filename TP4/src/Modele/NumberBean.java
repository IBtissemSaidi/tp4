package Modele;
import java.math.*;
public class NumberBean {
	private  double x;
	/*private int nbalt;
	
	public NumberBean() {
		
	}
	public NumberBean(int nbalt) {
		setNbalt(0);
	}


	public int getNbalt() {
		return nbalt;
	}

	public void setNbalt(int nbalt) {
		this.nbalt = nbalt;
	}
	
	public int randomnumber(int nombrealeat) {
		return (int) (Math.random() * ( nombrealeat-nombrealeat  + 1)) + nombrealeat;
	}*/

	public NumberBean() {
		setX(0);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	public  double calculRandom(double x){
		return Math.random()*x;
	}
	
	
}
