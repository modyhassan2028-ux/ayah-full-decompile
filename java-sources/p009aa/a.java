package p009aa;

import H9.v;
import p110k9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f11233a;

    static {
        Object objB;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            j.d(property, "getProperty(...)");
            objB = v.S0(property);
        } catch (Throwable th) {
            objB = p110k9.a.b(th);
        }
        if (objB instanceof l) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f11233a = num != null ? num.intValue() : 2097152;
    }
}
