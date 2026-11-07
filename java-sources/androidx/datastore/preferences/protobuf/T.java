package androidx.datastore.preferences.protobuf;

import W.AbstractC0607v1;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T f12406c = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12408b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f12407a = new E();

    public final W a(Class cls) {
        W w9;
        Class cls2;
        AbstractC0748w.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f12408b;
        W w10 = (W) concurrentHashMap.get(cls);
        if (w10 != null) {
            return w10;
        }
        E e10 = this.f12407a;
        e10.getClass();
        Class cls3 = X.f12416a;
        if (!AbstractC0746u.class.isAssignableFrom(cls) && (cls2 = X.f12416a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V vA = ((D) e10.f12378a).a(cls);
        int i10 = vA.f12415d;
        AbstractC0727a abstractC0727a = vA.f12412a;
        if ((i10 & 2) == 2) {
            if (AbstractC0746u.class.isAssignableFrom(cls)) {
                w9 = new N(X.f12418c, AbstractC0741o.f12488a, abstractC0727a);
            } else {
                e0 e0Var = X.f12417b;
                C0740n c0740n = AbstractC0741o.f12489b;
                if (c0740n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w9 = new N(e0Var, c0740n, abstractC0727a);
            }
        } else if (AbstractC0746u.class.isAssignableFrom(cls)) {
            C0740n c0740n2 = null;
            O o10 = P.f12405b;
            B b5 = C.f12375b;
            e0 e0Var2 = X.f12418c;
            if (AbstractC0607v1.b(vA.a()) != 1) {
                c0740n2 = AbstractC0741o.f12488a;
            }
            C0740n c0740n3 = c0740n2;
            I i11 = J.f12386b;
            if (!(vA instanceof V)) {
                int[] iArr = M.f12388n;
                vA.getClass();
                throw new ClassCastException();
            }
            w9 = M.w(vA, o10, b5, e0Var2, c0740n3, i11);
        } else {
            C0740n c0740n4 = null;
            O o11 = P.f12404a;
            B b10 = C.f12374a;
            e0 e0Var3 = X.f12417b;
            if (AbstractC0607v1.b(vA.a()) != 1 && (c0740n4 = AbstractC0741o.f12489b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0740n c0740n5 = c0740n4;
            I i12 = J.f12385a;
            if (!(vA instanceof V)) {
                int[] iArr2 = M.f12388n;
                vA.getClass();
                throw new ClassCastException();
            }
            w9 = M.w(vA, o11, b10, e0Var3, c0740n5, i12);
        }
        W w11 = (W) concurrentHashMap.putIfAbsent(cls, w9);
        return w11 != null ? w11 : w9;
    }
}
