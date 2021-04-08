package arboln;

import javax.swing.JOptionPane;

/**
 * @authors Ormolgud Gonzalez Cardona
 *          Juan Carlos Salazar Muñoz
 */
public class ArbolN {
    
    private static NTree N = new NTree();

    public static void main(String[] args) {
        mainMenu();
    }
    
    //Método para el menú principal
    public static void mainMenu(){      
        String menu = "***MENÚ ÁRBOLES N***"
                + "\n\n 1- Mostrar árbol\n 2- Insertar\n 3- Eliminar\n 4- Raiz\n 5- Buscar dato"
                + "\n 6- Mostrar raices\n 7- Contar hojas\n 8- Mostrar hojas\n 9- Grado del árbol\n10- Grado de dato"
                + "\n11- Hijos de dato\n12- Mostrar nivel\n13- Mostrar altura\n14- Padre de dato\n15- Borrar árbol"
                + "\n 0- Salir\n\n(Ingrese una opción)";
        int option = -1;
        do
        {
            try{
                option = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch(option)
                {
                    case 1: 
                        if(N.getRoot() == null)
                            JOptionPane.showMessageDialog(null, "El árbol está vacío");
                        else{
                            String tree = "";
                            JOptionPane.showMessageDialog(null, N.showTree(N.getRoot(), tree));
                        }
                        break;

                    case 2:
                        insert();
                        break;

                    case 3: N.erase();
                        break;

                    case 4: 
                        if(N.getRoot() == null){
                            JOptionPane.showMessageDialog(null, "El árbol está vacío");
                        }else{
                            JOptionPane.showMessageDialog(null, "La raiz del árbol es: " + N.getRoot());
                        }
                        break;
                    
                    case 5: 
                        if(N.getRoot() == null){
                            JOptionPane.showMessageDialog(null, "El árbol está vacío");
                        }else{
                            searchDataMenu();
                        }
                        break;

                    case 6: N.showRoots(N.getRoot());
                        break;

                    case 7: N.countLeafs(N.getRoot());
                        break;

                    case 8: N.showLeafs(N.getRoot());
                        break;
                    
                    case 9: N.gradeTree(N.getRoot());
                        break;

                    case 10: N.gradeData(N.getRoot());
                        break;

                    case 11: N.DataSons(N.getRoot());
                        break;

                    case 12: N.showLevel(N.getRoot());
                        break;
                    
                    case 13: N.showHIgh(N.getRoot());
                        break;

                    case 14: N.fatherData(N.getRoot());
                        break;
                        
                    case 15: N.setRoot(null);
                        break;

                    case 0: System.exit(0);
                        break;
                }
            }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null,"Opción no válida");
            }
        }while(option != 0);       
    }

    public static void insert() {
        String mData = "***Ingreso***"
                + "\nPor favor ingrese el dato a ingresar en el árbol:";
        String mFather = "***Ingreso***"
                + "\nPor favor ingrese el padre del dato a ingresar:";
        int option = -1;
        
        try{
            option = Integer.parseInt(JOptionPane.showInputDialog(mData));
            Node newNode = new Node(option);
            if(N.getRoot() == null){
                N.insert(N.getRoot(), newNode, 0);
            }
            else{
                int father = Integer.parseInt(JOptionPane.showInputDialog(mFather));
                N.insert(N.getRoot(), newNode, father);
            }
        }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }

    private static void searchDataMenu() {
        String mSearchData = "***Buscar***"
                + "\nPor favor ingrese el dato a buscar en el árbol:";
        int option = -1;
        
        try{
            option = Integer.parseInt(JOptionPane.showInputDialog(mSearchData));
            boolean answer = false;
            if(N.searchData(N.getRoot(), option, answer))
                JOptionPane.showMessageDialog(null, "El dato se encuentra en el árbol");
            else
                JOptionPane.showMessageDialog(null, "El dato no se encuentra en el árbol");     
        }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }
    
}
