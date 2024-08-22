package Torsdag.TaskFour;

import java.io.*;
import java.lang.reflect.Type;

public class FileStorage<T> implements DataStorage<T> {

    @Override
    public String store(T data) {
        Type typeOf = data.getClass();
        String fileName = typeOf.toString();
        String fileSuffix = (java.time.LocalDateTime.now()).format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        fileName = fileName + fileSuffix + ".ser";

        try {
            // Initialize writer, reader and file
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);

            // Write data to file and close writer/reader
            out.writeObject(data);
            out.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    @Override
    public T retrieve(String source) {
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);

            T obj = (T) in.readObject();
            in.close();

            fileInputStream.close();
            return obj;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
