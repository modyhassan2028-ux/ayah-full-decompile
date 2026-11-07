package p251z9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements g, Serializable {
    private final int arity;

    public k(int i10) {
        this.arity = i10;
    }

    @Override // p251z9.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        w.f24887a.getClass();
        String strA = x.a(this);
        j.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
