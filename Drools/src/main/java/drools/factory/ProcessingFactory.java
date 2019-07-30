package drools.factory;

/**
 * Created by prabhavathi on 2/21/17.
 */

public interface ProcessingFactory<T,V> {
    T createProcessingObject(V inputObject);
}
