import com.wxz.utils.ExcleUtil;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.File;

/**
 * ClassName:ExcleTest
 * Description:
 * Author:J-Hsitsung
 * CreateTime:2019/8/13  9:48
 */
public class ExcleTest {
    @Resource
    private ExcleUtil excleUtil;
    File file=new File('');
    @Test
   public void testExcle(){
       excleUtil.readExcel(file);
    }
}
