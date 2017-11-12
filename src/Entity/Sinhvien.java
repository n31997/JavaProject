package Entity;

public class Sinhvien {
    private String MSSV;
    private String hoTen;
    private int ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String email;
    private int heHoc;


    public Sinhvien {String MSSV, String hoTen, int ngaySinh, String gioiTinh, String diaChi, String email) {
        super();
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
    }

    public Sinhvien {
        super();
    }


    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String mSSV) {
        MSSV = mSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHeHoc() {
        return heHoc;
    }

    public void setHeHoc(int heHoc) {
        this.heHoc = heHoc;
    }

    @Override
    public void inTTin() {
        System.out.println("MSSV: "+MSSV);
        System.out.println("Ho va ten: "+hoTen);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Email: "+email);
    }

    public void dieuHuong(int heHoc) {
        if(heHoc==1)
        else
    }
}
