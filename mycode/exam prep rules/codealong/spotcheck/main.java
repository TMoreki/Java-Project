 class Tests2 {
    int money = 150;
    public Tests2() {
        
    }
    static {
        System.out.println("Tests2 Static initializer");
    }
    {
        System.out.println("Tests2 Instance initializer");
    }
    class Tests3 {
        int money;
        public Tests3(int money) {
            this.money = money;
            System.out.println("Tests3 one args constructor: " + this.money);
        }
        
        static {
            System.out.println("Tests3 Static initializer");
        }
        
        {
            System.out.println("Tests3 Instance initializer");
        }
    }
    public static void main(String[] args) {
        Tests3 t3 = new Tests3();
    }
}