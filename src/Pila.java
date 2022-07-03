/*Codigo creado por Elfego Adair Juárez Arias*/
public class Pila {
    private NodoPila cima;
    int tama;
    
    public Pila(){
        cima=null;
        tama=0;
    }
    
    //Metodo para saber si la pila esta vacia
    public boolean estaVacia(){
        return cima==null; 
   }
    
    //Metodo para insertar un elemento en la pila
    
    public void empujar(int elem){
        NodoPila nuevo = new NodoPila(elem);
        nuevo.siguiente=cima;
        cima=nuevo;
        tama++;
    }
    
    //Metodo para sacar un elemento de la pila
    public int sacar(){
        int aux=cima.dato;
        cima=cima.siguiente;
        tama--;
        return aux;
    }
    
    //Metodo para saber el elemento que esta en el tope
    public int cima(){
        return cima.dato;
    }
    
    //Metodo para saber el tamaño de la pila
    public int tamanioPila(){
        return tama;
    }
    
    //Metodo para limpiar la pila
    public void limpiar(){
        while(!estaVacia()){
            sacar();
        }
    }
}
//Elfego Adair Juarez Arias UAEMEX