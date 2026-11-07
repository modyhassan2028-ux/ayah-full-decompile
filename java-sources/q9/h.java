package q9;

import p251z9.j;
import p251z9.w;
import p251z9.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements p251z9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f21351r;

    public h(int i10, p150o9.c cVar) {
        super(cVar);
        this.f21351r = i10;
    }

    @Override // p251z9.g
    public final int getArity() {
        return this.f21351r;
    }

    @Override // q9.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f24887a.getClass();
        String strA = x.a(this);
        j.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
