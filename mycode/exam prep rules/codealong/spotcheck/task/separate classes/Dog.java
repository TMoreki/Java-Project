class Dog extends Animal {
    // Overriding Method 1
    @Override
    private void makeSound() {
        System.out.println("The dog barks");
    }

    // Overriding Method 2
    @Override
    private void makeSound(String sound) {
        System.out.println("The dog makes a " + sound);
    }
}