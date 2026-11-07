package j$.util.function;

import j$.util.C1076q;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f18166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f18167c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i10) {
        this.f18165a = i10;
        this.f18166b = predicate;
        this.f18167c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f18165a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f18165a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.q(this, predicate);
    }

    public final Predicate negate() {
        switch (this.f18165a) {
            case 0:
                break;
        }
        return new C1076q(1, this);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f18165a) {
            case 0:
                return this.f18166b.test(obj) && this.f18167c.test(obj);
            default:
                return this.f18166b.test(obj) || this.f18167c.test(obj);
        }
    }
}
