package Ex1;

public class Birch extends Deciduous{

    public Birch(int age, boolean leaves) {
        super(age, leaves);
    }
    @Override
    public void canBlossom(){
        super.canBlossom();
        System.out.println("Источает аллергены");

    }
}
