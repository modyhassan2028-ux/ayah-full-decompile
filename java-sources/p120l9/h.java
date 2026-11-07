package p120l9;

import A9.d;
import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractSet implements Set, d {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
