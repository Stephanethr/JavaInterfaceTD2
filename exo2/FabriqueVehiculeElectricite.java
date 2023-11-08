package JavaInterfaceTD2.exo2;

public class FabriqueVehiculeElectricite implements FabriqueVehicule {
    public Automobile creerAutomobile(String modele, int puissance, String couleur, int espace){
        return new AutomobileElectricite(modele, puissance, couleur, espace);
    }
    public Scooter creerScooter(String modele, int puissance, String couleur, int espace){
        return new ScooterElectrique(modele, puissance, couleur, espace);
    }
}
