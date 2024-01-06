package p1;

import java.util.List;
import java.util.Scanner;

public class ClientServices {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        RhService rs = new RhServiceImplService().getRhServiceImplPort();

        int choix;
        do {
            System.out.println("Menu:");
            System.out.println("1. Ajouter un employ�");
            System.out.println("2. Rechercher des employ�s");
            System.out.println("3. Mettre � jour un employ�");
            System.out.println("4. Supprimer un employ�");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une op�ration (0-4) : ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne apr�s le nombre saisi

            switch (choix) {
                case 1:
                    // Ajouter un employ�
                    Employee e = new Employee();
                    System.out.print("Entrez le nom de l'employ� : ");
                    e.setNom(scanner.nextLine());

                    System.out.print("Entrez le pr�nom de l'employ� : ");
                    e.setPrenom(scanner.nextLine());

                    System.out.print("Entrez le poste de l'employ� : ");
                    e.setPoste(scanner.nextLine());

                    System.out.print("Entrez le salaire de l'employ� : ");
                    double salaire = scanner.nextDouble();
                    e.setSalaire(salaire);

                    String resultatAjout = rs.addEmployee(e);
                    System.out.println(resultatAjout);
                    break;
                case 2:
                    // Rechercher des employ�s
                    System.out.print("Entrez un mot-cl� de recherche : ");
                    String motCle = scanner.nextLine();

                    List<Employee> resultatRecherche = rs.searchEmployees(motCle);
                    System.out.println(resultatRecherche);
                    for (Employee emp : resultatRecherche) {
                        System.out.println("---------------------------");
                        System.out.println("ID : " + emp.getId() + "\nNom : " + emp.getNom() + "\nPr�nom : " + emp.getPrenom() + "\nPoste : " + emp.getPoste() + "\nSalaire : " + emp.getSalaire());
                        System.out.println("---------------------------");
                    }
                    break;
                // Ajoutez des cas pour les op�rations de mise � jour (update) et de suppression (delete) ici
                case 0:
                    System.out.println("Fin du programme.");
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        } while (choix != 0);

        scanner.close();
    }
}
