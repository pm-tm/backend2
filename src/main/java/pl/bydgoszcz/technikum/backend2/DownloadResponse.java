package pl.bydgoszcz.technikum.backend2;

import java.util.List;

public class DownloadResponse {
    private List<String> files;

    public DownloadResponse(List<String> files) {
        this.files = files;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }
}