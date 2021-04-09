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
                if(q.getLink() == null && test.getData() == father){
                    q.setLink(newNode);
                    q = q.getLink();
                    JOptionPane.showMessageDialog(null,"Dato ingresado");
                }
                if (q.getSw() == 0){
                    if(q.getData() == father && test != q){
                        q.setSw(1);
                        Node newFather = new Node(father);
                        q.setLinkList(newFather);
                        newFather.setLink(newNode);
                        JOptionPane.showMessageDialog(null,"Dato ingresado");
                    }
                }else{
                    insert(q.getLinkList(), newNode, father);
                }
                q = q.getLink();
            }
        }else{
            this.setRoot(newNode);
            JOptionPane.showMessageDialog(null,"Dato ingresado");
        }
    }
    
    //Borra un dato en el árbol
    public void erase(Node p, int data){
        Node q = p;
        Node ant = q;
        if(q.getData() == data && q.getLink() != null){ // dato en un padre
            int newFather = bigSon(q); //Busca el hijo mayor
            erase(q, newFather);//eliminar el hijo mayor
            q.setData(newFather);
        }
        
        if (q.getLink() != null){ 
            q = q.getLink();
        }

        while (q != null){
            if (q.getSw() == 0){
                if(q.getData() == data){ //dato es una hoja
                    ant.setLink(q.getLink());
                }
            }else{
                erase(q.getLinkList(), data);
                if (q.getLinkList().getLink() == null){
                    q.setData(q.getLinkList().getData());
                    q.setSw(0);
                    q.setLinkList(null);
                }
            }
            ant = q;
            q = q.getLink();
        }
    }
    
    public int bigSon(Node p){ //Busca el mayor de los hijos de una Nodo padre
        int big;
        if(p.getLink().getSw() == 0){
            big = p.getLink().getData();
        }else{
            big = p.getLink().getLinkList().getData();
        }
        p = p.getLink();
        while(p != null){
            if(p.getSw() == 0 && p.getData() > big){
                big = p.getData();
            }else if(p.getSw() == 1 && p.getLinkList().getData() > big){
                big = p.getData();
            }
            p = p.getLink();
        }            
        return big;
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

    public String showLeafs(Node p, String leafs) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if (p != q)
                    leafs = leafs + q.getData() + " ";
            }else{
                leafs = showLeafs(q.getLinkList(), leafs);
            }
            q = q.getLink();
        }
        return leafs;
    }

    public int gradeTree(Node p, int grade) {
        Node q = p;
        int aux = 0;
        q = q.getLink();
        while (q != null){
            aux++;
            q = q.getLink();
        }
        if (aux > grade)
            grade = aux;
        q = p;
        while (q != null){
            if (q.getSw() != 0){
                grade = gradeTree(q.getLinkList(), grade);
            }
            q = q.getLink();
        }
        return grade;
    }

    public int gradeData(Node p, int data, int grade) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if(q.getData() == data && q == p){
                    q = q.getLink();
                    while(q != null){
                        grade++;
                        q = q.getLink();
                    }
                    q = p;
                }
            }else{
                grade = gradeData(q.getLinkList(), data, grade);
            }
            q = q.getLink();
        }
        return grade;
    }

    public String dataSons(Node p, int data, String answer) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if(q.getData() == data && q == p){
                    q = q.getLink();
                    while(q != null){
                        if(q.getSw() == 0)
                            answer = answer + " " + q.getData();
                        else
                            answer = answer + " " + q.getLinkList().getData();
                        q = q.getLink();
                    }
                    q = p;
                }
            }else{
                answer = dataSons(q.getLinkList(), data, answer);
            }
            q = q.getLink();
        }
        return answer;
    }

    public int showLevel(Node p, int data, int high, int level) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if(q.getData() == data && p == q)
                    level = high - 1;
                else if(q.getData() == data)
                    level = high;
            }else{
                showLevel(q.getLinkList(), data, high++, level);
            }
            q = q.getLink();
        }
        return level;
    }

    public int showHigh(Node p, int high) {
        Node q = p;
        while (q != null){
            if (q.getSw() != 0){
                int aux = showHigh(q.getLinkList(), high++);
                if (aux > high)
                    high = aux;
            }
            q = q.getLink();
        }
        return high;
    }

    public void fatherData(Node p, int data) {
        Node q = p;
        while (q != null){
            if (q.getSw() == 0){
                if(q.getData() == data && p != q)
                    JOptionPane.showMessageDialog(null, "El padre de " + data + " es: " + p.getData());
            }else{
                if (q.getLinkList().getData() == data)
                    JOptionPane.showMessageDialog(null, "El padre de " + data + " es: " + p.getData());
                fatherData(q.getLinkList(), data);
            }
            q = q.getLink();
        }
    }
    
    public void clean(){
        this.setRoot(null);
    }
    
}
