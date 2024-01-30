package omnivore.bookmark.service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.translate.AmazonTranslate;
import com.amazonaws.services.translate.AmazonTranslateClientBuilder;
import com.amazonaws.services.translate.model.TranslateTextRequest;
import com.amazonaws.services.translate.model.TranslateTextResult;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TranslateService {
    @Value("${aws.accessKey}")
    private String accessKey;
    @Value("${aws.secretKey}")
    private String secretKey;
    @Value("${aws.region}")
    private String region;
    private AmazonTranslate client;

    @PostConstruct
    public void init() {
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);

        client = AmazonTranslateClientBuilder
                .standard()
                .withRegion(region)
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .build();
    }

    public String translate(String text, String sourceLang, String targetLang) {
        TranslateTextRequest request = new TranslateTextRequest()
                .withText(text)
                .withSourceLanguageCode(sourceLang)
                .withTargetLanguageCode(targetLang);
        try {
            TranslateTextResult result = client.translateText(request);
            return result.getTranslatedText();
        } catch (Exception e) {
        }
        return null;
    }

}
