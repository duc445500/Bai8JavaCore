package DaHinh.override;

public class Test {
    public static void main(String[] args) {
        DaGiac d;
        d = new DaGiac();
        d.tinhDienTich();

        d = new TamGiac();
        d.tinhDienTich();

        d = new HinhChuNhat();
        d.tinhDienTich();
    }
}
