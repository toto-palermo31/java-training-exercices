package io.robusta.people.forum;

import java.util.List;

/**
 * Created by Robusta Code
 */
public interface Flaggable {

    // Threshold of flags that generate an email
    int AWARE_ADMIN = 3;

    boolean isFlagged();
    String[] getFlags();
    
    void addFlag(String reason);

}
