public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software() {
        this.setCode("");
        this.setDescription("");
        this.setPrice(0);
        this.programmer = "";
        this.platform = "";
        this.os = "";
    }

    public Software(String pCode, String pDesc, double pPrice, String pPgmr, String pPF, String pOS) {
        this.setCode(pCode);
        this.setDescription(pDesc);
        this.setPrice(pPrice);

        this.programmer = pPgmr;
        this.platform = pPF;
        this.os = pOS;
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
}