package p050e8;

import E6.u;
import K9.AbstractC0405x;
import java.util.concurrent.Executor;
import p091i8.a;
import p091i8.b;
import p091i8.d;
import p100j8.c;
import p100j8.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f15851s = new g(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f15852t = new g(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f15853u = new g(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f15854v = new g(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15855r;

    public /* synthetic */ g(int i10) {
        this.f15855r = i10;
    }

    @Override // p100j8.c
    public final Object c(u uVar) {
        switch (this.f15855r) {
            case 0:
                Object objE = uVar.e(new p(a.class, Executor.class));
                j.d(objE, "get(...)");
                return AbstractC0405x.n((Executor) objE);
            case 1:
                Object objE2 = uVar.e(new p(p091i8.c.class, Executor.class));
                j.d(objE2, "get(...)");
                return AbstractC0405x.n((Executor) objE2);
            case 2:
                Object objE3 = uVar.e(new p(b.class, Executor.class));
                j.d(objE3, "get(...)");
                return AbstractC0405x.n((Executor) objE3);
            default:
                Object objE4 = uVar.e(new p(d.class, Executor.class));
                j.d(objE4, "get(...)");
                return AbstractC0405x.n((Executor) objE4);
        }
    }
}
