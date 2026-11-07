package G9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p120l9.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends AbstractC0813f2 {
    public static i a0(Iterator it) {
        p251z9.j.e(it, "<this>");
        return new a(new l(0, it));
    }

    public static i b0(Object obj, p241y9.c cVar) {
        return obj == null ? e.f2924a : new g(new B3.f(1, obj), cVar, 2);
    }

    public static String c0(i iVar, String str) {
        p251z9.j.e(iVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : iVar) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) str);
            }
            p017b7.g.I(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object d0(i iVar) {
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static List e0(i iVar) {
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            return r.f19440r;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0813f2.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
