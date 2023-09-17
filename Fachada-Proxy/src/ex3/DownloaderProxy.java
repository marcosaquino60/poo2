package ex3;

public class DownloaderProxy implements Downloader{
    private DownloaderReal downloaderReal;

    @Override
    public void baixarArquivo(String url) {
        if (downloaderReal == null) {
            downloaderReal = new DownloaderReal();
        }
        // Verifica permissões ou outras condições antes de permitir o download
        System.out.println("Verificando permissões...");
        downloaderReal.baixarArquivo(url);
    }
}
