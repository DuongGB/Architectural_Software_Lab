/*
 * @ {#} File.java   1.0     3/21/2025
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
// B2: Triển khai lớp File (Leaf)
public class File implements FileSystemComponent{
    private String name;
    private double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name + ", size: " + size + " KB");
    }
}

