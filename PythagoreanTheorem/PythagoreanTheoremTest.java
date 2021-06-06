public class PythagoreanTheoremTest {
    public static void main(String[] args){
        int legA = 4;
        int legB = 6;
        PythagoreanTheorem legC = new PythagoreanTheorem();
        double missingSide = legC.calculateHypotenuse(legA, legB);
        System.out.println("The length of the hypotenuse is: " + missingSide);
    }
}
