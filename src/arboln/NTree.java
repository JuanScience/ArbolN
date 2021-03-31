
package arboln;

import javax.swing.JOptionPane;

public class NTree {
    Node root;

    //Método set del parámetro root
    public void setRoot(Node root) {
        this.root = root;
    }

    //Método get del parámetro root
    public Node getRoot() {
        return root;
    }
    
    //Muestra un nodo dado
    public void showNode(Node p){
        Node q = p;
        while (q != null){
            if (q.getSw() == 0)
                JOptionPane.showMessageDialog(null, "A basic JOptionPane message dialog");
            else 
                showNode(q.getLinkList());
            q = q.getLink();
        }
    }
    
    //Ingresa un dato dado
    public void insert(){
        
    }
    
    

    /**
     *  + Arbol_n_ario(Inicializar raiz en null) 
        T Void Mostrar(Nodo p)
        T Nodo getRaiz() 
        P void insertar(Entero dato) 
        + void eliminar(Entero dato) 
        + void buscarDato(Entero dato) 
        + void mostrarRaices(Nodo p) 
        + int contarHojas(Nodo p) 
        + void mostrarhojas(Nodo p) 
        + void mostrar gradoArbol(Nodo p) 
        + void mostrargradoDatodado(Entero dato) 
        + void mostrarhijos Datodado(Nodo p ,Entero dato) + void mostrarNivel(Nodo p ,Entero d) 
        + void mostrarAltura(Nodo p) 
        + void mostrarPadreDatoDado(Entero dato)
        
        (+ Pendiente, T falta probar, P programando, F finalizado)
     */
}
