
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TodoList {
    
    private List <String> todoList;
    
    public TodoList(){
    this.todoList=new ArrayList<String>();
    }
    
    public void add(String str){
    this.todoList.add(str);
    }
    
    public void print(){
        for (int i=0;i<this.todoList.size();i++)
        System.out.println((i+1)+": "+this.todoList.get(i));
    }
    
    public void remove(int index){
    this.todoList.remove(index-1);
    }
}
