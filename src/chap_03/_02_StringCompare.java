package chap_03;

public class _02_StringCompare {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s1.equalsIgnoreCase("java"));

        s1 = "1234";    // s1과 s2가 1234를 참조
        s2 = "1234";

        System.out.println(s1.equals(s2));  // 내용 비교 true
        System.out.println(s1 == s2);   // 참조 비교 true

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2));  // 내용 비교 true
        System.out.println(s1 == s2);   // 참조 비교 false (다른 메모리)




    }
}
