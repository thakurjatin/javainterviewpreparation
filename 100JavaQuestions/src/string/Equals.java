package string;

class Equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("foo");
        String s4 = s1.intern();
        String s5 = s2.intern();
        String s6 = "abc";

        System.out.println(s3 == s4);
        System.out.println(s1 == s5);
        System.out.println(s5);
        System.out.println(s4);
        System.out.println(s4 == s5);
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s5));
        
        String k1 = new String("abc");
        String k2 = new String("abc");
        System.out.println(k1 == k2);  //false
        StringBuffer kb1 = new StringBuffer(k1);
        System.out.println(k1.equals(kb1)); //true
        String k3 = "abc";
        k3.intern();
        System.out.println(k1 ==k3);// true
    }
}
