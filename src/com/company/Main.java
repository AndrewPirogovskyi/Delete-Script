package com.company;

import java.io.File;

class Main {
    public static void main(String[] args) {
        // Path to the file you want to delete
        String FilePath = "E:/Games/Steam/steamapps/common/Deep Rock Galactic/FSD/Saved/Config/WindowsNoEditor/GameUserSettings.ini";

        // Create a File object for the file to be deleted
        File object = new File(FilePath);

        try {
            if(object.delete()) {
                System.out.println("The File: " + object.getName() + " has been deleted.");
            } else {
                System.out.println("Failed to delete the" + object.getName() + ".");
            }
        } catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
