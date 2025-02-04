package org.example.web;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task simplu
        TaskComponent task = new BasicTask("Implementare feature X");

        // Adăugare decoratori
        task = new TaskWithTimeEstimation(task, 5); // Adaugă estimarea timpului
        task = new TaskWithComments(task, "Necesită verificare suplimentară"); // Adaugă comentariu
        task = new BlockedTask(task, "Așteaptă aprobare de la manager"); // Marchează ca blocat

        // Afișare detalii task decorat
        System.out.println(task.getDetails());
    }
}


