package p207v2;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class V extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(int i10, Object obj) {
        super(i10);
        j.e(obj, "key");
        this.f23191b = obj;
    }

    @Override // p207v2.Y
    public final Object a() {
        return this.f23191b;
    }
}
