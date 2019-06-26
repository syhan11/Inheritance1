public class Inheritance1 {
    public static void main(String[] args) {
        Book abook;
        Software asoft;

        String msgCode, msgDesc, msgAuthor;
        double msgPrice = 10.00;
        int msgPage = 10;

        for (int i = 1; i <= 2; i++) {
        msgCode = "SKU001" + i;
        msgDesc = "description " + i;
        msgAuthor = "author " + i;
        msgPrice = msgPrice * i;
        msgPage = msgPage * i;

        abook =  new Book(msgCode, msgDesc, msgPrice, msgAuthor, msgPage);
        System.out.println(abook.toString());
        System.out.println("Author: " + abook.getAuthor()+ "\nPages: " + abook.getPages());
        System.out.println("\nBook Count:" + abook.getBookCount());
        System.out.println("\nCount:" + abook.getCount());
        }

        String msgOS = "OS";
        String msgPF = "PlatForm";

        for (int j = 11; j <= 12; j++) {
            msgCode = "SKU001" + j;
            msgDesc = "description " + j;
            msgPrice = msgPrice * j;
            msgAuthor = "programmer " + j;
            msgPF = "PF" + j;
            msgOS = "OS" + j;

            asoft = new Software(msgCode, msgDesc, msgPrice, msgAuthor, msgPF, msgOS);
            System.out.println(asoft.toString());
            System.out.println("Programmer: " + asoft.getProgrammer() +
                    "\nPlatform: " + asoft.getPlatform() +
                    "\nOperating System: " + asoft.getOs());
            System.out.println("\nCount:" + asoft.getCount());
        }
    }
}
