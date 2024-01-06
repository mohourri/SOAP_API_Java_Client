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
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Rechercher des employés");
            System.out.println("3. Mettre à jour un employé");
            System.out.println("4. Supprimer un employé");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une opération (0-4) : ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne après le nombre saisi

            switch (choix) {
                case 1:
                    // Ajouter un employé
                    Employee e = new Employee();
                    System.out.print("Entrez le nom de l'employé : ");
                    e.setNom(scanner.nextLine());

                    System.out.print("Entrez le prénom de l'employé : ");
                    e.setPrenom(scanner.nextLine());

                    System.out.print("Entrez le poste de l'employé : ");
                    e.setPoste(scanner.nextLine());

                    System.out.print("Entrez le salaire de l'employé : ");
                    double salaire = scanner.nextDouble();
                    e.setSalaire(salaire);

                    String resultatAjout = rs.addEmployee(e);
                    System.out.println(resultatAjout);
                    break;
                case 2:
                    // Rechercher des employés
                    System.out.print("Entrez un mot-clé de recherche : ");
                    String motCle = scanner.nextLine();

                    List<Employee> resultatRecherche = rs.searchEmployees(motCle);
                    System.out.println(resultatRecherche);
                    for (Employee emp : resultatRecherche) {
                        System.out.println("---------------------------");
                        System.out.println("ID : " + emp.getId() + "\nNom : " + emp.getNom() + "\nPrénom : " + emp.getPrenom() + "\nPoste : " + emp.getPoste() + "\nSalaire : " + emp.getSalaire());
                        System.out.println("---------------------------");
                    }
                    break;
                // Ajoutez des cas pour les opérations de mise à jour (update) et de suppression (delete) ici
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
