package Utilitys;

interface TestA{
    String toString();
        }

class Test {
    public static void main(String[] args) {
        System.out.println(new Test(){
            public String toString(){
                return "test";
            }
        });
    }
}
