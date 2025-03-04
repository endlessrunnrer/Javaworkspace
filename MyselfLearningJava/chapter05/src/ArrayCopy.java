public class ArrayCopy {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];   // index   0,1,2,3,4  이렇게 총 5개 공간이 있음.
        System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.println(newStrArray[i] + ", ");

        }
    }
}
