package challenge;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor techDean = new Supervisor("Dr. Barbara Liskov", "Dean of technology");
        Supervisor mathChair = new Supervisor("Dr. Riemann", "Chair of the Math Department");
        Supervisor compSciChair = new Supervisor("Dr Turing", "Chair of the Computer Science Department");

        Professor mathProf1 = new Professor("Dr. Leibniz", "Professor", 0);
        Professor mathProf2 = new Professor("Dr. Cauchy", "Professor", 1);

        Professor cseProf1 = new Professor("Dr. von Neumann", "Professor", 3);
        Professor cseProf2 = new Professor("Dr. Patterson", "Professor", 2);
        Professor cseProf3 = new Professor("Dr. Knuth", "Professor", 4);

        techDean.add(mathChair);
        techDean.add(compSciChair);

        mathChair.add(mathProf1);
        mathChair.add(mathProf2);

        compSciChair.add(cseProf1);
        compSciChair.add(cseProf2);
        compSciChair.add(cseProf3);

        System.out.println("Composite Pattern");
        System.out.println("\nThe college has the following structure\n");

        System.out.println(techDean.getDetails());
        List<Faculty> chairs = techDean.getFaculty();

        for (Faculty chair: chairs) {
            System.out.println("\t" + chair.getDetails());
        }

        List<Faculty> mathProfessors = mathChair.getFaculty();
        for (Faculty mathProfessor : mathProfessors) {
            System.out.println("\t\t" + mathProfessor.getDetails());
        }

        List<Faculty> cseProfessors = compSciChair.getFaculty();
        for (Faculty cseProfessor : cseProfessors) {
            System.out.println("\t\t" + cseProfessor.getDetails());
        }

        compSciChair.remove(cseProf2);

        System.out.println("\nAfter a Computer Science Professor left:");

        cseProfessors = compSciChair.getFaculty();
        for (Faculty cseProfessor : cseProfessors) {
            System.out.println("\t\t" + cseProfessor.getDetails());
        }
    }
}
