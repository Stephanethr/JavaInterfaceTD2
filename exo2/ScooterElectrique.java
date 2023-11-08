package JavaInterfaceTD2.exo2;

public class ScooterElectrique extends Scooter{
    public ScooterElectrique(String modele, int puissance, String couleur, int espace){
        this.modele = modele;
        this.puissance = puissance;
        this.couleur = couleur;
        this.espace = espace;
    }
    public void afficherCaracteristiques(){
        System.out.println("Scooter électrique de modèle " + modele + " de puissance " + puissance + " de couleur " + couleur + " d'espace " + espace);
    }
}
