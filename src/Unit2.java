public class Unit2 {

    public void calculus() {
        System.out.println("");
        String calc[] = {"Differentiation", "Integrals", "Differential Equations", "Parametric Equations", "Infinite Sequences and Series"};

        System.out.println("The books available Calculus are: ");
        for (int a=0; a< calc.length; a++) {

            System.out.println(calc[a]);
        }
    }

    public void physics() {
        System.out.println("");
        String phys[] = {"Thermodynamics", "Electric Circuits", "Electromagnetism", "Optics", "Quantum Physics"};

        System.out.println("The books available in Physics are: ");
        for (int b=0; b< phys.length; b++) {

            System.out.println(phys[b]);
        }
    }

    public void chemistry() {
        System.out.println("");
        String chem[] = {"Molecular and Ionic Compounds", "Intermolecular Forces", "Chemical Reactions", "Equilibrium", "Acids and Bases"};

        System.out.println("The books available in Chemistry are: ");
        for (int c=0; c< chem.length; c++) {

            System.out.println(chem[c]);
        }
    }
}
