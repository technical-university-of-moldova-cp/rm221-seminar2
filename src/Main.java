

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Jet jet = new Jet(50, 100, 200);
        System.out.println(jet);
    jet.simulate(Weather.SUN);
        System.out.println(jet);
        jet.simulate(Weather.FOG);
        System.out.println(jet);
    }
}