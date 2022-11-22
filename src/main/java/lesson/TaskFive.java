/**
 * Придумайте структуру класса, на ваш выбор. Создайте json массив с 4-5 объектами этого класса.
 * Загрузите файл .json на ваш гитхаб. Напишите программу, которая скачивает файл, маппит его в Java
 * объекты, с помощью jacksonmapper и выводит массив в консоль.
 * в build.gradle в разделе dependic.. указать implementation("com.fasterxml.jackson.core:jackson-databind:2.14.0"),
 * чтобы сказать гредл
 */

package lesson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TaskFive {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        //downloadFile(args[0]);
        ObjectMapper objectMapper = new ObjectMapper();
        List<PhoneBook> myObject = Arrays.asList(objectMapper.readValue(Paths.get("src/main/resources/ph.json").toFile(), PhoneBook[].class));
        System.out.println(myObject);

    }

    public static void downloadFile(String sourceUrl) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(sourceUrl)).GET().build();
        String fileName = sourceUrl.substring(sourceUrl.lastIndexOf('/') + 1);

        HttpResponse<InputStream> response = client.send(httpRequest, responseInfo -> HttpResponse.BodySubscribers.ofInputStream());
        Path targetPath = new File("src/main/resources" + File.separator + fileName).toPath();
        Files.copy(response.body(), targetPath);
    }
}
