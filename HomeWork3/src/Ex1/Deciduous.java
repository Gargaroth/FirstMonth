package Ex1;

public class Deciduous extends Tree{
    public boolean leaves;


    public Deciduous(int age, boolean leaves) {
        super(age);
        this.leaves = leaves;
    }

    public void canFall(){
        System.out.println("Листья опадают");

    }

    public void canBlossom(){
        System.out.println("Листья появляются");

    }
}


