package JavaInterfaceTD2.exo2;

public interface FabriqueVehicule {
    public Automobile creerAutomobile(String modele, int puissance, String couleur, int espace);
    public Scooter creerScooter(String modele, int puissance, String couleur, int espace);
}
