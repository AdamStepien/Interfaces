package com.company;

import java.util.ArrayList;

public interface ISavable {
    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
}
