import controllers.BrandController;
import models.Brand;
import test.TestData;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("Bryan Santos");
        BrandController controller = new BrandController();
        TestData testData = new TestData();
        Brand[] brands = testData.createBrands();

        System.out.println("-- LISTA ORIGINAL --");
        controller.printBrands(brands);

        System.out.println("\n-- ORDENADO POR SELECTION SORT DESCENDENTE --");
        controller.sortSelectionDesc(brands);
        controller.printBrands(brands);

        System.out.println("\n-- BÚSQUEDA BINARIA (8 años, desc) --");
        Brand b1 = controller.binarySearchByValidYears(brands, 8, false);
        if (b1 != null) {
            System.out.println("Encontrada: " + b1.getName() +
                    " - Total de años válidos: " + b1.getTotalValidYears());
        } else {
            System.out.println("No encontrada");
        }

        System.out.println("\n-- BÚSQUEDA BINARIA (10 años, desc) --");
        Brand b2 = controller.binarySearchByValidYears(brands, 10, false);
        if (b2 != null) {
            System.out.println("Encontrada: " + b2.getName() +
                    " - Total de años válidos: " + b2.getTotalValidYears());
        } else {
            System.out.println("No encontrada");
        }

        System.out.println("\n-- FIN DE EJECUCIÓN --");
    }

}
