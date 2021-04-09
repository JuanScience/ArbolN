package arboln;

import javax.swing.JOptionPane;

public class NTree {
    Node root;
    
    //Constructor
    public NTree() {
      root = null;
    }

    //Método set del parámetro root
    public void setRoot(Node root) {
        this.root = root;
    }

    //Método get del parámetro root
    public Node getRoot() {
        return root;
    }
    
    //Muestra el árbol
    public String showTree(Node p, String tree){
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                tree = tree + q.getData() + " ";
                if (p == q)
                    tree = tree + "( ";
            }else{
                tree = showTree(q.getLinkList(), tree);
            }
            q = q.getLink();
            if (q == null){
                tree = tree + ") ";
            }
        }
        return tree;
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
    public void insert(Node fatherNode, Node newNode, int father){
        if (this.getRoot() != null){
            Node q = fatherNode;
            Node test = fatherNode;
            while (q != null){
                if (q.getSw() == 0){
                    if(q.getLink() == null && test.getData() == father){
                        q.setLink(newNode);
                        q = q.getLink();
                    }else if(q.getData() == father && test != q){
                        q.setSw(1);
                        Node newFather = new Node(father);
                        q.setLinkList(newFather);
                        newFather.setLink(newNode);
                    }
                }else{
                    insert(q.getLinkList(), newNode, father);
                }
                q = q.getLink();
            }
        }else
            this.setRoot(newNode);
    }
    
    //Ingresa un dato dado
    public void erase(){
        this.setRoot(null);
    }

    public boolean searchData(Node p, int data, boolean answer) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if(q.getData() == data)
                    answer = true;
            }else{
                answer = searchData(q.getLinkList(), data, answer);
            }
            q = q.getLink();
        }
        return answer;
    }

    public String showRoots(Node p, String roots) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if (p == q)
                    roots = roots + q.getData() + " ";
            }else{
                roots = showRoots(q.getLinkList(), roots);
            }
            q = q.getLink();
        }
        return roots;
    }

    public int countLeafs(Node p, int leafs) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if (p != q)
                    leafs = leafs + 1;
            }else{
                leafs = countLeafs(q.getLinkList(), leafs);
            }
            q = q.getLink();
        }
        return leafs;
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
