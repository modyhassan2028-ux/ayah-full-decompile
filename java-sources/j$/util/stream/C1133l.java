package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1133l extends AbstractC1116h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1133l(AbstractC1078a abstractC1078a, InterfaceC1136l2 interfaceC1136l2, int i10) {
        super(interfaceC1136l2);
        this.f18496b = i10;
        this.f18497c = abstractC1078a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1133l(InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18496b = 0;
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public void end() {
        switch (this.f18496b) {
            case 0:
                this.f18497c = null;
                this.f18474a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public void c(long j) {
        switch (this.f18496b) {
            case 0:
                this.f18497c = new HashSet();
                this.f18474a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.f18474a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f18496b) {
            case 0:
                if (!((Set) this.f18497c).contains(obj)) {
                    ((Set) this.f18497c).add(obj);
                    this.f18474a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C1158q) this.f18497c).f18524t).accept(obj);
                this.f18474a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C1158q) this.f18497c).f18524t).test(obj)) {
                    this.f18474a.accept(obj);
                }
                break;
            case 3:
                this.f18474a.accept(((Function) ((C1158q) this.f18497c).f18524t).apply(obj));
                break;
            case 4:
                this.f18474a.accept(((ToIntFunction) ((U) this.f18497c).f18372t).applyAsInt(obj));
                break;
            case 5:
                this.f18474a.accept(((ToLongFunction) ((C1104f0) this.f18497c).f18468t).applyAsLong(obj));
                break;
            default:
                this.f18474a.accept(((ToDoubleFunction) ((r) this.f18497c).f18530t).applyAsDouble(obj));
                break;
        }
    }
}
