package com.indyukov.piano.http.requests;

import com.indyukov.piano.http.model.Page;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;

@Component
public class GetPageImpl {

    private static final Logger logger = Logger.getLogger(GetPageImpl.class);

    @Value("${rest.url}")
    private String url;
    @Value("${site.url}")
    private String address;

    public Page get(String title, int pageNumber){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetPage getPage = retrofit.create(GetPage.class);
        Page page = null;
        try {
            page = getPage.get(pageNumber, title, address).execute().body();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return page;
    }
}
