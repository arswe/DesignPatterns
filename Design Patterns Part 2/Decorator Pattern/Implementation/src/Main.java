public class Main {
    public static void main(String[] args) {
        var cloudStream = new CloudStream();
        var encryptedCloudStream = new EncryptedCloudStream(cloudStream);
        storeCreditCard(encryptedCloudStream);
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}