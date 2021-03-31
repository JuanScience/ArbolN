package arboln;

import javax.swing.JOptionPane;

/**
 * @authors Ormolgud Gonzalez Cardona
 *          Juan Carlos Salazar Muñoz
 */
public class ArbolN {
    
    private static NTree N;

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
                    case 1: N.showTree(N.getRoot());
                        break;

                    case 2: N.insert();
                        break;

                    case 3: N.erase();
                        break;

                    case 4: N.getRoot();
                        break;
                    
                    case 5: N.searchData(N.getRoot());
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
    
}
