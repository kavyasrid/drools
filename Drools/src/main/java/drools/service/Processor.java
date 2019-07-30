package drools.service;

/**
 * Created by kavya on 2/23/17.
 */
public interface Processor<T> {
    void process(T input);
}
