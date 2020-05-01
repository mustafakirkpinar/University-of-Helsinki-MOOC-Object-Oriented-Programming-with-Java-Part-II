
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class UserInterface {

    private TodoList todoList;
    private Scanner sc;

    public UserInterface(TodoList todoList, Scanner sc) {
        this.todoList = todoList;
        this.sc = sc;
    }

    public void start() {
        String command;
        while (true) {
            System.out.print("Command: ");
            command = sc.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("");
                System.out.println("To add: ");
                this.todoList.add(sc.nextLine());
            }
            
            if (command.equals("list")) {
                this.todoList.print();
            }
            
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                this.todoList.remove(Integer.parseInt(this.sc.nextLine()));
            }
        }
    }
}
