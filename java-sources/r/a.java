package r;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f21368v = new HashMap();

    @Override // r.f
    public final c b(Object obj) {
        return (c) this.f21368v.get(obj);
    }

    @Override // r.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f21368v.remove(obj);
        return objC;
    }
}
