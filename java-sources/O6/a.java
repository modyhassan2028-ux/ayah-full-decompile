package O6;

import B6.c;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f6498a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f6499b;

    static {
        HashMap map = new HashMap();
        f6499b = map;
        map.put(c.f644r, 0);
        map.put(c.f645s, 1);
        map.put(c.f646t, 2);
        for (c cVar : map.keySet()) {
            f6498a.append(((Integer) f6499b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f6499b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i10) {
        c cVar = (c) f6498a.get(i10);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(p123m2.c.r(i10, "Unknown Priority for value "));
    }
}
