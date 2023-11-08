package JavaInterfaceTD2.exo2;

public class AutomobileEssence extends Automobile {
    public AutomobileEssence(String modele, int puissance, String couleur, int espace){
        this.modele = modele;
        this.puissance = puissance;
        this.couleur = couleur;
        this.espace = espace;
    }
    public void afficherCaracteristiques(){
        System.out.println("Automobile à essence de modèle " + modele + " de puissance " + puissance + " de couleur " + couleur + " d'espace " + espace);
    }
}
