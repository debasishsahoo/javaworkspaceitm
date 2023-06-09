package Inheritance.multilevel;

class iPhone12 extends iPhone10{

    void supportFor5GNetwork(){
        System.out.println("5G network support.......");
    }

    public static void main(String[] args) {
        iPhone12 iPhone = new iPhone12();
        iPhone.makeCalls();  // feature reused of iPhone 6 for iPhone 12
        iPhone.unlockPhoneByFaceId(); // feature reused of iPhone 10 for iPhone 12
        iPhone.supportFor5GNetwork(); // additional feature
    }
}