package q9;

import p251z9.j;
import p251z9.w;
import p251z9.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements p251z9.g {
    private final int arity;

    public i(int i10, p150o9.c cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // p251z9.g
    public int getArity() {
        return this.arity;
    }

    @Override // q9.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f24887a.getClass();
        String strA = x.a(this);
        j.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
