package com.javieromar.agility;

import java.util.ArrayList;

/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
	// instance variables - replace the example below with your own
	private String			couleur;
	private int				or;

	private ArrayList<Epee>	epee;

	public int getOr() {
		return or;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setOr(int or) {
		this.or = or;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public ArrayList<Epee> getEpee() {
		return epee;
	}

	public void setEpee(ArrayList<Epee> epee) {
		this.epee = epee;
	}

	public void addEpee(Epee epee) {
		this.epee.add(epee);
	}

	/**
	 * Constructor for objects of class Dragon
	 */
	public Dragon(String couleur, int or) {
		// this.couleur = couleur;
		setCouleur(couleur);
		this.or = or;

		epee = new ArrayList<>();
	}

	public Dragon() {
		couleur = "red";
		or = 0;
	}

	/**
	 * An example of a method - replace this comment with your own
	 *
	 * @param y
	 *            a sample parameter for a method
	 * @return the sum of x and y
	 */
	public float temperatureSouffleDragon() {

		return 305.05f;
	}

	@Override
	public String toString() {
		return "Ma couleur est " + couleur + " et j'ai " + or + " pièces d'or";
	}

	public String parlerDeMesEpees() {
		return "J'ai " + epee.size() + " epees";
	}
}
