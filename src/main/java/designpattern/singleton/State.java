package designpattern.singleton;

enum State {
    ALIVE("살아있음"),
    DEAD("죽어있음");

    private String desc;

    State(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
