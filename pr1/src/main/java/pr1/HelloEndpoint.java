package pr1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pr1.entity.TestEntity;
import pr1.repository.TestRepository;

import java.util.Iterator;

@RestController
public class HelloEndpoint {

    private final TestRepository testRep;

    public HelloEndpoint (TestRepository testRep){
        this.testRep = testRep;
    }

    @RequestMapping("hi/hello")
    String abc(){

        TestEntity testEnt = new TestEntity();
        //testEnt.setName("Name");

        //testRep.save(testEnt);

        String text = "";

         //testEnt = null;

        Iterator<TestEntity> iterator = testRep.findByNameNotLikeAnything("Name").iterator();
        while (iterator.hasNext()){
            testEnt = iterator.next();
            text = testEnt.getId().toString() + " " + testEnt.getName() + "; ";
        }

        return text;
    }


}
