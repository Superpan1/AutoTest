import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;


public class MyHttpClient {
    private CookieStore cookieStore;
    @Test
    public void test1() throws IOException {
        String result;
        HttpGet get=new HttpGet("http://localhost:8080/getcookies");
        HttpClient client=new DefaultHttpClient();
        HttpResponse reponse=client.execute(get);
        result= EntityUtils.toString(reponse.getEntity(),"utf-8");
        System.out.println(result);

        //获取cookie信息
        CookieStore store=((DefaultHttpClient) client).getCookieStore();
        List<Cookie> cookieList=store.getCookies();
        for (Cookie cookie : cookieList) {
            String name=cookie.getName();
            String value=cookie.getValue();
            System.out.println("cookie name:"+name+" ; cookie value:"+value);
        }
        //拿到cookie信息之后再访问
    }

}
