
import com.gmail.timurworkspace.CDPlayerConfig;
import com.gmail.timurworkspace.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)

public class CDPlayerTest {

    @Autowired
    private CompactDisc disc;

    @Test
    public void cdShouldMotBeNull(){
        assertNotNull(disc);
    }
}
