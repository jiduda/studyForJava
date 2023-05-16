package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I am going to study Java and Python, JS, TS.";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java"));  // 앞에서부터 찾음
        System.out.println(s.indexOf("C#"));    // -1
        System.out.println(s.lastIndexOf("Java"));  // 뒤에서 먼저 찾음
        System.out.println(s.startsWith("I am"));
        System.out.println(s.endsWith("."));
    }
}
