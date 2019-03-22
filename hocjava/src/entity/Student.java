package entity;

public class Student extends Person implements HanhDongTichCuc,HanhDongTieuCuc{
    private String rollNumber;

    public Student(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(String rollNumber, String name, int age, String address) {
//        super(name, age, address);
        this.rollNumber = rollNumber;
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }


    @Override
    public void docSach() {
        System.out.println("Doc sach la tot");
    }

    @Override
    public void uongCaPhe() {
        System.out.println("Uong ca phe la tot");
    }

    @Override
    public void tapTheDuc() {
        System.out.println("Tap the duc la tot");
    }

    @Override
    public void uongRuou() {
        System.out.println("Uong ruou la khong tot");
    }

    @Override
    public void hutThuoc() {
        System.out.println("Hut thuoc la khong tot");
    }

    @Override
    public void tronHoc() {
        System.out.println("Tron hoc la khong tot");
    }
}
