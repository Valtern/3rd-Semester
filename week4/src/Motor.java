public class Motor {
    private int speed = 0;
    private boolean motorOn = false;

    public void statusPrint () {
        if (motorOn == true) {
            System.out.println("Motor cycle On");
        } else  {
            System.out.println("Motor cycle Off");
        }
        System.out.println("Speed: " + speed + "\n");


    }

    public void  startEngine() {
        motorOn = true;
    }
    public void  stopEngine() {
        motorOn = false;
    }

    public void  increaseEngine() {
        if (motorOn == true) {
            if (speed < 100) {
                speed += 5;
            } else {
                System.out.println("Reached  the maximum speed limit");
            }
        } else {
            System.out.println("Speed can't be increased because motor off");
        }
    }

    public void  reduceEngine() {
        if (motorOn == true) {
            speed -= 5;
        } else {
            System.out.println("Motor cycle Off");
        }
    }


}
