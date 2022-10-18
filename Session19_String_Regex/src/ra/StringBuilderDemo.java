package ra;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder strBuilder1 = new StringBuilder("Rikkei Academy");
        StringBuilder strBuilder2 = new StringBuilder(" - Hoc vien dao tao CNTT Rikkei");
        StringBuilder strBuilder3 = new StringBuilder("ABCD");

        System.out.println("Gia tri chuoi strBuilder1 la: "+strBuilder1);
        System.out.println("Noi 2 chuoi strBuilder1 va strBuilder2: "+strBuilder1.append(strBuilder2));
        System.out.println("Chen chuoi Viet Nam vao chuoi strBuilder1 o chi so 6: "+strBuilder1.insert(6,"Viet Nam"));
        System.out.println("Xoa chuoi Academy trong strBuilder1: "+strBuilder1.delete(6,14));
        System.out.println("Dao nguoc chuoi strBuilder3: "+strBuilder3.reverse());
        String str = strBuilder2.toString();
        System.out.println("Chuyen chuoi strBuilder2 thanh kieu String: "+strBuilder2.toString());
    }
}
