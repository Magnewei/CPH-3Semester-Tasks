package Torsdag.TaskFour;

import java.util.ArrayList;
import java.util.List;

public class MemoryStorage<T> implements DataStorage<T> {
    public List<T> dataList = new ArrayList<>();

    @Override
    public String store(T data) {
        dataList.add(data);

        return String.valueOf(dataList.size()-1);
    }

    @Override
    public T retrieve(String source) {
        for(T t: dataList) {
            if(dataList.contains(source)) {
                return t;
            }
        }

        return null;
    }
}
