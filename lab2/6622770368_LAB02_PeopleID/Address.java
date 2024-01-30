public class Address {
    String houseNo = "-";
    String soi = "-";
    String road = "-";
    String subDistrict = "-";
    String district = "-";
    String province = "-";
    String postcode = "-";

    public Address(String houseNo, String soi, String road, String subDistrict, String district, String province, String postcode) {
        this.houseNo = houseNo;
        this.soi = soi;
        this.road = road;
        this.subDistrict = subDistrict;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
    }

    public Address(String province, String postcode) {
        this.province = province;
        this.postcode = postcode;
    }

    public void printFullAddress() {
        System.out.println(houseNo + ", " + soi + ", " + road + ", " + subDistrict + ", " + district + ", " + province + ", " + postcode);
    }

    public void printShortAddress() {
        System.out.println(district + ", " + province);
    } 
}
