//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

class Esercizio {
    class Nodo{
        T dato;
        Nodo <T> next;
    }

    public Nodo <T>(T dato){
        this.dato=dato;
        this.next=null;
    }

    class Pila <T> {
        private Nodo<T> top;
        public Pila (){
            this.top=null;
        } 
    }

    



    public void push (T dato){
        Nodo<T> nuovoNodo=new Nodo (dato);
        nuovoNodo=top;
        top=nuovoNodo;
    }

    public T pop (){
        if(top==null){
            throw.newNoSuchElementException("La pila è vuota");
        }
        T dato=top.dato;
        top=top.next;
        return dato;
    }

    public T peak(T dato){
        if (top==null){
            throw.newNoSuchElementException("La pila è vuota");
        }
        T dato=top.dato;
        return dato;
    }

    public boolean isEmpty(){
        return (top==null);
    }

    public int size(){
        curr=0;
        Nodo<T>current=top;
        while (current!=null){
            current=current.next;
            ++curr;
        }
        return curr;
    }

    Public String toString(){
        String str="[";
        Nodo<T> current=top;
        while (current.next !=null){
            current=current.next;
            str+=curr.dato;
        }

        str="]";

    }
