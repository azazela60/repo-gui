
public class Human implements Actions {
    private final String name;
    private final int runDistance;
    private final int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println ("Human " + this.name + " is running " + this.getRunDistance ());
    }

    @Override
    public void jump() {
        System.out.println ("Human " + this.name + " is jumping " + this.getJumpHeight ());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

}

