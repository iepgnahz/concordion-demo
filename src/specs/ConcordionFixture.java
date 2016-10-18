package specs;

import main.Concordion;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class ConcordionFixture {
    Concordion concordion = new Concordion();
    public String getSayHello(){
        return concordion.sayHello();
    }
    public int getSum(int a,int b){
        return concordion.sum(a,b);
    }
}
