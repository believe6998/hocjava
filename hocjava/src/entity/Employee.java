package entity;

public class Employee extends Person implements HanhDongTichCuc, HanhDongTieuCuc {
    private String employeeId;


    public Employee() {
    }

    public Employee(String employeeId, String name, int age, String address) {
        super(name, age, address);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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
