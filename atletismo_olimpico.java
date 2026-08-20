import java.util.Scanner;
public class atletismo_olimpico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] paises = new String[10];
        String[] pruebas = new String[10];
        String[] categorias = new String[10];
        String[] marcas = new String[10];
        String[] unidades = new String[10];
        String[] posiciones = new String[10];
        String[] medallas = new String[10];
        String[] aniosOlimpicos = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------//
        //--|menu_principal_de_atletismo_olimpico|--//
        //------------------------------------------//
        do {
            System.out.println("menu principal de atletismo olimpico");
            System.out.println("1) Registrar atleta");
            System.out.println("2) Editar atleta");
            System.out.println("3) Listar atletas");
            System.out.println("4) Buscar atleta");
            System.out.println("5) Eliminar atleta");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //----------------------//
                //--|registrar_atleta|--//
                //----------------------//
                case 1:
                    if (total >= nombres.length) {
                        System.out.println("No hay espacio para registrar mas atletas.");
                        break;
                    }
                    System.out.println("registro de atleta olimpico");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("nombre del atleta: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("pais: ");
                    paises[total] = entrada.nextLine();
                    System.out.print("prueba: ");
                    pruebas[total] = entrada.nextLine();
                    System.out.print("categoria: ");
                    categorias[total] = entrada.nextLine();
                    System.out.print("marca: ");
                    marcas[total] = entrada.nextLine();
                    System.out.print("unidad: ");
                    unidades[total] = entrada.nextLine();
                    System.out.print("posicion: ");
                    posiciones[total] = entrada.nextLine();
                    System.out.print("medalla: ");
                    medallas[total] = entrada.nextLine();
                    System.out.print("anio olimpico: ");
                    aniosOlimpicos[total] = entrada.nextLine();
                    System.out.print("estado: ");
                    estados[total] = entrada.nextLine();
                    total++;
                    System.out.println("Atleta registrado correctamente.");
                    break;
                //-------------------//
                //--|editar_atleta|--//
                //-------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen atletas registrados.");
                        break;
                    }
                    System.out.println("datos de los atletas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Pais: " + paises[i] + " | Prueba: " + pruebas[i] + " | Categoria: " + categorias[i] + " | Marca: " + marcas[i] + " | Unidad: " + unidades[i] + " | Posicion: " + posiciones[i] + " | Medalla: " + medallas[i] + " | Año olimpico: " + aniosOlimpicos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del atleta a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar atleta");
                        System.out.print("nuevo nombre: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("nuevo pais: ");
                        paises[posicion] = entrada.nextLine();
                        System.out.print("nueva prueba: ");
                        pruebas[posicion] = entrada.nextLine();
                        System.out.print("nueva categoria: ");
                        categorias[posicion] = entrada.nextLine();
                        System.out.print("nueva marca: ");
                        marcas[posicion] = entrada.nextLine();
                        System.out.print("nueva unidad: ");
                        unidades[posicion] = entrada.nextLine();
                        System.out.print("nueva posicion: ");
                        posiciones[posicion] = entrada.nextLine();
                        System.out.print("nueva medalla: ");
                        medallas[posicion] = entrada.nextLine();
                        System.out.print("nuevo año olimpico: ");
                        aniosOlimpicos[posicion] = entrada.nextLine();
                        System.out.print("nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Atleta actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------//
                //--|listar_atletas|--//
                //--------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen atletas registrados.");
                    } else {
                        System.out.println("lista de atletas olimpicos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Pais: " + paises[i] + " | Prueba: " + pruebas[i] + " | Categoria: " + categorias[i] + " | Marca: " + marcas[i] + " | Unidad: " + unidades[i] + " | Posicion: " + posiciones[i] + " | Medalla: " + medallas[i] + " | Año olimpico: " + aniosOlimpicos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-------------------//
                //--|buscar_atleta|--//
                //-------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen atletas registrados.");
                        break;
                    }
                    System.out.println("busqueda de atleta");
                    System.out.print("Ingrese el ID del atleta a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("atleta encontrado");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + nombres[posicion] + " | Pais: " + paises[posicion] + " | Prueba: " + pruebas[posicion] + " | Categoria: " + categorias[posicion] + " | Marca: " + marcas[posicion] + " | Unidad: " + unidades[posicion] + " | Posicion: " + posiciones[posicion] + " | Medalla: " + medallas[posicion] + " | Año olimpico: " + aniosOlimpicos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|eliminar_atleta|--//
                //---------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen atletas registrados.");
                        break;
                    }
                    System.out.println("datos de los atletas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Pais: " + paises[i] + " | Prueba: " + pruebas[i] + " | Categoria: " + categorias[i] + " | Marca: " + marcas[i] + " | Unidad: " + unidades[i] + " | Posicion: " + posiciones[i] + " | Medalla: " + medallas[i] + " | Año olimpico: " + aniosOlimpicos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del atleta a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombres[i] = nombres[i + 1];
                            paises[i] = paises[i + 1];
                            pruebas[i] = pruebas[i + 1];
                            categorias[i] = categorias[i + 1];
                            marcas[i] = marcas[i + 1];
                            unidades[i] = unidades[i + 1];
                            posiciones[i] = posiciones[i + 1];
                            medallas[i] = medallas[i + 1];
                            aniosOlimpicos[i] = aniosOlimpicos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Atleta eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen atletas registrados.");
                        break;
                    }
                    int oro = 0;
                    int plata = 0;
                    int bronce = 0;
                    int ninguna = 0;
                    int clasificados = 0;
                    int competencia = 0;
                    int finalizados = 0;
                    int descalificados = 0;
                    int retirados = 0;
                    for (int i = 0; i < total; i++) {
                        if (medallas[i].equalsIgnoreCase("Oro")) {
                            oro++;
                        } else if (medallas[i].equalsIgnoreCase("Plata")) {
                            plata++;
                        } else if (medallas[i].equalsIgnoreCase("Bronce")) {
                            bronce++;
                        } else {
                            ninguna++;
                        }
                        if (estados[i].equalsIgnoreCase("Clasificado")) {
                            clasificados++;
                        } else if (estados[i].equalsIgnoreCase("Competencia")) {
                            competencia++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else if (estados[i].equalsIgnoreCase("Descalificado")) {
                            descalificados++;
                        } else if (estados[i].equalsIgnoreCase("Retirado")) {
                            retirados++;
                        }
                    }
                    String pruebaMayor = pruebas[0];
                    int cantidadPruebaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadPrueba = 0;
                        for (int j = 0; j < total; j++) {
                            if (pruebas[i].equalsIgnoreCase(pruebas[j])) {
                                cantidadPrueba++;
                            }
                        }
                        if (cantidadPrueba > cantidadPruebaMayor) {
                            cantidadPruebaMayor = cantidadPrueba;
                            pruebaMayor = pruebas[i];
                        }
                    }
                    String paisMayor = paises[0];
                    int cantidadPaisMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadPais = 0;
                        for (int j = 0; j < total; j++) {
                            if (paises[i].equalsIgnoreCase(paises[j])) {
                                cantidadPais++;
                            }
                        }
                        if (cantidadPais > cantidadPaisMayor) {
                            cantidadPaisMayor = cantidadPais;
                            paisMayor = paises[i];
                        }
                    }
                    String categoriaMayor = categorias[0];
                    int cantidadCategoriaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCategoria = 0;
                        for (int j = 0; j < total; j++) {
                            if (categorias[i].equalsIgnoreCase(categorias[j])) {
                                cantidadCategoria++;
                            }
                        }
                        if (cantidadCategoria > cantidadCategoriaMayor) {
                            cantidadCategoriaMayor = cantidadCategoria;
                            categoriaMayor = categorias[i];
                        }
                    }
                    System.out.println("resumen de atletismo olimpico");
                    System.out.println("Atletas registrados: " + total);
                    System.out.println("Prueba mas frecuente: " + pruebaMayor);
                    System.out.println("Pais con mas atletas: " + paisMayor);
                    System.out.println("Categoria mas frecuente: " + categoriaMayor);
                    System.out.println("Medallas de oro: " + oro);
                    System.out.println("Medallas de plata: " + plata);
                    System.out.println("Medallas de bronce: " + bronce);
                    System.out.println("Sin medalla: " + ninguna);
                    System.out.println("Clasificados: " + clasificados);
                    System.out.println("En competencia: " + competencia);
                    System.out.println("Finalizados: " + finalizados);
                    System.out.println("Descalificados: " + descalificados);
                    System.out.println("Retirados: " + retirados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Atletismo Olimpico.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}