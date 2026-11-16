public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        Product product2 = new Product();

        product.name = "pen";
        product.price = 1.5;

        product2.name = "pencil";
        product2.price = 0.89;

        System.out.println(product.name + " costs " + product.price);
        System.out.println(product2.name + " costs " + product2.price);
    }

}