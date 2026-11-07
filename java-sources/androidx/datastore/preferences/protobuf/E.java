package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f12377b = new r(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12378a;

    public E(C0737k c0737k) {
        AbstractC0748w.a(c0737k, "output");
        this.f12378a = c0737k;
        c0737k.f12479d = this;
    }

    public void a(int i10, Object obj, W w9) {
        C0737k c0737k = (C0737k) this.f12378a;
        c0737k.s0(i10, 3);
        w9.c((AbstractC0727a) obj, c0737k.f12479d);
        c0737k.s0(i10, 4);
    }

    public E() {
        K k7;
        T t2 = T.f12406c;
        try {
            k7 = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            k7 = f12377b;
        }
        K[] kArr = {r.f12498b, k7};
        D d5 = new D();
        d5.f12376a = kArr;
        Charset charset = AbstractC0748w.f12518a;
        this.f12378a = d5;
    }
}
