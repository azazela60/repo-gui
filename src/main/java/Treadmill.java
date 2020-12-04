
public class Treadmill extends Barrier {
    private final int length;

    public Treadmill(String name, int length) {
        super (name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println ("Treadmill " + super.getName () + " length: " + this.length);

        actions.run ();

        if (getLength () <= actions.getRunDistance ()) {
            System.out.println ("run success");

            return true;
        } else {
            System.out.println ("run unsuccessfully");

            return false;
        }
    }
}

