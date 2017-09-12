/**
 * Created by Teri； on 2017/9/13.
 */
import com.jinvoke.JInvoke;
import com.jinvoke.NativeImport;

public class DeskMsg {
    public class HelloWindows
    {
        @NativeImport(library="User32")
        public static native int MessageBox(int hwnd,
                                            String text,
                                            String caption,
                                            int type); //windows Api MessageBox函数原型

        public static void main(String[]argc)
        {
            JInvoke.initialize();
            MessageBox(0,"Thisi MessageBox is a native Win32 MessageBox",
                    "Hellow World",0);
        }
    }
}
