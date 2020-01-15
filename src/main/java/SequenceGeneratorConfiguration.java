import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {

    @Bean
    public DatePrefixGenerator datePrefixGenerator(){
        DatePrefixGenerator dpg = new DatePrefixGenerator();
        dpg.setPattern("yyyyMMdd");
        return dpg;
    }
    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator seqgen = new SequenceGenerator();
        seqgen.setDfg(datePrefixGenerator());
        seqgen.setSuffix("A");
        seqgen.setInitial(100000);
        return seqgen;
    }
}
