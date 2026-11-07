package p120l9;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    public static void c0(List list, Comparator comparator) {
        j.e(list, "<this>");
        j.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
