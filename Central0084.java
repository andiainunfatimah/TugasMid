/*NAMA                      : Andi Ainun Fatimah Jamal
  NIM                       : 13020210084 */

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0084 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0084 obj = new Central0084();
        obj.aaa();
        System.out.println("main");
    }
}