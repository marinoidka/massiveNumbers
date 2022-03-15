package pro.learnup.javaqa.group2.chernykh2;

import java.util.Arrays;

public class Addition {

    public static boolean isGreenLight = false;

    private static int maxSpeed = 7;

    public static int droppedOut(int[] speeds) {
        int start = 0;
        if (isGreenLight == false) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    start++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed < 0) {
                    start++;
                }
            }
        }
        return start;
    }

    public static int[] speedDroppedOut(int[] speeds) {
        int cnt = 0;
        if (isGreenLight == false) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    cnt++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed < 0) {
                    cnt++;
                }
            }
        }
        int[] second = new int[cnt];
        int i = 0;
        if (isGreenLight == false) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    second[i] = speed;
                    i++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed < 0) {
                    second[i] = speed;
                    i++;
                }
            }
        }
        return second;
    }

    public static int[] speedStayedIn(int[] speeds) {
        int cnt = 0;
        if (isGreenLight == false) {
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed >= 0) {
                    cnt++;
                }
            }
        }
        int[] third = new int[cnt];
        int i = 0;
        if (isGreenLight == false) {
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    third[i] = speed;
                    i++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed >= 0) {
                    third[i] = speed;
                    i++;
                }
            }
        }
        return third;
    }


}


