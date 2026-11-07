package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1144n0 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC1173t0 f18507b;

    public /* synthetic */ C1144n0(EnumC1173t0 enumC1173t0, int i10) {
        this.f18506a = i10;
        this.f18507b = enumC1173t0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f18506a) {
            case 0:
                return new C1159q0(this.f18507b);
            case 1:
                return new C1154p0(this.f18507b);
            default:
                return new C1163r0(this.f18507b);
        }
    }
}
