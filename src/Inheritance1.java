public class Inheritance1 {
    public static void main(String[] args) {
        Book abook;
        Software asoft;

        String msgCode, msgDesc, msgAuthor;
        double msgPrice = 10.00;
        int msgPage = 10, noItems = 0;
        String msgOS = "OS";
        String msgPF = "PlatForm";
        noItems = 0;

        for (int j = 11; j <= 15; j++) {
            msgCode = "SKU001" + j;
            msgDesc = "description " + j;
            msgPrice = msgPrice * j;
            msgAuthor = "programmer " + j;
            msgPF = "PF" + j;
            msgOS = "OS" + j;

            asoft = new Software(msgCode, msgDesc, msgPrice, msgAuthor, msgPF, msgOS);
            System.out.println("\n" + asoft.toString());
            noItems = asoft.getItemCount();
            System.out.println("Count: " + asoft.getCount());
        }

        System.out.println("\nSoftware Count:" + noItems + "\n");


        for (int i = 1; i <= 2; i++) {
            msgCode = "SKU001" + i;
            msgDesc = "description " + i;
            msgAuthor = "author " + i;
            msgPrice = msgPrice * i;
            msgPage = msgPage * i;

            abook =  new Book(msgCode, msgDesc, msgPrice, msgAuthor, msgPage);
            System.out.println("\n" + abook.toString());

            noItems = abook.getItemCount();
            System.out.println("Count: " + abook.getCount());
        }

        System.out.println("\nBook Count:" + noItems);



    }
}
