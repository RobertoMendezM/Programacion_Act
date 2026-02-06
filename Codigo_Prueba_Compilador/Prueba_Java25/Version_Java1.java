void main() {
    String javaVersion = System.getProperty("java.version");
    System.out.println("\nComplete Version: " + javaVersion);

    Runtime.Version version = Runtime.version();
    System.out.println("Java Version: " + version);
}