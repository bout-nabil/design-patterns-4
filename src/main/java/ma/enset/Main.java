package ma.enset;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nom du filtre : ");
        String filterClassName = sc.nextLine();

        System.out.print("Nom de la compression : ");
        String compressionClassName = sc.nextLine();

        FilterStrategy filter =
                (FilterStrategy) Class.forName(filterClassName)
                        .getDeclaredConstructor()
                        .newInstance();

        CompressionTemplate compression =
                (CompressionTemplate) Class.forName(compressionClassName)
                        .getDeclaredConstructor()
                        .newInstance();

        ImageProcessor processor = new ImageProcessor();
        processor.setFilter(filter);
        processor.setCompression(compression);

        int[] image = {10, 20, 30, 40};

        int[] result = processor.process(image);

        System.out.println("Traitement terminé !");
    }
}