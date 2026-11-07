package v9;

import H9.o;
import java.io.File;
import p181s2.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends r {
    public static void f(File file) {
        G9.f fVar = new G9.f(new G9.g(file), (char) 0);
        while (true) {
            boolean z10 = true;
            while (fVar.hasNext()) {
                File file2 = (File) fVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
            return;
        }
    }

    public static String g(File file) {
        j.e(file, "<this>");
        String name = file.getName();
        j.d(name, "getName(...)");
        int iG1 = o.g1(name, '.', 0, 6);
        if (iG1 == -1) {
            return "";
        }
        String strSubstring = name.substring(iG1 + 1, name.length());
        j.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
