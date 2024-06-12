public class Local1Main {

    private static class Local {
        Local() {
            System.out.println("Constructing");
        }
    }

    public static void main(String[] args) {
        Local localInstance = new Local();
    }
}

