public class Mobile_Samsung_Source {
        public static void main(String[] args) {
            Samsung samsung = new Samsung();
            System.out.println(samsung.unlock());
            System.out.println(samsung.call("1234567890"));
            System.out.println(samsung.openApp("Gallery"));
        }
}
