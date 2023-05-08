import java.io.*;

public class TestFile {
    public byte[] create(String s) {
        return s.getBytes();
    }

    public File createFile(String name) throws IOException {
        File f = new File("E:\\myfile");

        if (!f.isDirectory()) {
            if (!f.mkdir()) {
                System.out.println("E:\\myfile mkdir error");
            }
        }
        File file = new File(f, name);
        if (!file.exists()) {
            if (!file.createNewFile()) {
                System.out.println("file create error");
            }
        }
        if (file == null) {
            return null;
        }
        return file;

    }

    public void write(FileOutputStream fileOutputStream, String content) {
        try {

            fileOutputStream.write(create(content));
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] read(FileInputStream fileInputStream) {
        byte[] bytes = new byte[]{};
        try {
            BufferedInputStream bufferedInputStream =
                    new BufferedInputStream(fileInputStream);
            bytes = bufferedInputStream.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    public static void main(String[] args) {
        TestFile testFile = new TestFile();

        try {
            File file = testFile.createFile("test.txt");
            FileOutputStream fileOutputStream
                    = new FileOutputStream(file);
            testFile.write(fileOutputStream, "我喜欢Java");

            FileInputStream fileInputStream =
                    new FileInputStream(file);
            testFile.read(fileInputStream);

            File file1 = testFile.createFile("test2.txt");
            testFile.write(new FileOutputStream(file1), "I hate java");
            testFile.read(new FileInputStream(file1));
            file1.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
