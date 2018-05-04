
import com.gmail.timurworkspace.CDPlayer;
import com.gmail.timurworkspace.CDPlayerConfig;
import com.gmail.timurworkspace.CompactDisc;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    private static final Logger logger = Logger.getLogger(CDPlayerTest.class);


    @Autowired
    private CompactDisc disc;

    @Autowired
    private CDPlayer player;

    @Test
    public void cdShouldBeNotNull(){
        logger.info("Check disc");
        assertNotNull(disc);
    }

    @Test
    public void cdPlayerShouldBeNotNull(){
        logger.info("Check CDPlayer");
        assertNotNull(player);
    }


    @Test
    public void testPlay(){
        player.play();
        logger.info(player.getCorrectSong());
        assertEquals(
                disc.play(),
                player.getCorrectSong());
    }
}
