public class Test {
    public static void main(String[] args) {
        Steel steel=new Steel();
        Sword<Steel> steelSword=new Sword<>(steel);
        System.out.println(steelSword.checkEndurance());

        Copper copper=new Copper();
        Sword<Copper> copperSword=new Sword<>(copper);
        System.out.println(copperSword.checkEndurance());

        Iron iron=new Iron();
        Sword<Iron> ironSword=new Sword<>(iron);
        System.out.println(ironSword.checkEndurance());

    }
}
