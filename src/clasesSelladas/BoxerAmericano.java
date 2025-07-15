package clasesSelladas;


// The class `BoxerAmericano` must not be declared `final` or `non-sealed`
// because it extends `Boxer`, which is already declared `non-sealed`.
public class BoxerAmericano extends Boxer{
    public BoxerAmericano(int estatura, double peso, String raza){
        super(estatura, peso, raza);
    }
}
