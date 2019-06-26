public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;
    protected static int count = 0;

    public Software() {
        this.setCode("");
        this.setDescription("");
        this.setPrice(0);
        this.programmer = "";
        this.platform = "";
        this.os = "";
        count++;
    }

    public Software(String pCode, String pDesc, double pPrice, String pPgmr, String pPF, String pOS) {
        this.setCode(pCode);
        this.setDescription(pDesc);
        this.setPrice(pPrice);

        this.programmer = pPgmr;
        this.platform = pPF;
        this.os = pOS;
        count++;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return  "Code:               " + this.getCode() + "\n" +
                "Description:        " + this.getDescription() + "\n" +
                "Price:              " + this.getFormattedPrice(this.getPrice()) + "\n" +
                "Programmer:         " + this.programmer + "\n" +
                "Platform:           " + this.platform + "\n" +
                "Operating System:   " + this.os;
    }

    // Define an abstract method of super class
    public  int getItemCount() {
        return count;
    }
}