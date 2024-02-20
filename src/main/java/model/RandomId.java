package model;

import static java.util.UUID.randomUUID;

public class RandomId {
    public String userIdGenerator(){
        return randomUUID().toString().replace("-", "").substring(0, 8);
    }
}
