package p120l9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Collection;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends AbstractC0813f2 {
    public static int a0(Iterable iterable, int i10) {
        j.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static ArrayList b0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m.d0(arrayList2, (Iterable) obj);
        }
        return arrayList2;
    }
}
