package ex3;

public class DownloaderReal implements Downloader{

    @Override
    public void baixarArquivo(String url) {
        System.out.println("Baixando arquivo ..." + url);
    }
}
