package i7;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: i7.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1035y0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B0 f17695e;

    public /* synthetic */ CallableC1035y0(B0 b5, String str, String str2, String str3, int i10) {
        this.f17691a = i10;
        this.f17692b = str;
        this.f17693c = str2;
        this.f17694d = str3;
        this.f17695e = b5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17691a) {
            case 0:
                B0 b5 = this.f17695e;
                b5.f16830f.B();
                C0999m c0999m = b5.f16830f.f17106t;
                Q1.U(c0999m);
                return c0999m.k0(this.f17692b, this.f17693c, this.f17694d);
            case 1:
                B0 b10 = this.f17695e;
                b10.f16830f.B();
                C0999m c0999m2 = b10.f16830f.f17106t;
                Q1.U(c0999m2);
                return c0999m2.k0(this.f17692b, this.f17693c, this.f17694d);
            case 2:
                B0 b11 = this.f17695e;
                b11.f16830f.B();
                C0999m c0999m3 = b11.f16830f.f17106t;
                Q1.U(c0999m3);
                return c0999m3.o0(this.f17692b, this.f17693c, this.f17694d);
            default:
                B0 b12 = this.f17695e;
                b12.f16830f.B();
                C0999m c0999m4 = b12.f16830f.f17106t;
                Q1.U(c0999m4);
                return c0999m4.o0(this.f17692b, this.f17693c, this.f17694d);
        }
    }
}
