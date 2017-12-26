import com.haier.bean.Person;
import lombok.extern.log4j.Log4j;

/**
 * Created by Admin on 2017/12/26.
 */

@Log4j
public class LombokTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(12);
        person.setName("testLombok");
        log.debug(person);
    }

}
