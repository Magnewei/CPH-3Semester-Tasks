package Torsdag.TaskFour;

public interface DataStorage<T> {
    String store(T data); // return a unique ID for the stored data or the filename
    T retrieve(String source); // return the data stored at the source
}
