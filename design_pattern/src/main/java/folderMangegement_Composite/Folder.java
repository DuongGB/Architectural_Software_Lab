/*
 * @ {#} Folder.java   1.0     3/21/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package folderMangegement_Composite;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/21/2025
 * @version:    1.0
 */
// B3: Triển khai lớp Folder (Composite)
public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components=new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component){
        components.remove(component);
    }

    @Override
    public void showInfo() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showInfo();
        }
    }
}

