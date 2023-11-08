package JavaInterfaceTD2.exo3;

public class Calculatrice extends Affichage implements Operation {
    public Object addition(Object a, Object b){
            return (Integer) a + (Integer) b;
    }
    
    public Object soustraction(Object a, Object b){
            return (Integer) a - (Integer) b;
    }
    
    public Object multiplication(Object a, Object b){
            return (Integer) a * (Integer) b;
    }
    
    public Object division(Object a, Object b){
            return (Integer) a / (Integer) b;

    }

    public void afficher(Object a, Object b){
        System.out.println(addition(a,b));
        System.out.println(soustraction(a,b));
        System.out.println(multiplication(a,b));
        System.out.println(division(a,b));
    }
}
