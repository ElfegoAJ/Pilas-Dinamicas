/*Codigo creado por Elfego Adair Juárez Arias*/
import javax.swing.JOptionPane;


public class mainPilaDin {

    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Pila pilita = new Pila();
        
        do {
            try{
                
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento de la pila\n"
                                + "2. Sacar un elemento de la pila\n"
                                + "3. ¿La pila está vacia?\n"
                                + "4. ¿Qué elemento esta en la cima\n"
                                + "5. Tamaño de la pila\n"
                                + "6. Limpiar toda la pila\n"
                                + "7. Salir","Menu de opciones",3));
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a empujar en la fila","Apilando datos",JOptionPane.INFORMATION_MESSAGE));
                        pilita.empujar(elemento);
                        
                    break;
                    
                    case 2:
                        
                        if (!pilita.estaVacia()) {
                            
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es: " + pilita.sacar(),"Obteniendo datos de la pila",JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia","Error",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                    break;
                    
                    case 3:
                        
                        if (pilita.estaVacia()) {
                            
                            JOptionPane.showMessageDialog(null, "La pila esta vacia","Vacia",JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "La pila contiene datos","Tiene datos",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        
                    break;
                    
                    case 4:
                        
                        if (!pilita.estaVacia()) {
                            
                            JOptionPane.showMessageDialog(null, "El elemento que esta en la cima es: " + pilita.cima(),"Cima",JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "La pila esta vacia","Vacia",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        
                    break;
                    
                    case 5:
                        
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es "+pilita.tamanioPila(),"Tamaño",JOptionPane.INFORMATION_MESSAGE);
                        
                    break;
                    
                    case 6:
                        
                        if (!pilita.estaVacia()) {
                            pilita.limpiar();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado","Vaciando pila",JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Pila vacia","Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                    break;
                    
                    case 7:
                        
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada","Saliendo",JOptionPane.INFORMATION_MESSAGE);
                        
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida","Error",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
            }
        } while (opcion!=7);
        
    }
}
//Elfego Adair Juarez Arias UAEMEX
