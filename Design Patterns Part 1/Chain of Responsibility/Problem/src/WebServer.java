public class WebServer {
    public void handle(HttpRequest request) {
        // Authentication.
        var authenticator = new Authenticator();
        var isValid = authenticator.authenticate(request);
        if (!isValid)
            return;
        
        // Logging.
        var logger = new Logger();
        logger.log(request);

        // Compressing.
        var compressor = new Compressor();
        compressor.compress(request);
    }
}
