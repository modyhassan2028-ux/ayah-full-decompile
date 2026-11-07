package j$.util.stream;

import j$.util.C1076q;
import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class Y1 extends AbstractC1116h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18395b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1078a f18398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(U u8, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18398e = u8;
        InterfaceC1136l2 interfaceC1136l3 = this.f18474a;
        Objects.requireNonNull(interfaceC1136l3);
        this.f18397d = new j$.util.J(interfaceC1136l3, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(r rVar, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18398e = rVar;
        InterfaceC1136l2 interfaceC1136l3 = this.f18474a;
        Objects.requireNonNull(interfaceC1136l3);
        this.f18397d = new j$.util.F(interfaceC1136l3, 1);
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        switch (this.f18395b) {
            case 0:
                this.f18474a.c(-1L);
                break;
            case 1:
                this.f18474a.c(-1L);
                break;
            default:
                this.f18474a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.f18395b) {
            case 0:
                j$.util.N n6 = (j$.util.N) this.f18397d;
                InterfaceC1139m0 interfaceC1139m0 = (InterfaceC1139m0) ((C1076q) ((C1104f0) this.f18398e).f18468t).apply(obj);
                if (interfaceC1139m0 != null) {
                    try {
                        if (!this.f18396c) {
                            interfaceC1139m0.sequential().forEach(n6);
                        } else {
                            j$.util.c0 c0VarSpliterator = interfaceC1139m0.sequential().spliterator();
                            while (!this.f18474a.e() && c0VarSpliterator.tryAdvance((LongConsumer) n6)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC1139m0.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC1139m0 != null) {
                    interfaceC1139m0.close();
                    return;
                }
                return;
            case 1:
                j$.util.J j = (j$.util.J) this.f18397d;
                IntStream intStream = (IntStream) ((C1076q) ((U) this.f18398e).f18372t).apply(obj);
                if (intStream != null) {
                    try {
                        if (!this.f18396c) {
                            intStream.sequential().forEach(j);
                        } else {
                            j$.util.Z zSpliterator = intStream.sequential().spliterator();
                            while (!this.f18474a.e() && zSpliterator.tryAdvance((IntConsumer) j)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.F f3 = (j$.util.F) this.f18397d;
                C c10 = (C) ((C1076q) ((r) this.f18398e).f18530t).apply(obj);
                if (c10 != null) {
                    try {
                        if (!this.f18396c) {
                            c10.sequential().forEach(f3);
                        } else {
                            j$.util.W wSpliterator = c10.sequential().spliterator();
                            while (!this.f18474a.e() && wSpliterator.tryAdvance((DoubleConsumer) f3)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            c10.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (c10 != null) {
                    c10.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        switch (this.f18395b) {
            case 0:
                this.f18396c = true;
                break;
            case 1:
                this.f18396c = true;
                break;
            default:
                this.f18396c = true;
                break;
        }
        return this.f18474a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(C1104f0 c1104f0, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18398e = c1104f0;
        InterfaceC1136l2 interfaceC1136l3 = this.f18474a;
        Objects.requireNonNull(interfaceC1136l3);
        this.f18397d = new j$.util.N(interfaceC1136l3, 1);
    }
}
