import java.util.Random;
import java.util.Scanner;

/**
 * Util
 */
public abstract class Util {
    public static Random ran = new Random();
    public static Scanner sc = new Scanner(System.in); 
    public static void arrayToString(int[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(String[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(double[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(boolean[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(byte[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(short[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(float[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(char[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void arrayToString(Object[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (ar != null) {
            for (int i = 0; i < ar.length; i++) {
                if (ar.length == 0) {
                    System.out.println("[]");
                    break;
                }
                if (ar.length - 1 == i) {
                    sb.append(ar[i] + "]");
                    break;
                }
                sb.append(ar[i] + ", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("null");
        }
    }
    public static void sortAsc(int[] ar) {
        int aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortDesc(int[] ar) {
        int aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortAsc(float[] ar) {
        float aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortDesc(float[] ar) {
        float aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortAsc(double[] ar) {
        double aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortDesc(double[] ar) {
        double aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortAsc(byte[] ar) {
        byte aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortDesc(byte[] ar) {
        byte aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortAsc(short[] ar) {
        short aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
    public static void sortDesc(short[] ar) {
        short aux = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    aux = ar[i];
                    ar[i] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }
}
