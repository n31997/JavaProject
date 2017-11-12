package Entity;

public class Monhoc {
    private String MSMH;
    private String tenMon;
    private int soHP;
    private float diemQT;
    private float diemCK;

    public Monhoc(String MSMH, String tenMon, int soHP, float diemQT, float diemCK) {
        super();
        this.MSMH = MSMH;
        this.tenMon = tenMon;
        this.soHP = soHP;
        this.diemCK = diemCK;
        this.diemQT = diemQT;
    }

    public Monhoc() {
        super();
    }

    public String getMSMH () {
        return MSMH;
    }

    public void setMSMH (String MSMH) {
        this.MSMH = MSMH;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoHP() {
        return soHP;
    }

    public void setSoHP(int soHP) {
        this.soHP = soHP
    }

    public float getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(float diemQT) {
        this.diemQT = diemQT;
    }

    public float getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(float diemCK) {
        this.diemCK = diemCK;
    }
}
