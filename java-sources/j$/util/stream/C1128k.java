package j$.util.stream;

import j$.util.C1076q;
import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1128k extends AbstractC1116h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18488b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18490d;

    public /* synthetic */ C1128k(InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128k(H3 h7, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18490d = h7;
        this.f18489c = true;
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        switch (this.f18488b) {
            case 0:
                this.f18489c = false;
                this.f18490d = null;
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
        switch (this.f18488b) {
            case 0:
                InterfaceC1136l2 interfaceC1136l2 = this.f18474a;
                if (obj == null) {
                    if (this.f18489c) {
                        return;
                    }
                    this.f18489c = true;
                    this.f18490d = null;
                    interfaceC1136l2.n((Object) null);
                    return;
                }
                Object obj2 = this.f18490d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f18490d = obj;
                    interfaceC1136l2.n(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C1076q) ((C1158q) this.f18490d).f18524t).apply(obj);
                if (stream != null) {
                    try {
                        boolean z10 = this.f18489c;
                        InterfaceC1136l2 interfaceC1136l3 = this.f18474a;
                        if (!z10) {
                            ((Stream) stream.sequential()).forEach(interfaceC1136l3);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC1136l3.e() && spliterator.tryAdvance(interfaceC1136l3)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f18489c) {
                    boolean zTest = ((H3) this.f18490d).f18273t.test(obj);
                    this.f18489c = zTest;
                    if (zTest) {
                        this.f18474a.n(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public boolean e() {
        switch (this.f18488b) {
            case 1:
                this.f18489c = true;
                return this.f18474a.e();
            case 2:
                return !this.f18489c || this.f18474a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public void end() {
        switch (this.f18488b) {
            case 0:
                this.f18489c = false;
                this.f18490d = null;
                this.f18474a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128k(C1158q c1158q, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18490d = c1158q;
    }
}
