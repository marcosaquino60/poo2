package ex3;

public class Main {
    public static void main(String[] args) {
        Downloader proxy = new DownloaderProxy();
        proxy.baixarArquivo("https://exemplo.com/arquivo.zip");
    }
}
