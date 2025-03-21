/*
 * @ {#} CompositePatternDemo.java   1.0     3/21/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package folderMangegement_Composite;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/21/2025
 * @version:    1.0
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        //Tạo tập tin
        File file = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        File file3 = new File("file3.txt", 300);
        //Tạo thư mục
        Folder root = new Folder("Root");
        Folder subFolder = new Folder("Documents");
        //Thêm tập tin vào thư mục
        subFolder.addComponent(file);
        subFolder.addComponent(file2);
        root.addComponent(file3);
        //Thêm thư mục vào thư mục
        root.addComponent(subFolder);
        //Hiển thị thông tin thư mục
        root.showInfo();
    }
}

