import com.sliu.base.oop.statics.Chinese;
import org.junit.jupiter.api.Test;

public class TestOop {
    @Test
    public void TestStatic(){
        Chinese c = new Chinese();
        c.setName("张三");
        Chinese c1 = new Chinese();
        System.out.println(c1.getName());
    }
    @Test
    public void TestInteger(){
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
