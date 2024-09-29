package TP11;

class MaDate {
	private int jours;
	private int mois;
	private int annee;

public MaDate (int jours, int mois, int annee) {
	this.jours=jours;
	this.mois=mois;
	this.annee=annee;
}
public MaDate(int annee){
	this.annee=annee;
}
int getJours() {
	return jours;
}
int getMois() {
	return mois;
}
int getAnnee() {
	return annee;
}
void setJours(int jours) {
	this.jours=jours;
}
void setMois(int mois) {
	this.mois=mois;
}
void setAnnee(int annee) {
	this.annee=annee;
}
public String toString(){
	return jours+"/"+mois+"/"+annee;
}
MaDate ajouterUnJour() {
	jours++;
	if (jours == 32) {
		mois ++;
		jours=1;
		if (mois == 13) { 
            mois = 1;
            annee++;
        }
	}
	if (jours == 31 && (mois == 4 || mois == 6 || mois == 9 || mois == 11)) {
		mois++;
		jours=1;
	}
	if (mois == 2 ) {
		int a=annee%4;
		int b=annee%100;
		int c=annee%400;
		int d = 0;
		if (a == 0) {
            if (b != 0 || c == 0) {
                d=1;
            }
        }
		if ((d==1 && jours == 30) || (d==0 && jours==29)) {
			mois ++;
			jours=1;
		}
	}
return this;
}
void ajouterPlusieursjours(int n) {
	for (int i=0;i<n;i++) {
		ajouterUnJour();
	}
}
MaDate ajouterUnMois() {
	mois++;
	if (mois == 13) {
		mois = 1;
		annee++;
		jours = 1;
	}
	return this;
}
MaDate ajouterUnAn() {
	annee++;
	return this;
}
}
