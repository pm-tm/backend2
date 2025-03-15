package pl.bydgoszcz.technikum.backend2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DownloadsController {

    @GetMapping("/downloads")
    public List<String> listDownloads() {
        String home = System.getProperty("user.home");
        File downloadsDir = new File(home, "Downloads");
        if (downloadsDir.exists() && downloadsDir.isDirectory()) {
            return Arrays.stream(downloadsDir.listFiles())
                    .map(File::getName)
                    .collect(Collectors.toList());
        } else {
            return List.of("Downloads directory not found");
        }
    }
}