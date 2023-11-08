package JavaInterfaceTD2.exo2;

public class FabriqueVehiculeEssence implements FabriqueVehicule{
    public Automobile creerAutomobile(String modele, int puissance, String couleur, int espace){
        return new AutomobileEssence(modele, puissance, couleur, espace);
    }
    public Scooter creerScooter(String modele, int puissance, String couleur, int espace){
        return new ScooterEssence(modele, puissance, couleur, espace);
    }
}
