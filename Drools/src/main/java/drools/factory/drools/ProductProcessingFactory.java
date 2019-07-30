package drools.factory.drools;

import drools.factory.ProcessingFactory;
import drools.model.Product;
import org.drools.runtime.StatelessKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by kavya on 2/23/17.
 */

@Component("ProductProcessingFactory")
public class ProductProcessingFactory implements ProcessingFactory<StatelessKnowledgeSession,Product>{

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public StatelessKnowledgeSession createProcessingObject(Product inputObject) {
        return (StatelessKnowledgeSession) applicationContext.getBean(inputObject.getTypeEnum().getType()+"KSession");
    }

}
