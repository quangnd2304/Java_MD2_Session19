package ra;

public class StringDemo {
    public static void main(String[] args) {
        //Khoi tao String theo cach literal - Thuong xuyen su dung
        String str1 = "Rikkei Academy";
        //Khoi tao String theo constructor cua no
        String str2 = new String(" Hoc Vien Rikkei");
        char[] arrCharacter = {'J','A','V','A','-','0','8'};
        String str3 = new String(arrCharacter);
        String str4 = new String("Rikkei Academy");
        String str5 = new String("rIkKei academy");
        String str6 = new String("24");
        System.out.println("Gia tri chuoi str1: "+str1);
        System.out.println("Gia tri chuoi str2: "+str2);
        System.out.println("Gia tri chuoi str3: "+str3);
        System.out.println("Do dai chuoi str1: "+str1.length());
        System.out.println("Lay ra ky tu co chi so la 2 trong chuoi str1: "+str1.charAt(2));
        System.out.println("Noi 2 chuoi: "+str1.concat(str2));
        System.out.println("Viet hoa cac ky tu trong chuoi str1: "+str1.toUpperCase());
        System.out.println("Viet thuong cac ky tu trong chuoi str1: "+str1.toLowerCase());
        System.out.println("Xoa khoang trang 2 dau chuoi str1: "+str1.trim());
        System.out.println("So sanh 2 chuoi str1 va str5: "+str1.equals(str5));
        System.out.println("So sanh 2 chuoi str1 va str5 voi equalsIgnoreCase: "+str1.equalsIgnoreCase(str5));
        System.out.println("So sanh 2 chuoi str1 va str5 voi compareTo: "+str1.compareTo(str5));
        System.out.println("Kiem tra chuoi str1 bat dau la chuoi Rikkei hay khong: "+str1.startsWith("Rikkei"));
        System.out.println("Kiem tra chuoi str1 ket thuc la chuoi Academy hay khong: "+str1.endsWith("Academy"));
        System.out.println("Kiem tra trong chuoi str1 co chuoi kei hay khong: "+str1.contains("kei"));
        int number = Integer.valueOf(str6);
        System.out.println(number);
    }
}
