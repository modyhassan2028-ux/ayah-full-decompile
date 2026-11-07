package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1179u1 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0 f18559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18562d;

    public C1179u1(G0 g10, Object obj, int i10) {
        this.f18561c = i10;
        this.f18559a = g10;
        this.f18560b = 0;
        this.f18562d = obj;
    }

    public C1179u1(C1179u1 c1179u1, G0 g10, int i10, byte b5) {
        super(c1179u1);
        this.f18559a = g10;
        this.f18560b = i10;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C1179u1 c1179u1A = this;
        while (c1179u1A.f18559a.o() != 0) {
            c1179u1A.setPendingCount(c1179u1A.f18559a.o() - 1);
            int i10 = 0;
            int iCount = 0;
            while (i10 < c1179u1A.f18559a.o() - 1) {
                C1179u1 c1179u1A2 = c1179u1A.a(i10, c1179u1A.f18560b + iCount);
                iCount = (int) (c1179u1A2.f18559a.count() + ((long) iCount));
                c1179u1A2.fork();
                i10++;
            }
            c1179u1A = c1179u1A.a(i10, c1179u1A.f18560b + iCount);
        }
        switch (c1179u1A.f18561c) {
            case 0:
                ((F0) c1179u1A.f18559a).f(c1179u1A.f18560b, c1179u1A.f18562d);
                break;
            default:
                c1179u1A.f18559a.k((Object[]) c1179u1A.f18562d, c1179u1A.f18560b);
                break;
        }
        c1179u1A.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1179u1(C1179u1 c1179u1, G0 g10, int i10) {
        this(c1179u1, g10, i10, (byte) 0);
        this.f18561c = 1;
        this.f18562d = (Object[]) c1179u1.f18562d;
    }

    public final C1179u1 a(int i10, int i11) {
        switch (this.f18561c) {
            case 0:
                return new C1179u1(this, ((F0) this.f18559a).a(i10), i11);
            default:
                return new C1179u1(this, this.f18559a.a(i10), i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1179u1(C1179u1 c1179u1, F0 f3, int i10) {
        this(c1179u1, f3, i10, (byte) 0);
        this.f18561c = 0;
        this.f18562d = c1179u1.f18562d;
    }
}
