
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
    
    //Muestra el árbol
    public void showTree(Node p){
        
    }
    
    //Muestra un nodo dado
    public void showNode(Node p){
        Node q = p;
        boolean found = false;
        while (q != null){
            if (q.getSw() == 0)
                JOptionPane.showMessageDialog(null, "El elemento " + " se encontró");
                
            else 
                showNode(q.getLinkList());
            q = q.getLink();
        }
    }
    
    //Ingresa un dato dado
    public void insert(){
        
    }
    
    //Ingresa un dato dado
    public void erase(){
        
    }

    void searchData(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void showRoots(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void countLeafs(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void showLeafs(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void gradeTree(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void gradeData(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void DataSons(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void showLevel(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void showHIgh(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void fatherData(Node root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
