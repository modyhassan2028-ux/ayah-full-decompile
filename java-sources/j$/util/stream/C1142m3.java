package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1142m3 implements InterfaceC1131k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f18503b;

    public /* synthetic */ C1142m3(LongConsumer longConsumer, int i10) {
        this.f18502a = i10;
        this.f18503b = longConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        switch (this.f18502a) {
            case 0:
                AbstractC1184v1.D();
                throw null;
            default:
                AbstractC1184v1.D();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f18502a) {
            case 0:
                AbstractC1184v1.K();
                throw null;
            default:
                AbstractC1184v1.K();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1131k2, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        switch (this.f18502a) {
            case 0:
                this.f18503b.accept(j);
                break;
            default:
                ((S2) this.f18503b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.f18502a) {
            case 0:
                l((Long) obj);
                break;
            default:
                l((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18502a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f18502a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void c(long j) {
        int i10 = this.f18502a;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        switch (this.f18502a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
        int i10 = this.f18502a;
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        switch (this.f18502a) {
            case 0:
                AbstractC1184v1.I(this, l10);
                break;
            default:
                AbstractC1184v1.I(this, l10);
                break;
        }
    }
}
