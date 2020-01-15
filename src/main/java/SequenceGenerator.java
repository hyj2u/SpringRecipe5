import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();

    private DatePrefixGenerator dfg;

    public SequenceGenerator() {
    }

    public void setDfg(DatePrefixGenerator dfg) {
        this.dfg = dfg;
    }

    public void setPrefix(String prefix) {
        this.prefix = dfg.getPrefix();
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }
    public String getSequence(){
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append(initial).append(counter.getAndIncrement()).append(suffix);
        return builder.toString();
    }
}
