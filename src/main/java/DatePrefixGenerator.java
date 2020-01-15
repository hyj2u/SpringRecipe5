import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component
@Primary
public class DatePrefixGenerator implements PrefixGenerator {

    private String pattern;
    @Override
    public String getPrefix() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

        return formatter.format(new Date());
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
